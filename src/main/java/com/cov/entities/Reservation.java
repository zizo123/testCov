package com.cov.entities;
import java.io.Serializable;
import java.util.*;
import javax.persistence.*;
@Entity
public class Reservation implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
   private int idReservation;
   
   @Temporal(javax.persistence.TemporalType.DATE)
   private Date dateReservation;
   
   private String etatReservation;
   @ManyToOne
   @JoinColumn(name="ID_Ann_reserv")
   private Annonce annonce;
   @ManyToOne
   @JoinColumn(name="ID_Passag_reserv")
   private Passager passager;
   @ManyToOne
   @JoinColumn(name="ID_Cond_reserv")
   private Conducteur conducteur;
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reservation(Date dateReservation, String etatReservation, Annonce annonces, Passager passager) {
		super();
		this.dateReservation = dateReservation;
		this.etatReservation = etatReservation;
		this.annonce = annonces;
		this.passager = passager;
	}
	public int getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}
	public Date getDateReservation() {
		return dateReservation;
	}
	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}
	public String getEtatReservation() {
		return etatReservation;
	}
	public void setEtatReservation(String etatReservation) {
		this.etatReservation = etatReservation;
	}
	public Annonce getAnnonce() {
		return annonce;
	}
	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
	}
	public Passager getPassager() {
		return passager;
	}
	public void setPassager(Passager passager) {
		this.passager = passager;
	}
	   
   

}