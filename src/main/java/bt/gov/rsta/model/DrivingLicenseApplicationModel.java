package bt.gov.rsta.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_driving_license_application")
public class DrivingLicenseApplicationModel {
	@Id
	private String Application_Number;
	private String Application_Type;
	private String Driving_license_type;
	private int Issued_To_Id;
	private String Learner_License_No;
	private String Customer_Id;
	private String Driving_License_No;
	private String License_Id;
	private int Region_Id;
	private Date Issue_Date;
	private Date Expiry_Date;
	private String Status;
	private String IID;
	private int Test_Marks;
	private int Register_Number;
	private String Drive_Type_Id;
	private String Is_Renewal_Upon_MC;
	private String Renewal_Duration;
	private String Issue_type;
	private String Receipt_Number;
	private Date Receipt_Date;
	private Date Endorsed_Dated;
	private String Is_TCB_Endorsement;
	private Date App_Submission_Date;
	private Date App_Verification_Date;
	private Date App_Approval_Date;
	private String Created_By;
	private String Updated_By;
	private String Amount;
	
	public String getApplication_Number() {
		return Application_Number;
	}
	
	public String getAmount() {
		return Amount;
	}


	public void setAmount(String amount) {
		Amount = amount;
	}


	public int getRegion_Id() {
		return Region_Id;
	}


	public void setRegion_Id(int region_Id) {
		Region_Id = region_Id;
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
	public String getDriving_license_type() {
		return Driving_license_type;
	}
	public void setDriving_license_type(String driving_license_type) {
		Driving_license_type = driving_license_type;
	}
	public int getIssued_To_Id() {
		return Issued_To_Id;
	}
	public void setIssued_To_Id(int issued_To_Id) {
		Issued_To_Id = issued_To_Id;
	}
	public String getLearner_License_No() {
		return Learner_License_No;
	}
	public void setLearner_License_No(String learner_License_No) {
		Learner_License_No = learner_License_No;
	}
	public String getCustomer_Id() {
		return Customer_Id;
	}
	public void setCustomer_Id(String customer_Id) {
		Customer_Id = customer_Id;
	}
	public String getDriving_License_No() {
		return Driving_License_No;
	}
	public void setDriving_License_No(String driving_License_No) {
		Driving_License_No = driving_License_No;
	}
	public String getLicense_Id() {
		return License_Id;
	}
	public void setLicense_Id(String license_Id) {
		License_Id = license_Id;
	}
	public Date getIssue_Date() {
		return Issue_Date;
	}
	public void setIssue_Date(Date issue_Date) {
		Issue_Date = issue_Date;
	}
	public Date getExpiry_Date() {
		return Expiry_Date;
	}
	public void setExpiry_Date(Date expiry_Date) {
		Expiry_Date = expiry_Date;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getIID() {
		return IID;
	}
	public void setIID(String iID) {
		IID = iID;
	}
	public int getTest_Marks() {
		return Test_Marks;
	}
	public void setTest_Marks(int test_Marks) {
		Test_Marks = test_Marks;
	}
	public int getRegister_Number() {
		return Register_Number;
	}
	public void setRegister_Number(int register_Number) {
		Register_Number = register_Number;
	}
	public String getDrive_Type_Id() {
		return Drive_Type_Id;
	}
	public void setDrive_Type_Id(String drive_Type_Id) {
		Drive_Type_Id = drive_Type_Id;
	}
	public String getIs_Renewal_Upon_MC() {
		return Is_Renewal_Upon_MC;
	}
	public void setIs_Renewal_Upon_MC(String is_Renewal_Upon_MC) {
		Is_Renewal_Upon_MC = is_Renewal_Upon_MC;
	}
	public String getRenewal_Duration() {
		return Renewal_Duration;
	}
	public void setRenewal_Duration(String renewal_Duration) {
		Renewal_Duration = renewal_Duration;
	}
	public String getIssue_type() {
		return Issue_type;
	}
	public void setIssue_type(String issue_type) {
		Issue_type = issue_type;
	}
	public String getReceipt_Number() {
		return Receipt_Number;
	}
	public void setReceipt_Number(String receipt_Number) {
		Receipt_Number = receipt_Number;
	}
	public Date getReceipt_Date() {
		return Receipt_Date;
	}
	public void setReceipt_Date(Date receipt_Date) {
		Receipt_Date = receipt_Date;
	}
	public Date getEndorsed_Dated() {
		return Endorsed_Dated;
	}
	public void setEndorsed_Dated(Date endorsed_Dated) {
		Endorsed_Dated = endorsed_Dated;
	}
	public String getIs_TCB_Endorsement() {
		return Is_TCB_Endorsement;
	}
	public void setIs_TCB_Endorsement(String is_TCB_Endorsement) {
		Is_TCB_Endorsement = is_TCB_Endorsement;
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
