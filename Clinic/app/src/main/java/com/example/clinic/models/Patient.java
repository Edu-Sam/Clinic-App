package com.example.clinic.models;

import com.google.gson.annotations.SerializedName;

public class Patient {

    @SerializedName("patient_id")
    public Integer patient_id;

    @SerializedName("registration_date")
    public String registration_date;

    @SerializedName("first_name")
    public String first_name;

    @SerializedName("last_name")
    public String last_name;

    @SerializedName("dob")
    public String dob;

    @SerializedName("gender")
    public String gender;

    public Patient(int patient_id,String registration_date,String first_name,
                   String last_name,String dob,String gender){
        this.patient_id=patient_id;
        this.registration_date=registration_date;
        this.first_name=first_name;
        this.last_name=last_name;
        this.dob=dob;
        this.gender=gender;
    }
}
