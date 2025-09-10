package com.muhammetakduman.starter.controller.impl;

import com.muhammetakduman.starter.entitiy.RootEntitiy;

public class RestBaseController {

    public <T> RootEntitiy<T> ok(T data){
        return RootEntitiy.ok(data);
    }

    public <T> RootEntitiy<T> error(String errorMessage){
        return RootEntitiy.error(errorMessage);
    }

}
