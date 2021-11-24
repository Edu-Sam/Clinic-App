<?php

namespace App\Http\Controllers;

use App\Models\PatientVitals;
use App\Http\Resources\PatientVitalsResource as PatientVitalsResource

use Illuminate\Http\Request;

class PatientVitalsController extends Controller
{

    public function getPatientVitals(){
      $patient_vitals=PatientVitals::get();
      return PatientVitalResource::collection($patient_vitals);
    }
}
