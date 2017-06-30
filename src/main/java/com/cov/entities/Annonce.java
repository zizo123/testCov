package com.cov.entities;
import java.io.Serializable;
import java.util.*;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
public class Annonce implements Serializable{
   @Id @GeneratedValue(strategy=GenerationType.AUTO)
   private int idAnnonce;
   @Temporal(javax.persistence.TemporalType.DATE)
   private Date dateDepart;

   @Temporal(javax.persistence.TemporalType.TIME)
   private Date heureDepart;
   @Temporal(javax.persistence.TemporalType.TIME)
   private Date heureArrive;
   
   private int nbPlaces;
   private float distanceTrajet;
   private float prix;
	
	private String villeDepart;
	private String vdLongitude;
	private String vdLatitude;
	private String villeArrive;
	private String vaLatitude;
	private String vaLongitude;
	
  
   @OneToMany(mappedBy="annonce") 
   private Collection <Reservation> reservation = new ArrayList<Reservation>();

   @ManyToOne
   @JoinColumn(name="ID_Pass_ann")
   private Passager passager;
   @ManyToOne
   @JoinColumn(name="ID_Cond_ann")
   private Conducteur conducteur;

 

    public Annonce(Date dateDepart, Date heureDepart, Date heureArrive, 
                int nbPlaces, float prix,Conducteur conducteur, Collection<Reservation> reservation) {
	super();
	this.dateDepart = dateDepart;
	this.heureDepart = heureDepart;
	this.heureArrive = heureArrive;
	this.nbPlaces = nbPlaces;
	this.prix = prix;
	this.conducteur = conducteur;
	this.reservation = reservation;
      
	
}
	public Annonce() {
	super();
	// TODO Auto-generated constructor stub
}
	public int getIdAnnonce() {
		return idAnnonce;
	}
	public void setIdAnnonce(int idAnnonce) {
		this.idAnnonce = idAnnonce;
	}
	public Date getDateDepart() {
		return dateDepart;
	}
	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}
	public Date getHeureDepart() {
		return heureDepart;
	}
	public void setHeureDepart(Date heureDepart) {
		this.heureDepart = heureDepart;
	}
	public Date getHeureArrive() {
		return heureArrive;
	}
	public void setHeureArrive(Date heureArrive) {
		this.heureArrive = heureArrive;
	}
	public int getNbPlaces() {
		return nbPlaces;
	}
	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}	
	@JsonIgnore
	public Conducteur getConducteur() {
		return conducteur;
	}
	@JsonSetter
	public void setConducteur(Conducteur conducteur) {
		this.conducteur = conducteur;
	}
	public float getDistanceTrajet() {
		return distanceTrajet;
	}
	public void setDistanceTrajet(float distanceTrajet) {
		this.distanceTrajet = distanceTrajet;
	}
	public String getVilleDepart() {
		return villeDepart;
	}
	public void setVilleDepart(String villeDepart) {
		this.villeDepart = villeDepart;
	}
	@JsonIgnore
	public Collection<Reservation> getReservation() {
		return reservation;
	}
	@JsonSetter
	public void setReservation(Collection<Reservation> reservation) {
		this.reservation = reservation;
	}
	@JsonIgnore
	public Passager getPassager() {
		return passager;
	}
	@JsonSetter
	public void setPassager(Passager passager) {
		this.passager = passager;
	}
	public String getVilleArrive() {
		return villeArrive;
	}
	public void setVilleArrive(String villeArrive) {
		this.villeArrive = villeArrive;
	}
	public String getVdLongitude() {
		return vdLongitude;
	}
	public void setVdLongitude(String vdLongitude) {
		this.vdLongitude = vdLongitude;
	}
	public String getVdLatitude() {
		return vdLatitude;
	}
	public void setVdLatitude(String vdLatitude) {
		this.vdLatitude = vdLatitude;
	}
	public String getVaLatitude() {
		return vaLatitude;
	}
	public void setVaLatitude(String vaLatitude) {
		this.vaLatitude = vaLatitude;
	}
	public String getVaLongitude() {
		return vaLongitude;
	}
	public void setVaLongitude(String vaLongitude) {
		this.vaLongitude = vaLongitude;
	}

}