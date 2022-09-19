package com.spring.service;

import java.util.List;

import com.spring.entity.Department;

public interface DepartmentService {

	
    // Save operation
    Department saveDepartment(Department department);
 
    // Read operation
    List<Department> fetchDepartmentList();
 
    // Update operation
    Department updateDepartment(Department department,
                                Long departmentId);
 
    // Delete operation
    void deleteDepartmentById(Long departmentId);
	
}
