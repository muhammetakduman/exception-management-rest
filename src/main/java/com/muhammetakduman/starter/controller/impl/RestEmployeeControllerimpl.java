package com.muhammetakduman.starter.controller.impl;


import com.muhammetakduman.starter.controller.RestEmployeeController;
import com.muhammetakduman.starter.dto.DtoEmployee;
import com.muhammetakduman.starter.service.IEmployeeService;
import com.muhammetakduman.starter.service.impl.EmployeeServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/api/employee")
public class RestEmployeeControllerimpl implements RestEmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/list/{id}")
    @Override
    public DtoEmployee findEmployeeById(@PathVariable(value = "id") Long id) {
        return employeeService.findEmployeeById(id);
    }
}
