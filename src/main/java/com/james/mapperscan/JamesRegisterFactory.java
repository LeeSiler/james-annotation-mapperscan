package com.james.mapperscan;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

public class JamesRegisterFactory implements FactoryBean {

    private Class clazz;

    public JamesRegisterFactory(Class clazz){
        this.clazz=clazz;
    }
    @Override
    public Object getObject()  {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{CustomerService.class},
                (proxy, method, args) ->query());
    }

    @Override
    public Class<?> getObjectType() {
        return clazz;
    }

    public String query(){
        return "get result";
    }
}
