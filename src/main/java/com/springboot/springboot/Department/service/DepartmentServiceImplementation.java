package com.springboot.springboot.Department.service;

import com.springboot.springboot.Department.entity.Department;
import com.springboot.springboot.Department.repository.DepartmentRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImplementation implements DepartmentService {

    private DepartmentRepo departmentRepo;

    public DepartmentServiceImplementation(DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepo.save(department);
    }

    @Override
    public List<Department> getDepartmentList() {
        return departmentRepo.findAll();
    }

    @Override
    public Department getDepartmentById(Long departmentid) {
        return departmentRepo.findById(departmentid).get();
    }

    @Override
    public void deleteDepartmentById(Long departmentid) {
        departmentRepo.deleteById(departmentid);
    }

    @Override
    public Department updateDepartment(Long departmentid, Department department) {
        Department depDB = departmentRepo.findById(departmentid).get();

        boolean checkName = Objects.nonNull(department.getDepartmentName()) &&
                !"".equalsIgnoreCase(department.getDepartmentName());
        boolean checkAddress = Objects.nonNull(department.getDepartmentAddress()) &&
                !"".equalsIgnoreCase(department.getDepartmentAddress());
        boolean checkCode = Objects.nonNull(department.getGetDepartmentCode()) &&
                !"".equalsIgnoreCase(department.getGetDepartmentCode());

        if(checkName){
            depDB.setDepartmentName(department.getDepartmentName());
        }

        if(checkAddress){
            depDB.setDepartmentAddress(department.getDepartmentAddress());
        }

        if(checkCode){
            depDB.setGetDepartmentCode(department.getGetDepartmentCode());
        }

        return departmentRepo.save(depDB);
    }


}
