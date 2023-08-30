package sis.hfs.cashhandling.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "shf_AmountDetails")
public class AmountDetails {
    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    @Column
    private String feestype;

    @Column
    private String resttype;

    @Column
    private String ratetype;

    @Column
    private String starttenor;

    @Column
    private String endtenor;
    @Column
    private String fromreceiptamount;

    @Column
    private String toreceiptamount;

    @Column
    private String feespercentage;

    @Column
    private String feesamount;

    @Column
    
    private String effectivedate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFeestype() {
		return feestype;
	}

	public void setFeestype(String feestype) {
		this.feestype = feestype;
	}

	public String getResttype() {
		return resttype;
	}

	public void setResttype(String resttype) {
		this.resttype = resttype;
	}

	public String getRatetype() {
		return ratetype;
	}

	public void setRatetype(String ratetype) {
		this.ratetype = ratetype;
	}

	public String getStarttenor() {
		return starttenor;
	}

	public void setStarttenor(String starttenor) {
		this.starttenor = starttenor;
	}

	public String getEndtenor() {
		return endtenor;
	}

	public void setEndtenor(String endtenor) {
		this.endtenor = endtenor;
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

	public String getFeesamount() {
		return feesamount;
	}

	public void setFeesamount(String feesamount) {
		this.feesamount = feesamount;
	}

	public String getEffectivedate() {
		return effectivedate;
	}

	public void setEffectivedate(String effectivedate) {
		this.effectivedate = effectivedate;
	}

	
  
}
