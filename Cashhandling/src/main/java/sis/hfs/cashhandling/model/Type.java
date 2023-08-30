package sis.hfs.cashhandling.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="shf_Type")
public class Type {
	@Id
//	@GeneratedValue
	private long id;
	@Column 
	private String fromreceiptamount;
	@Column 
	private String toreceiptamount;
	@Column 
	private String feespercentage;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFromreceiptamount() {
		return fromreceiptamount;
	}
	public void setFromreceiptamount(String fromreceiptamount) {
		this.fromreceiptamount = fromreceiptamount;
	}
	public String getToreceiptamount() {
		return toreceiptamount;
	}
	public void setToreceiptamount(String toreceiptamount) {
		this.toreceiptamount = toreceiptamount;
	}
	public String getFeespercentage() {
		return feespercentage;
	}
	public void setFeespercentage(String feespercentage) {
		this.feespercentage = feespercentage;
	}
	
	
}
