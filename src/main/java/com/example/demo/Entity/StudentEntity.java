package com.example.demo.Entity;

public class StudEntity{
    private int id;
    private String name;
    private String email;
    private int getId(){
        return id;

    }
    public void setId(int id){
        this.id = id;
    }
    public void getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
        
    }
    public StudentEntity(int id,String name;String email){
        this.id=id;
        this.name =name;
        this.email= email;
    }
    public StudentEntity(){
        
    }
}