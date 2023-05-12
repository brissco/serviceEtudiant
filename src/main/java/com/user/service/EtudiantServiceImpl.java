package com.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.EtudiantEntity;
import com.user.repository.EtudiantRepository;
import com.user.service.api.EtudiantService;
@Service
public class EtudiantServiceImpl implements EtudiantService {
    
    @Autowired
    private EtudiantRepository etudiantRepository;
    
    @Override
    public EtudiantEntity findById(Long id) {
    	
    	Optional<EtudiantEntity> optionalEtudiant = etudiantRepository.findById(id);
    	EtudiantEntity etudiant;

    	// Using .get()
    	if (optionalEtudiant.isPresent()) {
    	    etudiant = optionalEtudiant.get();
    	}

    	// Using .orElse()
    	etudiant = optionalEtudiant.orElse(null); // or provide a default value other than null
    	
        return etudiant;
    }
    
    @Override
    public List<EtudiantEntity> findAll() {
        return etudiantRepository.findAll();
    }
    
    @Override
    public void deleteById(Long id) {
        etudiantRepository.deleteById(id);
    }
    
   @Override
    public EtudiantEntity save(EtudiantEntity etudiant) {
        return etudiantRepository.save(etudiant);
    }
    
    @Override
    public void delete(EtudiantEntity etudiant) {
        etudiantRepository.delete(etudiant);
    }
    
    @Override
    public long count() {
        return etudiantRepository.count();
    }
    
    @Override
    public List<EtudiantEntity> findByNom(String nom) {
        return etudiantRepository.findByNom(nom);
    }
    
}