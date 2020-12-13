package io.swagger.api.impl;

import java.util.List;

public class Estancia {
    private String id;
    private String change;
    private float temp;
    private boolean status;
    private List<String> users;
    private float newTemp;

    
    public Estancia(String id, String change, float temp, boolean status, List<String> users, float newTemp){
        this.id = id;
        this.change=change;
        this.temp=temp;
        this.status=status;
        this.users = users;
        this.newTemp=newTemp;
    }

    public String getId(){
        return this.id;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public String getChange(){
        return this.change;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getTemp(){
        return this.temp;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public List<String> getUsers(){
        return this.users;
    }

    public void setNewTemp(float newTemp) {
        this.newTemp = newTemp;
    }

    public float getNewTemp(){
        return this.newTemp;
    }
}