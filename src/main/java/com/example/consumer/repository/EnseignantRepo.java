package com.example.consumer.repository;

import com.example.consumer.entity.Enseignant;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EnseignantRepo extends JpaRepository<Enseignant,Long> {

}
