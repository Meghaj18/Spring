package com.cg.App.Tata.Module;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="Account_Details")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	

	@OneToOne(cascade = CascadeType.ALL)
    private User user;
	
	
	@OneToMany(cascade = CascadeType.ALL)
    private List<Recharge> recharges= new ArrayList<Recharge>();

  
	
    @OneToMany( cascade = CascadeType.ALL)
    private List<ServiceRequest> requests= new ArrayList<ServiceRequest>();
   
	
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Pack_id", referencedColumnName = "id")
    private Pack currentPack;
    
    
    
	public Account() {
		
	}
	
	public long getAccountId() {
		return id;
	}
	public void setAccountId(long accountId) {
		this.id = accountId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Recharge> getRecharges() {
		return recharges;
	}
	public void setRecharges(List<Recharge> recharges) {
		this.recharges = recharges;
}

	public List<ServiceRequest> getRequests() {
		return requests;
	}
	public void setRequests(List<ServiceRequest> requests) {
		this.requests = requests;
	}
	
    public Pack getCurrentPack() {
		return currentPack;
	}
	public void setCurrentPack(Pack currentPack) {
		this.currentPack = currentPack;
	}
    @Override
	public String toString() {
		return "Account [accountId=" + id + "]";
	}
	public Account(long id, User user, List<Recharge> recharges, LocalDate registeredDate,
			List<ServiceRequest> requests, Pack currentPack) {
		super();
		this.id = id;
		this.user = user;
		this.recharges = recharges;
		this.requests = requests;
		this.currentPack = currentPack;
	}
	

    
    

}
