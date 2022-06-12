package com.springboot.springboot.Department.controller;

import com.springboot.springboot.Department.entity.Department;
import com.springboot.springboot.Department.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> getDepartmentList(){
        return departmentService.getDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentid){
        return departmentService.getDepartmentById(departmentid);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentid){
        departmentService.deleteDepartmentById(departmentid);
        return "Department Deleted Successfully";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentid, @RequestBody Department department){
        return departmentService.updateDepartment(departmentid, department);
    }

    @GetMapping("/departments/name/{name}")
    public Department getDepartmentByName(@PathVariable("name") String departmentName) {
        // DepartmentRepo interfeise sukurtas metodas findByDepartmentName(String departmentName) nereikia aprasyti
        // papildomos logikos jei norima kaska surasti is @Entity objekto uztenka  findBy<vienas is enticio lauku vardu>
        // ir spring bootas duos pagal varda rezultatus tik po findBy turi buti tokiu paciu pavadinimu kaip laukai entity
        // objekte. Veikia ir sukitais JPARepository metodais. pavadinimas turi tiksliai atitikti pavadinima to ko ieskom.

        // Daugiau info ir galimus metodus rasi cia:
        // https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
        // 5. Reference Documentation -> 5.1.3 Query Methods -> Query Creation
        return departmentService.getDepartmentByNameIgnoreCase(departmentName);
    }
}
