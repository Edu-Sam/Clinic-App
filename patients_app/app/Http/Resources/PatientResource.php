<?php

namespace App\Http\Resources;

use Illuminate\Http\Resources\Json\JsonResource;

class PatientResource extends JsonResource
{
    /**
     * Transform the resource into an array.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return array|\Illuminate\Contracts\Support\Arrayable|\JsonSerializable
     */
    public function toArray($request)
    {
    //    return parent::toArray($request);
       return [
         'patient_id'=> $this->patient_id,
         'registration_date'=> $this->registration_date,
         'first_name'=> $this->first_name,
         'last_name'=> $this->last_name,
         'dob'=> $this ->dob,
         'gender'=> $this ->gender
       ];
    }
}
