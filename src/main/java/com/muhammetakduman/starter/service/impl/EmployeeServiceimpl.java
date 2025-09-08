package com.muhammetakduman.starter.service.impl;

import com.muhammetakduman.starter.dto.DtoDepartment;
import com.muhammetakduman.starter.dto.DtoEmployee;
import com.muhammetakduman.starter.entitiy.Department;
import com.muhammetakduman.starter.entitiy.Employee;
import com.muhammetakduman.starter.repository.EmployeeRepository;
import com.muhammetakduman.starter.service.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceimpl implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public DtoEmployee findEmployeeById(Long id) {
        DtoEmployee dtoEmployee = new DtoEmployee();
        DtoDepartment dtoDepartment = new DtoDepartment();

        Optional<Employee> optional = employeeRepository.findById(id);
        if (optional.isEmpty()){
            return null;
        }
        Employee employee = optional.get();
        Department department =  employee.getDepartment();

        BeanUtils.copyProperties(employee , dtoEmployee);
        BeanUtils.copyProperties(department,dtoDepartment);

        dtoEmployee.setDepartment(dtoDepartment);
        return dtoEmployee;

    }
}
