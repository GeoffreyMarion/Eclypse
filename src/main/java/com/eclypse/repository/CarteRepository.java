package com.eclypse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eclypse.model.Carte;

public interface CarteRepository extends JpaRepository<Carte, Long> {

}
