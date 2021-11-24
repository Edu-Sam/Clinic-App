<?php

namespace App\Http\Resources;


use Illuminate\Http\Resources\Json\JsonResource;

class PatientVitalsResource extends JsonResource
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
        'height'=>$this->height,
        'weight'=>$this->weight,
        'bmi'=>$this->bmi
      ];
      //  return parent::toArray($request);
    }
}
