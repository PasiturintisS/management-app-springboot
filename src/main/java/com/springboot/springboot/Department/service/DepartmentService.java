package com.springboot.springboot.Department.service;

import com.springboot.springboot.Department.entity.Department;
import com.springboot.springboot.Department.exceptionhandling.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> getDepartmentList();

    Department getDepartmentById(Long departmentid) throws DepartmentNotFoundException;

    void deleteDepartmentById(Long departmentid);

    Department updateDepartment(Long departmentid, Department department);

    Department getDepartmentByName(String departmentName);

    Department getDepartmentByNameIgnoreCase(String departmentName);
}
