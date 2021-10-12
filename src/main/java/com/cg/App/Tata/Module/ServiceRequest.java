package com.cg.App.Tata.Module;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="ServiceRequest_Details")
public class ServiceRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
  
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "Account_id", referencedColumnName = "id")
    private Account account;
    
    private String message;
    private boolean statusOpened;
	private Date requestedDate;
    
	public ServiceRequest() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getRequestedDate() {
		return requestedDate;
	}
	public void setRequestedDate(Date requestedDate) {
		this.requestedDate = requestedDate;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isStatusOpened() {
		return statusOpened;
	}
	public void setStatusOpened(boolean statusOpened) {
		this.statusOpened = statusOpened;
	}
	@Override
	public String toString() {
		return "ServiceRequest [id=" + id + ", message=" + message
				+ ", statusOpened=" + statusOpened + "]";
	}
	public ServiceRequest(long id, Date requestedDate, Account account, String message, boolean statusOpened) {
		super();
		this.id = id;
		this.requestedDate = requestedDate;
		this.account = account;
		this.message = message;
		this.statusOpened = statusOpened;
	}

    
    

}
