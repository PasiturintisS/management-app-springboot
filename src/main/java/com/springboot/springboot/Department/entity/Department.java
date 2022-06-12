package com.springboot.springboot.Department.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
// implementuoja builder pattern daugiau info apie pattern rasi cia:
// Java builder
// https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/
// Lombok builder
// https://howtodoinjava.com/lombok/lombok-builder-annotation/
@Builder
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
}
