package com.user.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entity.EtudiantEntity;

public interface EtudiantRepository extends JpaRepository<EtudiantEntity, Long> {
    // Méthodes spécifiques au repository si nécessaire
	
	Optional<EtudiantEntity> findById(Long id);
	    
	    List<EtudiantEntity> findAll();
	    
	    void deleteById(Long id);
	    
	    void delete(EtudiantEntity etudiant);
	    
	    long count();
	    
	    List<EtudiantEntity> findByNom(String nom);
	    

	    EtudiantEntity save(EtudiantEntity etudiant);
	    

	    EtudiantEntity saveAndFlush(EtudiantEntity etudiant);

}
