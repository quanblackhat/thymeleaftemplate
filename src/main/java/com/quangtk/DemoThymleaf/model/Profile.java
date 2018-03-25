package com.quangtk.DemoThymleaf.model;

public class Profile {
    private int uid;
    private String firstName;
    private String lastName;
    private String occupation;
    private String phone;
    private String mobilePhone;
    private String dob;
    private String email;
    private String country;

    public Profile() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Profile(int uid, String firstName, String lastName, String occupaation, String phone, String mobilePhone, String dob, String email, String country) {
        this.uid = uid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupaation;
        this.phone = phone;
        this.mobilePhone = mobilePhone;
        this.dob = dob;
        this.email = email;
        this.country = country;
    }
}
