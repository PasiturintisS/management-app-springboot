package com.springboot.springboot.servers;

import com.springboot.springboot.entities.Department;
import com.springboot.springboot.repositories.DepartmentRepo;
import org.springframework.stereotype.Service;

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
}
