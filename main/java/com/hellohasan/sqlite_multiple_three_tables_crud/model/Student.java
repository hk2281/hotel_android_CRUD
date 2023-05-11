package com.hellohasan.sqlite_multiple_three_tables_crud.model;

public class Student {
    private int id;
    private String name;
    private long registrationNumber;
    private String phone;
    private String email;

    private String totalSum;

    public Student(int id, String name, long registrationNumber, String phone, String email) {
        this.id = id;
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.phone = phone;
        this.email = email;
    }

    public Student(int id, String name, long registrationNumber, String phone, String email,String totalSum) {
        this.id = id;
        this.totalSum = totalSum;
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setTotalSum(String totalSum) {this.totalSum = totalSum;}

    public String getTotalSum() {return  this.totalSum;}
    public void setName(String name) {
        this.name = name;
    }

    public long getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(long registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
