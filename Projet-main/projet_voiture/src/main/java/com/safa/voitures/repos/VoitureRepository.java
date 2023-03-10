package com.safa.voitures.repos;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.safa.voitures.entities.Marque;
import com.safa.voitures.entities.Voiture;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {
	@Query("select v from Voiture v where v.designation like %?1 and v.prixVoiture > ?2")
	List<Voiture> findBydesignation(String nom, Double prix);
	 @Query("select v from Voiture v where v.designation like %?1 and v.prixVoiture > ?2")
	 List<Voiture> findBydesignationContains(String nom);
	 @Query("select v from Voiture v where v.marque = ?1")
	 List<Voiture> findByMarque (Marque marque);
	Marque save(Marque m);
}