package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.entity.Department;

@Repository // indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
