package com.example.clinic.models;

import com.google.gson.annotations.SerializedName;
public class PatientVisit {

    @SerializedName("patient_id")
    public Integer patient_id;

    @SerializedName("patient")
    public Patient patient;

    @SerializedName("general_health")
    public boolean general_health=true;

    @SerializedName("been_on_diet")
    public boolean been_on_diet=false;

    @SerializedName("taking_any_drugs")
    public boolean taking_any_drugs=false;

    @SerializedName("comments")
    public String comments;

    public PatientVisit(int patient_id,Patient patient,boolean general_health,
                        boolean been_on_diet,boolean taking_any_drugs,
                        String comments){
        this.patient_id=patient_id;
        this.patient=patient;
        this.general_health=general_health;
        this.been_on_diet=been_on_diet;
        this.taking_any_drugs=taking_any_drugs;
        this.comments=comments;
    }

}
