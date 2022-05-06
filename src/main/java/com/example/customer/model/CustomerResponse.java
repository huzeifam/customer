package com.example.customer.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "customers")
public class CustomerResponse {

    @Id
    private Integer customerNo;
    private String idCardNo;
    private LocalDate birthDate;
    private String firstName;
    private String lastName;
    private String sex;
    private String email;
    private String telephone;
    private String street;
    private String streetNo;
    private String zipCode;
    private String city;
    private String country;
    private boolean hasOnlineBanking;
    private boolean investing;
    private boolean naturalPerson;
    private boolean hasAnotherBank;
    private boolean saving;
    private boolean creditWorthy;
    @JsonIgnore
    private String word;



//    @OneToMany(mappedBy = "kNr", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<AccountResponse> accountResponse;

    public CustomerResponse(){

    }

    public CustomerResponse(Integer customerNo, String idCardNo, LocalDate birthDate, String firstName, String lastName,
                            String sex, String email, String telephone, String street, String streetNo, String zipCode,
                            String city, String country, boolean hasOnlineBanking, boolean investing,
                            boolean naturalPerson, boolean hasAnotherBank, boolean saving, boolean creditWorthy) {
        this.customerNo = customerNo;
        this.idCardNo = idCardNo;
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.email = email;
        this.telephone = telephone;
        this.street = street;
        this.streetNo = streetNo;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
        this.hasOnlineBanking = hasOnlineBanking;
        this.investing = investing;
        this.naturalPerson = naturalPerson;
        this.hasAnotherBank = hasAnotherBank;
        this.saving = saving;
        this.creditWorthy = creditWorthy;
    }

    public Integer getCustomerNo() {
        return customerNo;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getStreet() {
        return street;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public boolean isHasOnlineBanking() {
        return hasOnlineBanking;
    }

    public boolean isInvesting() {
        return investing;
    }

    public boolean isNaturalPerson() {
        return naturalPerson;
    }

    public boolean isHasAnotherBank() {
        return hasAnotherBank;
    }

    public boolean getSaving() {
        return saving;
    }

    public boolean getCreditWorthy() {
        return creditWorthy;
    }


    public void setCustomerNo(Integer customerNo) {
        this.customerNo = customerNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setHasOnlineBanking(boolean hasOnlineBanking) {
        this.hasOnlineBanking = hasOnlineBanking;
    }

    public void setInvesting(boolean investing) {
        this.investing = investing;
    }

    public void setNaturalPerson(boolean naturalPerson) {
        this.naturalPerson = naturalPerson;
    }

    public void setHasAnotherBank(boolean hasAnotherBank) {
        this.hasAnotherBank = hasAnotherBank;
    }

    public void setSaving(boolean saving) {
        saving = saving;
    }

    public void setCreditWorthy(boolean creditWorthy) {
        creditWorthy = creditWorthy;
    }
}