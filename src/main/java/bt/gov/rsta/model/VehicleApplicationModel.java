package bt.gov.rsta.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_vehicle_application")
public class VehicleApplicationModel {
	
	@Id
	private String Application_Number;
	private String Application_Type;
	private String Vehicle_Registration_Type;
	private String Customer_Id;
	private String Registration_Type;
	private String Amount;
	private int Vehicle_Registration_Id;
	private int Region_Id;
	private String Vehicle_Prefix;
	private String Vehicle_Number;
	private int Vehicle_Id;
	private int Vehicle_Type_Id;
	private String Vanity_Number;
	private int Vehicle_Company_Id;
	private int Vehicle_Model_Id;
	private int Engine_Type_Id;
	private String Engine_Number;
	private String Chasis_Number;
	private String Status;
	private String Color;
	private String Price;
	private Double Load_Capacity;
	private int Dealer_Id;
	private int Seat_Capacity;
	private Double Vehicle_Horse_Power;
	private Double Vehicle_Kilowatt;
	private int Hypothecated_To_Id;
	private String Unladen_Weight;
	private String Letter_Number;
	private Date Letter_Date;
	private Date Purchase_Date;
	private int Manufacture_Year;
	private int Engine_CC;
	private int Manufactured_Country_Id;
	private String Purchase_Type;
	private String Renewal_Amount;
	private int Renewal_Duration;
	private int Conversion_Reason_Id;
	private int Cancellation_Reason_Id;
	private String Transferor_Customer_Id;
	private Date Transfer_Date;
	private String Transferee_Type;
	private String Transferee_Customer_Id;
	private Date Duplicate_Issue_Date;
	private Date Expiry_Date;
	private Date Receipt_Date;
	private String Receipt_Number;
	private int Sale_Deed_Amount;
	private Date Sale_Deed_Date;
	private Date App_Submission_Date;
	private Date App_Verification_Date;
	private Date App_Approval_Date;
	private int Bus_Type_Id;
	private String Remarks;
	private String Created_By;
	private String Updated_By;
	private String Traffic_Remarks;
	private String Conversion_Type;
	
	public VehicleApplicationModel() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getVehicle_Registration_Type() {
		return Vehicle_Registration_Type;
	}

	public void setVehicle_Registration_Type(String vehicle_Registration_Type) {
		Vehicle_Registration_Type = vehicle_Registration_Type;
	}

	public String getCustomer_Id() {
		return Customer_Id;
	}

	public void setCustomer_Id(String customer_Id) {
		Customer_Id = customer_Id;
	}

	public String getRegistration_Type() {
		return Registration_Type;
	}

	public void setRegistration_Type(String registration_Type) {
		Registration_Type = registration_Type;
	}

	public String getAmount() {
		return Amount;
	}

	public void setAmount(String amount) {
		Amount = amount;
	}

	public int getVehicle_Registration_Id() {
		return Vehicle_Registration_Id;
	}

	public void setVehicle_Registration_Id(int vehicle_Registration_Id) {
		Vehicle_Registration_Id = vehicle_Registration_Id;
	}

	public int getRegion_Id() {
		return Region_Id;
	}

	public void setRegion_Id(int region_Id) {
		Region_Id = region_Id;
	}

	public String getVehicle_Prefix() {
		return Vehicle_Prefix;
	}

	public void setVehicle_Prefix(String vehicle_Prefix) {
		Vehicle_Prefix = vehicle_Prefix;
	}

	public String getVehicle_Number() {
		return Vehicle_Number;
	}

	public void setVehicle_Number(String vehicle_Number) {
		Vehicle_Number = vehicle_Number;
	}

	public int getVehicle_Id() {
		return Vehicle_Id;
	}

	public void setVehicle_Id(int vehicle_Id) {
		Vehicle_Id = vehicle_Id;
	}

	public int getVehicle_Type_Id() {
		return Vehicle_Type_Id;
	}

