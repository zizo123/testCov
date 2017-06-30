package com.cov.entities;
import java.io.Serializable;
import java.util.*;
import javax.persistence.*;


@Entity
public class Notification implements Serializable{
	@Id @GeneratedValue
   private int idNotif;
   
   @Temporal(javax.persistence.TemporalType.DATE)
   private Date dateCreationNotif;
   
   private String typeNotif;
   
   private Boolean luNotif;
   @ManyToOne
   @JoinColumn(name="ID_user_notif")
   private Utilisateur utilisateur;
	public Notification() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Notification(Date dateCreationNotif, String typeNotif, Boolean luNotif, Utilisateur utilisateur) {
		super();
		this.dateCreationNotif = dateCreationNotif;
		this.typeNotif = typeNotif;
		this.luNotif = luNotif;
		this.utilisateur = utilisateur;
	}
	public Date getDateCreationNotif() {
		return dateCreationNotif;
	}
	public void setDateCreationNotif(Date dateCreationNotif) {
		this.dateCreationNotif = dateCreationNotif;
	}
	public String getTypeNotif() {
		return typeNotif;
	}
	public void setTypeNotif(String typeNotif) {
		this.typeNotif = typeNotif;
	}
	public Boolean getLuNotif() {
		return luNotif;
	}
	public void setLuNotif(Boolean luNotif) {
		this.luNotif = luNotif;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	   
	   

}