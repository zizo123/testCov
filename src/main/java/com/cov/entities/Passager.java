package com.cov.entities;
import com.cov.entities.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
@DiscriminatorValue("passager")
public class Passager extends Utilisateur  implements Serializable {
	 

	@OneToMany(mappedBy="passager") 
   private Collection <Reservation> reservation;
   	@OneToMany(mappedBy="passager") 
   private Collection <Message> message;
    @OneToMany(mappedBy="passager") 
    private Collection<Annonce> annonce= new ArrayList<Annonce>();
	public Passager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Collection<Reservation> getReservation() {
		return reservation;
	}
	
	public void setReservation(Collection<Reservation> reservation) {
		this.reservation = reservation;
	}

	public Collection<Message> getMessage() {
		return message;
	}
	
	public void setMessage(Collection<Message> message) {
		this.message = message;
	}
   
	
}