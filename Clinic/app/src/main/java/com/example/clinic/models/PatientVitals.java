package com.example.clinic.models;
import com.google.gson.annotations.SerializedName;

public class PatientVitals {

  @SerializedName("patient_id")
    public Integer patient_id;

  @SerializedName("patient")
    public Patient patient;

  @SerializedName("visit_date")
    public String visit_date;

  @SerializedName("height")
    public double height;

  @SerializedName("weight")
    public double weight;

  @SerializedName("BMI")
    public double bmi;


  public PatientVitals(int patient_id,Patient patient,String visit_date,
                       double height,double weight,double bmi){
      this.patient_id=patient_id;
      this.patient=patient;
      this.visit_date=visit_date;
      this.height=height;
      this.weight=weight;
      this.bmi=bmi;
  }
}
