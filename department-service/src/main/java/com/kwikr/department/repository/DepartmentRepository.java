package com.kwikr.department.repository;

import com.kwikr.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
