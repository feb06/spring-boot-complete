package com.kwikr.department.service;

import com.kwikr.department.entity.Department;
import com.kwikr.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    public Department saveDepartment(Department department) {
        log.info("Service Save Department "+department.toString());
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long id) {
        log.info("Service Find Department "+id);
        return departmentRepository.findById(id).orElseThrow(() -> new RuntimeException("Department not found with id = "+id));
    }
}
