/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cov.services;

import com.cov.dao.AnnonceRepository;
import com.cov.entities.Annonce;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author oz
 */
@RestController
public class AnnonceRestService {
    @Autowired
    private AnnonceRepository ar;
    @PersistenceContext
    EntityManager entityManager;

    @CrossOrigin(origins = "*")
   @RequestMapping(value="/recherche",method=RequestMethod.GET)
	public Page<Annonce> recherche(@RequestParam(name="villeDepart",defaultValue="") String villeDepart,
							@RequestParam(name="villeArrive",defaultValue="") String villeArrive
							,@RequestParam(name="d",defaultValue="") String d
							,@RequestParam(name="page",defaultValue="0")int page ,
							@RequestParam(name="size",defaultValue="10")int size) {
	   System.out.println(villeDepart+"++++++++++++++++++++++++"+villeArrive+d);
   	
	   SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	   try {

           Date date = df.parse(d);
           //System.out.println(date);
           //System.out.println(df.format(date));

       } catch (ParseException e) {
    	   System.out.println("saaat");
       }
		return ar.recherche("%"+villeDepart+"%","%"+villeArrive+"%","%"+d+"%", new PageRequest(page, size));			
	}

}
