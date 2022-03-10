package com.example.banking.model;

public class CustomerCreateRequest {

    private String passNr;
    private String gbDate;
    private String vName;
    private String nName;
    private String straße;
    private String hNr;
    private String ort;

    public CustomerCreateRequest(String passNr, String gbDate, String vName, String nName, String straße, String hNr, String ort) {
        this.passNr = passNr;
        this.gbDate = gbDate;
        this.vName = vName;
        this.nName = nName;
        this.straße = straße;
        this.hNr = hNr;
        this.ort = ort;
    }

    public String getPassNr() {
        return passNr;
    }

    public String getGbDate() {
        return gbDate;
    }

    public String getvName() {
        return vName;
    }

    public String getnName() {
        return nName;
    }

    public String getStraße() {
        return straße;
    }

    public String gethNr() {
        return hNr;
    }

    public String getOrt() {
        return ort;
    }
}