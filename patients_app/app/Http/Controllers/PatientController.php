<?php

namespace App\Http\Controllers;


use Illuminate\Http\Request;

use App\Models\Patients;

use App\Http\Resources\PatientResource as PatientResource;


class PatientController extends Controller
{
    //
    public function getPatients(){
      $patients=Patients::get();
      return PatientResource::collection($patients);
    }
}
