package com.cg.App.Tata.Module;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Recharge_Details")
public class Recharge {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "Account_id", referencedColumnName = "id")
    private Account account;
	
	@Column
    private double amount;
    private int daysValidity;
    private String planDescription;
    private String planName;
    private Date purchasedDate;
    @ElementCollection
    private List<String> channels;



	public Recharge() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getDaysValidity() {
		return daysValidity;
	}
	public void setDaysValidity(int daysValidity) {
		this.daysValidity = daysValidity;
	}
	public String getPlanDescription() {
		return planDescription;
	}
	public void setPlanDescription(String planDescription) {
		this.planDescription = planDescription;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	
	public Date getPurchasedDate() {
		return purchasedDate;
	}
	public void setPurchasedDate(Date purchasedDate) {
		this.purchasedDate = purchasedDate;
	}
	public List<String> getChannels() {
		return channels;
	}
	public void setChannels(List<String> channels) {
		this.channels = channels;
	}

	@Override
	public String toString() {
		return "Recharge [id=" + id + ", amount=" + amount + ", daysValidity=" + daysValidity + ", planDescription="
				+ planDescription + ", planName=" + planName + "]";
	}
	public Recharge(Account account, double amount, int daysValidity, String planDescription, String planName,
	                List<String> channels, long id) {
		super();
		this.id=id;
		this.account = account;
		this.amount = amount;
		this.daysValidity = daysValidity;
		this.planDescription = planDescription;
		this.planName = planName;
		this.purchasedDate = purchasedDate;
		this.channels = channels;
	}


    
    
}
