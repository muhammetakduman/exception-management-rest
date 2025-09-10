package com.muhammetakduman.starter.entitiy;


import com.muhammetakduman.starter.exception.MessageType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RootEntitiy<T> {

    private boolean result;
    private String errorMessage;
    private T data;

    public static  <T> RootEntitiy<T> ok(T data){
        RootEntitiy<T> rootEntitiy = new RootEntitiy<>();
        rootEntitiy.setData(data);
        rootEntitiy.setResult(true);
        rootEntitiy.setErrorMessage(null);
        return rootEntitiy;
    }

    public static  <T> RootEntitiy<T> error(String errorMessage){
        RootEntitiy<T> rootEntitiy = new RootEntitiy<>();
        rootEntitiy.setData(null);
        rootEntitiy.setResult(false);
        rootEntitiy.setErrorMessage(errorMessage);
        return rootEntitiy;
    }
}
