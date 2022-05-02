package com.example.banking.model;

public enum CustomerSexEnum {
    Male("Male"),
    Female("Female"),
    Others("Other");

    private String sex;

    CustomerSexEnum(String customerSex) {this.sex = customerSex;}

    public String getSex(){ return sex;}
}

