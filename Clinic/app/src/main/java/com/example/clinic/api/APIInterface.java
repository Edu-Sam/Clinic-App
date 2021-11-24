package com.example.clinic.api;

import com.example.clinic.PatientVitals;
import com.example.clinic.models.*
;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.util.List;

public interface APIInterface {

    @GET("/api/patients")
    Call<List<Patient>> getPatients();

    @POST("/api/patients")
    Call<Patient> createPatient(@Body Patient patient);

    @GET("/api/patients?")
    Call<Patient> getPatientById(@Query("patient_id") int id);

    @GET("/api/patient_vitals")
    Call<PatientVitals> getPatientVitals();

    @GET("/api/patient_visits")
    Call<PatientVisit> getPatientVisits();
}
