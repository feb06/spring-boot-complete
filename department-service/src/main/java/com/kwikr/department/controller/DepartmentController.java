package com.kwikr.department.controller;

import com.kwikr.department.entity.Department;
import com.kwikr.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Department controller "+department.toString());
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable Long id){
        log.info("Department find "+id);
        return departmentService.findDepartmentById(id);
    }


}
