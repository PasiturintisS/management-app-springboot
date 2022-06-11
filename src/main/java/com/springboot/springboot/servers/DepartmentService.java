package com.springboot.springboot.servers;

import com.springboot.springboot.entities.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> getDepartmentList();
}
