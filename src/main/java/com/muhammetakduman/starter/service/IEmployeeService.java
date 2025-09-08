package com.muhammetakduman.starter.service;

import com.muhammetakduman.starter.dto.DtoEmployee;
import com.muhammetakduman.starter.entitiy.Employee;

public interface IEmployeeService {
    public DtoEmployee findEmployeeById(Long id);

}
