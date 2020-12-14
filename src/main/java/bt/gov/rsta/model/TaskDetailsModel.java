package bt.gov.rsta.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_task_dtls")
public class TaskDetailsModel {
	@Id
	private int Task_Id;
	private int Instance_Id;
	private int Seq_Details_Id;
	private String Application_Number;
	private String Assigned_User_Id;
	private int Task_State_Id;
	private String Task_Remark;
	private Date Action_Date;
	
	public TaskDetailsModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTask_Id() {
		return Task_Id;
	}

	public void setTask_Id(int task_Id) {
		Task_Id = task_Id;
	}

	public int getInstance_Id() {
		return Instance_Id;
	}

	public void setInstance_Id(int instance_Id) {
		Instance_Id = instance_Id;
	}

	public int getSeq_Details_Id() {
		return Seq_Details_Id;
	}

	public void setSeq_Details_Id(int seq_Details_Id) {
		Seq_Details_Id = seq_Details_Id;
	}

	public String getApplication_Number() {
		return Application_Number;
	}

	public void setApplication_Number(String application_Number) {
		Application_Number = application_Number;
	}

	public String getAssigned_User_Id() {
		return Assigned_User_Id;
	}

	public void setAssigned_User_Id(String assigned_User_Id) {
		Assigned_User_Id = assigned_User_Id;
	}

	public int getTask_State_Id() {
		return Task_State_Id;
	}

	public void setTask_State_Id(int task_State_Id) {
		Task_State_Id = task_State_Id;
	}

	public String getTask_Remark() {
		return Task_Remark;
	}

	public void setTask_Remark(String task_Remark) {
		Task_Remark = task_Remark;
	}

	public Date getAction_Date() {
		return Action_Date;
	}

	public void setAction_Date(Date action_Date) {
		Action_Date = action_Date;
	}
	

}
