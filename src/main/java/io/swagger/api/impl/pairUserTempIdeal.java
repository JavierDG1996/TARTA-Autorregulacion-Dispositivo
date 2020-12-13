package io.swagger.api.impl;

public class pairUserTempIdeal{
    String user;
    float tempIdeal;

    public pairUserTempIdeal(String user, float tempIdeal){
        this.user = user;
        this.tempIdeal = tempIdeal;
    }

    public void setUser(String user){
        this.user= user;
    }

    public void setTempIdeal(float tempIdeal){
        this.tempIdeal = tempIdeal;
    }

    public String getUser(){
        return this.user;
    }

    public float getTempIdeal(){
        return this.tempIdeal;
    }
    
}