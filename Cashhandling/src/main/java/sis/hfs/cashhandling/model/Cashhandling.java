//package sis.hfs.cashhandling.model;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.JoinColumn;  
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "shf_Cashhandling")   
//public class Cashhandling {
//    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
//    private long id;
//
//    @Column
//    private String feestype;
//
//    @Column
//    private String resttype;
//
//    @Column
//    private String ratetype;
//
//    @Column
//    private String starttenor;
//
//    @Column
//    private String endtenor;
//
//    @ManyToOne
//    @JoinColumn(name = "effectivedate")  
//    private AmountDetails amountDetails;
//
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public String getFeestype() {
//		return feestype;
//	}
//
//	public void setFeestype(String feestype) {
//		this.feestype = feestype;
//	}
//
//	public String getResttype() {
//		return resttype;
//	}
//
//	public void setResttype(String resttype) {
//		this.resttype = resttype;
//	}
//
//	public String getRatetype() {
//		return ratetype;
//	}
//
//	public void setRatetype(String ratetype) {
//		this.ratetype = ratetype;
//	}
//
//	public String getStarttenor() {
//		return starttenor;
//	}
//
//	public void setStarttenor(String starttenor) {
//		this.starttenor = starttenor;
//	}
//
//	public String getEndtenor() {
//		return endtenor;
//	}
//
//	public void setEndtenor(String endtenor) {
//		this.endtenor = endtenor;
//	}
//
//	public AmountDetails getAmountDetails() {
//		return amountDetails;
//	}
//
//	public void setAmountDetails(AmountDetails amountDetails) {
//		this.amountDetails = amountDetails;
//	}   
//
//    
//}
