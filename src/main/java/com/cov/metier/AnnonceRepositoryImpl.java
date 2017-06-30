/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cov.metier;

import com.cov.dao.AnnonceRepository;
import com.cov.entities.Annonce;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 *
 * @author oz
 */
@Service
public abstract class AnnonceRepositoryImpl implements AnnonceRepository{
    @Autowired
    private AnnonceRepository ar;
    
    @PersistenceContext
    EntityManager entityManager;
    
	public Page<Annonce> recherche(String villeDepart, String villeArrive,String d, Pageable pageable) {		
		return ar.recherche(villeDepart, villeArrive, d,  pageable);
	}

}
