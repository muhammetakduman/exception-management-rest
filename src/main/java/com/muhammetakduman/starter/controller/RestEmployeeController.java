package com.muhammetakduman.starter.controller;

import com.muhammetakduman.starter.dto.DtoEmployee;

public interface RestEmployeeController {
    public DtoEmployee findEmployeeById(Long id);
}
