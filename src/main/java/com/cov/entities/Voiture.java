package com.cov.entities;
import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Voiture implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
   private int idVoiture;
   
   private String nomVoiture;
   
   private String marqueVoiture;
   
   private String couleurVoiture;
   

   @ManyToOne
   @JoinColumn(name="ID_user_voit")
   private Utilisateur utilisateur;
	public Voiture(String nomVoiture, String marqueVoiture, String couleurVoiture, 
			Utilisateur utilisateur) {
		super();
		this.nomVoiture = nomVoiture;
		this.marqueVoiture = marqueVoiture;
		this.couleurVoiture = couleurVoiture;

		this.utilisateur = utilisateur;
	}
	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdVoiture() {
		return idVoiture;
	}
	public void setIdVoiture(int idVoiture) {
		this.idVoiture = idVoiture;
	}
	public String getNomVoiture() {
		return nomVoiture;
	}
	public void setNomVoiture(String nomVoiture) {
		this.nomVoiture = nomVoiture;
	}
	public String getMarqueVoiture() {
		return marqueVoiture;
	}
	public void setMarqueVoiture(String marqueVoiture) {
		this.marqueVoiture = marqueVoiture;
	}
	public String getCouleurVoiture() {
		return couleurVoiture;
	}
	public void setCouleurVoiture(String couleurVoiture) {
		this.couleurVoiture = couleurVoiture;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	   
	   
  
}