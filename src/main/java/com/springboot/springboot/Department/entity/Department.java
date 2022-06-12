package com.springboot.springboot.Department.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    // surasomas anotacijos/kriterijai kuriuos tures atitikti departmentName laukas
    // daugiau informacijos apie hibernate validatoriu rasi cia:
    // https://bushansirgur.in/spring-boot-validation-using-hibernate-validator/
    @NotBlank(message = "Please add department name !")
    private String departmentName;
    private String departmentAddress;
    private String getDepartmentCode;

    public Department() {
    }

    public Department(Long departmentId, String departmentName, String departmentAddress, String getDepartmentCode) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
        this.getDepartmentCode = getDepartmentCode;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public String getGetDepartmentCode() {
        return getDepartmentCode;
    }

    public void setGetDepartmentCode(String getDepartmentCode) {
        this.getDepartmentCode = getDepartmentCode;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentAddress='" + departmentAddress + '\'' +
                ", getDepartmentCode='" + getDepartmentCode + '\'' +
                '}';
    }
}
