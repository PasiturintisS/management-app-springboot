package com.springboot.springboot.Department.service;

import com.springboot.springboot.Department.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> getDepartmentList();

    Department getDepartmentById(Long departmentid);

    void deleteDepartmentById(Long departmentid);

    Department updateDepartment(Long departmentid, Department department);

    Department getDepartmentByName(String departmentName);

    Department getDepartmentByNameIgnoreCase(String departmentName);
}
