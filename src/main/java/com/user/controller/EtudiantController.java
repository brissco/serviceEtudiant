package com.user.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.EtudiantEntity;
import com.user.service.api.EtudiantService;


@RestController
@RequestMapping("/etudiants")
public class EtudiantController {
	    
	    @Autowired
	    private EtudiantService etudiantService;
	    
	    @GetMapping("/{id}")
	    public ResponseEntity<EtudiantEntity> findById(@PathVariable Long id) {
	    	EtudiantEntity etudiant = etudiantService.findById(id);
	        if (etudiant != null) {
	            return ResponseEntity.ok(etudiant);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	    
	    @GetMapping("/etudiants")
	    public List
	    <EtudiantEntity> findAll() {
	        return etudiantService.findAll();
	    }
	    
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
	    	EtudiantEntity etudiant = etudiantService.findById(id);
	        if (etudiant != null) {
	            etudiantService.deleteById(id);
	            return ResponseEntity.noContent().build();
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	    
	    @PostMapping
	    public ResponseEntity<EtudiantEntity> create(@RequestBody EtudiantEntity etudiant) {
	    	EtudiantEntity createdEtudiant = etudiantService.save(etudiant);
	        return ResponseEntity.created(URI.create("/etudiants/" + createdEtudiant.getId())).body(createdEtudiant);
	    }
	    
	    @PutMapping("/{id}")
	    public ResponseEntity<EtudiantEntity> update(@PathVariable Long id, @RequestBody EtudiantEntity etudiant) {
	    	EtudiantEntity existingEtudiant = etudiantService.findById(id);
	        if (existingEtudiant != null) {
	            etudiant.setId(id);
	            EtudiantEntity updatedEtudiant = etudiantService.save(etudiant);
	            return ResponseEntity.ok(updatedEtudiant);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	    
	}