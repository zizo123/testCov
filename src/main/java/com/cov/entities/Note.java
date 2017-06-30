package com.cov.entities;
import java.io.Serializable;
import javax.persistence.*;


@Entity
public class Note implements Serializable{
  @Id @GeneratedValue(strategy=GenerationType.AUTO)
   private int idNote;
  
   private String commentaire;
   
   private int etoile;
   

   @ManyToOne
   @JoinColumn(name="ID_User_noteA")
   private Utilisateur utilisateurA;
   @ManyToOne
   @JoinColumn(name="ID_User_noteB")
   private Utilisateur utilisateurB;
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Note(String commentaire, int etoile, Utilisateur utilisateurA, Utilisateur utilisateurB) {
		super();
		this.commentaire = commentaire;
		this.etoile = etoile;
		this.utilisateurA = utilisateurA;
		this.utilisateurB = utilisateurB;
	}
	public int getIdNote() {
		return idNote;
	}
	public void setIdNote(int idNote) {
		this.idNote = idNote;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public int getEtoile() {
		return etoile;
	}
	public void setEtoile(int etoile) {
		this.etoile = etoile;
	}
	public Utilisateur getUtilisateurA() {
		return utilisateurA;
	}
	public void setUtilisateurA(Utilisateur utilisateurA) {
		this.utilisateurA = utilisateurA;
	}
	public Utilisateur getUtilisateurB() {
		return utilisateurB;
	}
	public void setUtilisateurB(Utilisateur utilisateurB) {
		this.utilisateurB = utilisateurB;
	}
	   
   

}