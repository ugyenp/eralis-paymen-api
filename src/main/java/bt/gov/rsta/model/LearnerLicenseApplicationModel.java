package bt.gov.rsta.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_learner_license_application")
public class LearnerLicenseApplicationModel {
	
	@Id
	private String Application_Number;
	private String Application_Type;
	private String Customer_Id;
	private String Learner_License_No;
	private String Learner_License_Id;
	private int Region_Id;
	private String Receipt_No;
	private Date Receipt_Date;
	private String Certifying_Doctor;
	private int Renewal_Duration;
	private String Remarks;
	private Date App_Submission_Date;
	private Date App_Verification_Date;
	private Date App_Approval_Date;
	private String Created_By;
	private String Updated_By;
	private String Amount;
	
	
	public LearnerLicenseApplicationModel() {
		
	}
	
	
	public String getAmount() {
		return Amount;
	}


	public void setAmount(String amount) {
		Amount = amount;
	}


	public String getApplication_Number() {
		return Application_Number;
	}
	public void setApplication_Number(String application_Number) {
		Application_Number = application_Number;
	}
	public String getApplication_Type() {
		return Application_Type;
	}
	public void setApplication_Type(String application_Type) {
		Application_Type = application_Type;
	}
	public String getCustomer_Id() {
		return Customer_Id;
	}
	public void setCustomer_Id(String customer_Id) {
		Customer_Id = customer_Id;
	}
	public String getLearner_License_No() {
		return Learner_License_No;
	}
	public void setLearner_License_No(String learner_License_No) {
		Learner_License_No = learner_License_No;
	}
	public String getLearner_License_Id() {
		return Learner_License_Id;
	}
	public void setLearner_License_Id(String learner_License_Id) {
		Learner_License_Id = learner_License_Id;
	}
	public int getRegion_Id() {
		return Region_Id;
	}
	public void setRegion_Id(int region_Id) {
		Region_Id = region_Id;
	}
	public String getReceipt_No() {
		return Receipt_No;
	}
	public void setReceipt_No(String receipt_No) {
		Receipt_No = receipt_No;
	}
	public Date getReceipt_Date() {
		return Receipt_Date;
	}
	public void setReceipt_Date(Date receipt_Date) {
		Receipt_Date = receipt_Date;
	}
	public String getCertifying_Doctor() {
		return Certifying_Doctor;
	}
	public void setCertifying_Doctor(String certifying_Doctor) {
		Certifying_Doctor = certifying_Doctor;
	}
	public int getRenewal_Duration() {
		return Renewal_Duration;
	}
	public void setRenewal_Duration(int renewal_Duration) {
		Renewal_Duration = renewal_Duration;
	}
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	public Date getApp_Submission_Date() {
		return App_Submission_Date;
	}
	public void setApp_Submission_Date(Date app_Submission_Date) {
		App_Submission_Date = app_Submission_Date;
	}
	public Date getApp_Verification_Date() {
		return App_Verification_Date;
	}
	public void setApp_Verification_Date(Date app_Verification_Date) {
		App_Verification_Date = app_Verification_Date;
	}
	public Date getApp_Approval_Date() {
		return App_Approval_Date;
	}
	public void setApp_Approval_Date(Date app_Approval_Date) {
		App_Approval_Date = app_Approval_Date;
	}
	public String getCreated_By() {
		return Created_By;
	}
	public void setCreated_By(String created_By) {
		Created_By = created_By;
	}
	public String getUpdated_By() {
		return Updated_By;
	}
	public void setUpdated_By(String updated_By) {
		Updated_By = updated_By;
	}
	
	
}
