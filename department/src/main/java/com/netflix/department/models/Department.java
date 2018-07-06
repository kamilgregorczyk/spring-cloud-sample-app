package com.netflix.department.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private Long id;
    private Long organizationId;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Department(Long organizationId, String name) {
        super();
        this.organizationId = organizationId;
        this.name = name;
    }
}
