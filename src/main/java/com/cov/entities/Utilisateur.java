package com.cov.entities;
import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonToken;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
	name="User_Type",
	discriminatorType=DiscriminatorType.STRING
)
/*@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,include=JsonTypeInfo.As.PROPERTY,property="User_Type")
@JsonSubTypes({
	@Type(name="passager",value=Passager.class),
	@Type(name="conducteur",value=Conducteur.class)
})*/
public class Utilisateur implements Serializable {
	@Id @GeneratedValue
	private int idUser;
	
   private String nomUser;
   
   private String prenomUser;
   
   private String telUser;
   
   private String emailUser;
   @Lob
   private byte[] avatarUser;
   
   private String description;

   @OneToMany(mappedBy="utilisateur") 
   private Collection<Voiture> voiture=new ArrayList<Voiture>();
  @OneToMany(mappedBy="utilisateur") 
   private Collection<Notification> notification;
   @OneToMany(mappedBy="utilisateurB") 
   private Collection <Note>noteB=new ArrayList<Note>();
   @OneToMany(mappedBy="utilisateurA") 
   private Collection <Note>noteA=new ArrayList<Note>();
   
   public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(String nomUser, String prenomUser, String telUser, String emailUser, byte[] avatarUser,
			String description, Collection<Voiture> voiture,Collection<Notification> notification,Collection <Note>noteA,Collection <Note>noteB) {
		super();
		this.nomUser = nomUser;
		this.prenomUser = prenomUser;
		this.telUser = telUser;
		this.emailUser = emailUser;
		this.avatarUser = avatarUser;
		this.description = description;
		
		this.voiture = voiture;
		this.notification = notification;
		this.noteA = noteA;
		this.noteB = noteB;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getNomUser() {
		return nomUser;
	}
	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}
	public String getPrenomUser() {
		return prenomUser;
	}
	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}
	public String getTelUser() {
		return telUser;
	}
	public void setTelUser(String telUser) {
		this.telUser = telUser;
	}
	public String getEmailUser() {
		return emailUser;
	}
	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}
	public byte[] getAvatarUser() {
		return avatarUser;
	}
	public void setAvatarUser(byte[] avatarUser) {
		this.avatarUser = avatarUser;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<Voiture> getVoiture() {
		return voiture;
	}
	public void setVoiture(Collection<Voiture> voiture) {
		this.voiture = voiture;
	}
	
		public Collection<Note> getNoteB() {
		return noteB;
	}
	public void setNoteB(Collection<Note> noteB) {
		this.noteB = noteB;	
	}
	public Collection<Note> getNoteA() {
		return noteA;
	}
	public void setNoteA(Collection<Note> noteA) {
		this.noteA = noteA;
	}
	 public Collection<Notification> getNotification() {
		return notification;
	}
	public void setNotification(Collection<Notification> notification) {
		this.notification = notification;
	}

	
	
	   
}