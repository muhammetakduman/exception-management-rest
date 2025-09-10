package com.muhammetakduman.starter.controller;

import com.muhammetakduman.starter.dto.DtoEmployee;
import com.muhammetakduman.starter.entitiy.RootEntitiy;

public interface RestEmployeeController {
    public RootEntitiy<DtoEmployee> findEmployeeById(Long id);
}
