package com.cov.entities;
import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
@DiscriminatorValue("conducteur")
public class Conducteur extends Utilisateur  implements Serializable{
  

	@OneToMany(mappedBy="conducteur") 
   private Collection <Message> message=new ArrayList<Message>();
   @OneToMany(mappedBy="conducteur") 
   private Collection<Annonce> annonce= new ArrayList<Annonce>();
	
   
   
 
	public Conducteur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Collection<Message> getMessage() {
		return message;
	}
	
	public void setMessage(Collection<Message> message) {
		this.message = message;
	}

	public Collection<Annonce> getAnnonce() {
		return annonce;
	}
	
	public void setAnnonce(Collection<Annonce> annonce) {
		this.annonce = annonce;
	}
	   
	   
    


}