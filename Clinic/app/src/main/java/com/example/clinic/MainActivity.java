package com.example.clinic;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.TableLayout;
import android.widget.TableRow;

import com.example.clinic.models.*;
import com.example.clinic.api.APIInterface;
import com.example.clinic.api.APIClient;
import java.util.List;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    APIInterface apiInterface;
    APIClient apiClient=new APIClient();
    List<Patient> user_patients=new ArrayList<Patient>();
    TableLayout my_table;
    double bmi_placeholder=0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiInterface=apiClient.getClient().create(APIInterface.class);
        init();
    }

    public void init(){

        List<Patient> patientList=getPatients();
        my_table=(TableLayout)findViewById(R.id.my_table);
        TableRow my_table_row=new TableRow(this);
     //   TableRow  my_table_row=(TableRow)findViewById(R.id.my_table_row);
        my_table_row.setBackgroundColor(getResources().getColor(R.color.teal_700));
        TextView patient_name=new TextView(this);
        patient_name.setText("Patient Name");
        patient_name.setTextColor(Color.WHITE);
        my_table_row.addView(patient_name);

       TextView age=new TextView(this);
       age.setText("Age");
       age.setTextColor(Color.WHITE);
       my_table_row.addView(age);

       TextView bmi_status=new TextView(this);
       bmi_status.setText("BMI status");
       bmi_status.setTextColor(Color.WHITE);
       my_table_row.addView(bmi_status);
       my_table.addView(my_table_row);
        System.out.println("The list size is " + patientList.size());
       for(int i=0;i<patientList.size();i++){
           TableRow tableRow=new TableRow(this);
           tableRow.setBackgroundColor(getResources().getColor(R.color.teal_200));

           TextView patient_detail_name=new TextView(this);
           patient_detail_name.setText(patientList.get(i).first_name + ' ' +
                   patientList.get(i).last_name);
           patient_detail_name.setTextColor(Color.WHITE);
           tableRow.addView(patient_detail_name);

           TextView patient_detail_age=new TextView(this);
           patient_detail_age.setText(patientList.get(i).dob);
           patient_detail_age.setTextColor(Color.WHITE);
           tableRow.addView(patient_detail_age);

           TextView patient_detail_bmi=new TextView(this);
           patient_detail_bmi.setText(String.valueOf(bmi_placeholder));
           patient_detail_bmi.setTextColor(Color.WHITE);
           tableRow.addView(patient_detail_bmi);

           my_table.addView(tableRow);


       }



    }

    private List<Patient> getPatients(){

        Call<List<Patient>> patientCall=apiInterface.getPatients();
        patientCall.enqueue(new Callback<List<Patient>>(){
            @Override
            public void onResponse(Call<List<Patient>> call,Response<List<Patient>> response){
                  user_patients=response.body();

            }

            @Override
            public void onFailure(Call<List<Patient>> call,Throwable t){
                     call.cancel();
            }
        });

        return user_patients;
    }


}