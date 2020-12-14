package bt.gov.rsta.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_payment_dtls")
public class PaymentDetailsModel {
	@Id
	private int Payment_Id;
	private String Application_Number;
	private String Application_Type;
	private int Service_Id;
	@Column(name = "Amount_Paid")
	private Double Amount;
	private Double Penalty_Paid;
	private String Receipt_No;
	private Date Receipt_Date;
	private String Created_By;
	private String Is_Payment_Successful;
	
	public PaymentDetailsModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPayment_Id() {
		return Payment_Id;
	}

	public void setPayment_Id(int payment_Id) {
		Payment_Id = payment_Id;
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

	public int getService_Id() {
		return Service_Id;
	}

	public void setService_Id(int service_Id) {
		Service_Id = service_Id;
	}

	

	public Double getAmount() {
		return Amount;
	}

	public void setAmount(Double amount) {
		Amount = amount;
	}

	public Double getPenalty_Paid() {
		return Penalty_Paid;
	}

	public void setPenalty_Paid(Double penalty_Paid) {
		Penalty_Paid = penalty_Paid;
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

	public String getCreated_By() {
		return Created_By;
	}

	public void setCreated_By(String created_By) {
		Created_By = created_By;
	}

	public String getIs_Payment_Successful() {
		return Is_Payment_Successful;
	}

	public void setIs_Payment_Successful(String is_Payment_Successful) {
		Is_Payment_Successful = is_Payment_Successful;
	}
	
	
}
