package com.user.service.api;

import java.util.List;

import com.user.entity.EtudiantEntity;

public interface EtudiantService {
	
	  EtudiantEntity findById(Long id);
	    
	    List<EtudiantEntity> findAll();
	    
	    void deleteById(Long id);
	    
	    void delete(EtudiantEntity etudiant);
	    
	    EtudiantEntity save(EtudiantEntity etudiant);
	    
	    long count();
	    
	    List<EtudiantEntity> findByNom(String nom);

}
