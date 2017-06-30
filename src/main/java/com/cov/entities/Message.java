package com.cov.entities;
import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
public class Message implements Serializable{
	
   @Id @GeneratedValue(strategy=GenerationType.AUTO)
   private int idMsg;
   
   private String contenuMsg;
   private String objetMsg;
   @Temporal(javax.persistence.TemporalType.DATE)
   private Date dateEnvoiMsg;
   private Boolean luMsg;
   

   @ManyToOne
   @JoinColumn(name="ID_Cond_msg")
   private Conducteur conducteur;
   @ManyToOne
   @JoinColumn(name="ID_Passag_msg")
   private Passager passager;
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(String contenuMsg, String objetMsg, Date dateEnvoiMsg, Boolean luMsg, Conducteur conducteurA,
			Passager passagerB) {
		super();
		this.contenuMsg = contenuMsg;
		this.objetMsg = objetMsg;
		this.dateEnvoiMsg = dateEnvoiMsg;
		this.luMsg = luMsg;
		this.conducteur = conducteurA;
		this.passager = passagerB;
	}
	public int getIdMsg() {
		return idMsg;
	}
	public void setIdMsg(int idMsg) {
		this.idMsg = idMsg;
	}
	public String getContenuMsg() {
		return contenuMsg;
	}
	public void setContenuMsg(String contenuMsg) {
		this.contenuMsg = contenuMsg;
	}
	public String getObjetMsg() {
		return objetMsg;
	}
	public void setObjetMsg(String objetMsg) {
		this.objetMsg = objetMsg;
	}
	public Date getDateEnvoiMsg() {
		return dateEnvoiMsg;
	}
	public void setDateEnvoiMsg(Date dateEnvoiMsg) {
		this.dateEnvoiMsg = dateEnvoiMsg;
	}
	public Boolean getLuMsg() {
		return luMsg;
	}
	public void setLuMsg(Boolean luMsg) {
		this.luMsg = luMsg;
	}
	public Conducteur getConducteurA() {
		return conducteur;
	}
	public void setConducteurA(Conducteur conducteurA) {
		this.conducteur = conducteurA;
	}
	public Passager getPassagerB() {
		return passager;
	}
	public void setPassagerB(Passager passagerB) {
		this.passager = passagerB;
	}
	   
   

}