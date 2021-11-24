<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

use App\Models\PatientVisits;
use App\Http\Resources\PatientVisitsResource as PatientVisitsResource;

class PatientVisitsController extends Controller
{
    public function getPatientVisits(){
      $patient_visits=PatientVisits::get();
      return PatientVisitsResource::collection($patient_visits);
    }
}