	public void setVehicle_Type_Id(int vehicle_Type_Id) {
		Vehicle_Type_Id = vehicle_Type_Id;
	}

	public String getVanity_Number() {
		return Vanity_Number;
	}

	public void setVanity_Number(String vanity_Number) {
		Vanity_Number = vanity_Number;
	}

	public int getVehicle_Company_Id() {
		return Vehicle_Company_Id;
	}

	public void setVehicle_Company_Id(int vehicle_Company_Id) {
		Vehicle_Company_Id = vehicle_Company_Id;
	}

	public int getVehicle_Model_Id() {
		return Vehicle_Model_Id;
	}

	public void setVehicle_Model_Id(int vehicle_Model_Id) {
		Vehicle_Model_Id = vehicle_Model_Id;
	}

	public int getEngine_Type_Id() {
		return Engine_Type_Id;
	}

	public void setEngine_Type_Id(int engine_Type_Id) {
		Engine_Type_Id = engine_Type_Id;
	}

	public String getEngine_Number() {
		return Engine_Number;
	}

	public void setEngine_Number(String engine_Number) {
		Engine_Number = engine_Number;
	}

	public String getChasis_Number() {
		return Chasis_Number;
	}

	public void setChasis_Number(String chasis_Number) {
		Chasis_Number = chasis_Number;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public Double getLoad_Capacity() {
		return Load_Capacity;
	}

	public void setLoad_Capacity(Double load_Capacity) {
		Load_Capacity = load_Capacity;
	}

	public int getDealer_Id() {
		return Dealer_Id;
	}

	public void setDealer_Id(int dealer_Id) {
		Dealer_Id = dealer_Id;
	}

	public int getSeat_Capacity() {
		return Seat_Capacity;
	}

	public void setSeat_Capacity(int seat_Capacity) {
		Seat_Capacity = seat_Capacity;
	}

	public Double getVehicle_Horse_Power() {
		return Vehicle_Horse_Power;
	}

	public void setVehicle_Horse_Power(Double vehicle_Horse_Power) {
		Vehicle_Horse_Power = vehicle_Horse_Power;
	}

	public Double getVehicle_Kilowatt() {
		return Vehicle_Kilowatt;
	}

	public void setVehicle_Kilowatt(Double vehicle_Kilowatt) {
		Vehicle_Kilowatt = vehicle_Kilowatt;
	}

	public int getHypothecated_To_Id() {
		return Hypothecated_To_Id;
	}

	public void setHypothecated_To_Id(int hypothecated_To_Id) {
		Hypothecated_To_Id = hypothecated_To_Id;
	}

	public String getUnladen_Weight() {
		return Unladen_Weight;
	}

	public void setUnladen_Weight(String unladen_Weight) {
		Unladen_Weight = unladen_Weight;
	}

	public String getLetter_Number() {
		return Letter_Number;
	}

	public void setLetter_Number(String letter_Number) {
		Letter_Number = letter_Number;
	}

	public Date getLetter_Date() {
		return Letter_Date;
	}

	public void setLetter_Date(Date letter_Date) {
		Letter_Date = letter_Date;
	}

	public Date getPurchase_Date() {
		return Purchase_Date;
	}

	public void setPurchase_Date(Date purchase_Date) {
		Purchase_Date = purchase_Date;
	}

	public int getManufacture_Year() {
		return Manufacture_Year;
	}

	public void setManufacture_Year(int manufacture_Year) {
		Manufacture_Year = manufacture_Year;
	}

	public int getEngine_CC() {
		return Engine_CC;
	}

	public void setEngine_CC(int engine_CC) {
		Engine_CC = engine_CC;
	}

	public int getManufactured_Country_Id() {
		return Manufactured_Country_Id;
	}

	public void setManufactured_Country_Id(int manufactured_Country_Id) {
		Manufactured_Country_Id = manufactured_Country_Id;
	}

	public String getPurchase_Type() {
		return Purchase_Type;
	}

	public void setPurchase_Type(String purchase_Type) {
		Purchase_Type = purchase_Type;
	}

	public String getRenewal_Amount() {
		return Renewal_Amount;
	}

	public void setRenewal_Amount(String renewal_Amount) {
		Renewal_Amount = renewal_Amount;
	}

	public int getRenewal_Duration() {
		return Renewal_Duration;
	}

	public void setRenewal_Duration(int renewal_Duration) {
		Renewal_Duration = renewal_Duration;
	}

	public int getConversion_Reason_Id() {
		return Conversion_Reason_Id;
	}

	public void setConversion_Reason_Id(int conversion_Reason_Id) {
		Conversion_Reason_Id = conversion_Reason_Id;
	}

	public int getCancellation_Reason_Id() {
		return Cancellation_Reason_Id;
	}

	public void setCancellation_Reason_Id(int cancellation_Reason_Id) {
		Cancellation_Reason_Id = cancellation_Reason_Id;
	}

	public String getTransferor_Customer_Id() {
		return Transferor_Customer_Id;
	}

	public void setTransferor_Customer_Id(String transferor_Customer_Id) {
		Transferor_Customer_Id = transferor_Customer_Id;
	}

	public Date getTransfer_Date() {
		return Transfer_Date;
	}

	public void setTransfer_Date(Date transfer_Date) {
		Transfer_Date = transfer_Date;
	}

	public String getTransferee_Type() {
		return Transferee_Type;
	}

	public void setTransferee_Type(String transferee_Type) {
		Transferee_Type = transferee_Type;
	}

	public String getTransferee_Customer_Id() {
		return Transferee_Customer_Id;
	}

	public void setTransferee_Customer_Id(String transferee_Customer_Id) {
		Transferee_Customer_Id = transferee_Customer_Id;
	}

	public Date getDuplicate_Issue_Date() {
		return Duplicate_Issue_Date;
	}

	public void setDuplicate_Issue_Date(Date duplicate_Issue_Date) {
		Duplicate_Issue_Date = duplicate_Issue_Date;
	}

	public Date getExpiry_Date() {
		return Expiry_Date;
	}

	public void setExpiry_Date(Date expiry_Date) {
		Expiry_Date = expiry_Date;
	}

	public Date getReceipt_Date() {
		return Receipt_Date;
	}

	public void setReceipt_Date(Date receipt_Date) {
		Receipt_Date = receipt_Date;
	}

	public String getReceipt_Number() {
		return Receipt_Number;
	}

	public void setReceipt_Number(String receipt_Number) {
		Receipt_Number = receipt_Number;
	}

	public int getSale_Deed_Amount() {
		return Sale_Deed_Amount;
	}

	public void setSale_Deed_Amount(int sale_Deed_Amount) {
		Sale_Deed_Amount = sale_Deed_Amount;
	}

	public Date getSale_Deed_Date() {
		return Sale_Deed_Date;
	}

	public void setSale_Deed_Date(Date sale_Deed_Date) {
		Sale_Deed_Date = sale_Deed_Date;
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

	public int getBus_Type_Id() {
		return Bus_Type_Id;
	}

	public void setBus_Type_Id(int bus_Type_Id) {
		Bus_Type_Id = bus_Type_Id;
	}

	public String getRemarks() {
		return Remarks;
	}

	public void setRemarks(String remarks) {
		Remarks = remarks;
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

	public String getTraffic_Remarks() {
		return Traffic_Remarks;
	}

	public void setTraffic_Remarks(String traffic_Remarks) {
		Traffic_Remarks = traffic_Remarks;
	}

	public String getConversion_Type() {
		return Conversion_Type;
	}

	public void setConversion_Type(String conversion_Type) {
		Conversion_Type = conversion_Type;
	}
	
	

}
