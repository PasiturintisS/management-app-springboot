package com.springboot.springboot.Department.repository;

import com.springboot.springboot.Department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {
    Department findByDepartmentName(String departmentName);

    Department findByDepartmentNameIgnoreCase(String departmentName);

    // pavyzdys naudojant SQL nativeQuery rasti department pagal varda.
    /*
     // value = Query kuri norim executint.
    // nativeQuery nurodo kad tai native SQL query by default buna false.
    // ?1 yra musu path variable.
//    @Query(value = "SELECT * FROM DEPARTMENT  WHERE UPPER(DEPARTMENT.DEPARTMENT_NAME) = UPPER(?1)", nativeQuery = true)
//    Department findByDepartmentNameIgnoreCaseUsingNativeQuery(String departmentName);
     */


}
