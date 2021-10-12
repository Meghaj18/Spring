package com.cg.App.Tata.Module;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Pack_Details")
public class Pack {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
    private double cost;
    private int daysValidity;
    private String description;
    private String planName;
    @ElementCollection
    private List<String> channels;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Account_id", referencedColumnName = "id")
    private List<Account> account=new ArrayList<Account>();
    
	public Pack() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getDaysValidity() {
		return daysValidity;
	}
	public void setDaysValidity(int daysValidity) {
		this.daysValidity = daysValidity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public List<String> getChannels() {
		return channels;
	}
	public void setChannels(List<String> channels) {
		this.channels = channels;
	}
	
	
	public List<Account> getAccount() {
		return account;
	}
	public void setAccount(List<Account> account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Pack [id=" + id + ", cost=" + cost + ", daysValidity=" + daysValidity + ", description=" + description
				+ ", planName=" + planName + "]";
	}
	public Pack(long id, double cost, int daysValidity, String description, String planName, List<String> channels,
			List<Account> account) {
		super();
		this.id = id;
		this.cost = cost;
		this.daysValidity = daysValidity;
		this.description = description;
		this.planName = planName;
		this.channels = channels;
		this.account = account;
	}
    
    
    
    

}
