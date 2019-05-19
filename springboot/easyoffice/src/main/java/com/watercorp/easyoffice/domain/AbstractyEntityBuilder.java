package com.watercorp.easyoffice.domain;

public abstract class AbstractyEntityBuilder<T, B extends AbstractyEntityBuilder> {

    protected T entity;

    public AbstractyEntityBuilder(T entity) {
        this.entity = entity;
    }

    protected void beforeValidate(){
    }

    protected void afterValidate(){
    }

    protected void validate(){
        //Implementar validação
    }

    public T build(){
        beforeValidate();
        validate();
        afterValidate();
        return entity;
    }
}