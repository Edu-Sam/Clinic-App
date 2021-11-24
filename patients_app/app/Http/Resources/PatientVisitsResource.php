<?php

namespace App\Http\Resources;

use Illuminate\Http\Resources\Json\JsonResource;

class PatientVisitsResource extends JsonResource
{
    /**
     * Transform the resource into an array.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return array|\Illuminate\Contracts\Support\Arrayable|\JsonSerializable
     */
    public function toArray($request)
    {
      return[
        'id'=>$this->id,
        'patient_id'=>$this->patient_id,
        'visit_date'=>$this->visit_date,
        'general_health'=>$this->general_health,
        'been_on_diet'=>$this->been_on_diet,
        'taking_any_drugs'=>$this->taking_any_drugs,
        'comments'=>$this->comments
      ];
      //  return parent::toArray($request);
    }
}
