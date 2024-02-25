package com.example.consumer.dto;

import com.example.consumer.entity.Enseignant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnsEvent {

    private String eventType;
    private Enseignant ens ;

}
