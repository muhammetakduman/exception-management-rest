package com.muhammetakduman.starter.dto;

import com.muhammetakduman.starter.entitiy.Department;
import lombok.Data;

@Data
public class DtoEmployee {
    private Long id;
    private String name;
    private DtoDepartment department;
}
