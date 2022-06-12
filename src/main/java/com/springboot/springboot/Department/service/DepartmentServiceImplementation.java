package com.springboot.springboot.Department.service;

import com.springboot.springboot.Department.entity.Department;
import com.springboot.springboot.Department.exceptionhandling.DepartmentNotFoundException;
import com.springboot.springboot.Department.repository.DepartmentRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
    public Department getDepartmentById(Long departmentId) throws DepartmentNotFoundException {
        Optional<Department> department = departmentRepo.findById(departmentId);
        if(!department.isPresent()){
            throw new DepartmentNotFoundException("Department don't exists !");
        }

        return department.get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepo.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
        Department depDB = departmentRepo.findById(departmentId).get();

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

    // case sensitive
    @Override
    public Department getDepartmentByName(String departmentName) {
        return departmentRepo.findByDepartmentName(departmentName);
    }

    // ignore case
    @Override
    public Department getDepartmentByNameIgnoreCase(String departmentName) {
        return departmentRepo.findByDepartmentNameIgnoreCase(departmentName);
    }
}
