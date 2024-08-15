package com.example.EmployeeManagementSystem.projection;

import org.springframework.beans.factory.annotation.Value;

public interface EmployeeProjection {

    String getName();

    @Value("#{target.department.name}")
    String getDepartmentName();
}
