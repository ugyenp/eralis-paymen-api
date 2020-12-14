package bt.gov.rsta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.rsta.model.DrivingLicenseApplicationModel;
import bt.gov.rsta.model.PaymentDetailsModel;
import bt.gov.rsta.model.TaskDetailsModel;
import bt.gov.rsta.model.VehicleApplicationModel;
import bt.gov.rsta.model.WorkflowDetailsModel;
import bt.gov.rsta.repository.DrivingLicenseApplicationRepository;
import bt.gov.rsta.repository.PaymentDetailsRepository;
import bt.gov.rsta.repository.TaskDetailsRepository;
import bt.gov.rsta.repository.VehicleApplicationRepository;
import bt.gov.rsta.repository.WorkflowDetailsRepository;

@RestController
@CrossOrigin(value = "http://localhost:4200")
public class GetEralisPaymentDataController {

	@Autowired
	private VehicleApplicationRepository vehicleApplicationRepository;
	
	@Autowired
	private DrivingLicenseApplicationRepository drivingLicenseApplicationRepository;
	
	@Autowired
	private PaymentDetailsRepository paymentDetailsRepository;
	
	@Autowired
	TaskDetailsRepository taskDetailsRepository;
	
	@Autowired 
	WorkflowDetailsRepository workflowDetailsRepository;
	
	@GetMapping("/vehicleApplicationDetails/{application_number}")
	public List<VehicleApplicationModel> vehicleApplicationDetails(@PathVariable ("application_number") String application_number){
		return vehicleApplicationRepository.vehicleApplicationDetails(application_number);
	}
	
	@GetMapping("/drivingLicenseApplicationDetails/{application_number}")
	public List<DrivingLicenseApplicationModel> drivingLicenseApplicationDetails(@PathVariable ("application_number") String application_number){
		return drivingLicenseApplicationRepository.drivingLicenseApplicationDetails(application_number);
	}
	
	@GetMapping("/paymentDetails/{application_number}")
	public List<PaymentDetailsModel> paymentDetails(@PathVariable ("application_number") String application_number){
		return paymentDetailsRepository.paymentDetails(application_number);
	}
	
	@GetMapping("/taskDetails/{application_number}")
	public List<TaskDetailsModel> taskDetails(@PathVariable ("application_number") String application_number){
		return taskDetailsRepository.taskDetails(application_number);	
	}
	
	@GetMapping("/workflowDetails/{application_number}")
	public List<WorkflowDetailsModel> workflowDetails(@PathVariable ("application_number") String application_number){
		return workflowDetailsRepository.workflowDetails(application_number);
		
	}
}
