package com.muhammetakduman.starter.handle;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Exception<E> {
    private String hostName;
    private String path;
    private Date creatTime;
    private E message;
}
