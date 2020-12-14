package bt.gov.rsta.controller;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.rsta.model.DrivingLicenseApplicationModel;
import bt.gov.rsta.model.LearnerLicenseApplicationModel;
import bt.gov.rsta.model.PaymentDetailsModel;
import bt.gov.rsta.model.TaskDetailsModel;
import bt.gov.rsta.model.VehicleApplicationModel;
import bt.gov.rsta.model.WorkflowDetailsModel;
import bt.gov.rsta.repository.DrivingLicenseApplicationRepository;
import bt.gov.rsta.repository.LearnerLicenseApplicationRepository;
import bt.gov.rsta.repository.PaymentDetailsRepository;
import bt.gov.rsta.repository.TaskDetailsRepository;
import bt.gov.rsta.repository.VehicleApplicationRepository;
import bt.gov.rsta.repository.WorkflowDetailsRepository;
import bt.gov.rsta.service.ApplicationNumberService;

@RestController
@CrossOrigin(value = "http://localhost:4200")
public class AmountController {

	@Autowired
	private VehicleApplicationRepository vehicleApplicationRepository;

	@Autowired
	private DrivingLicenseApplicationRepository drivingLicenseApplicationRepository;
	
	@Autowired
	private LearnerLicenseApplicationRepository learnerLicenseApplicationRepository;

	@Autowired
	private WorkflowDetailsRepository workflowDetailsRepository;

	@Autowired
	private TaskDetailsRepository taskDetailsRepository;

	@Autowired
	private PaymentDetailsRepository paymentDetailsRepository;

	@Autowired
	private ApplicationNumberService applicationNumberService;

	@PostMapping("/eralisPaymentVehicle/{service_type}")
	private void savePaymentDetailsVehicle(@PathVariable("service_type") String service_type,
			@RequestBody VehicleApplicationModel vehicleApplicationModel, DrivingLicenseApplicationModel drivingLicenseApplicationModel) {
		TaskDetailsModel taskDetailsModel = new TaskDetailsModel();
		WorkflowDetailsModel workflowDetailsModel = new WorkflowDetailsModel();
		PaymentDetailsModel paymentDetailsModel = new PaymentDetailsModel();
		String applicationNumber = null;

		if (service_type.equalsIgnoreCase("Vehicle Replacement")) {
			vehicleApplicationModel.setApplication_Type("DUPLICATION");
			applicationNumber = applicationNumberService.applicationNumberVehicle("DUPLICATION");
			vehicleApplicationModel.setApplication_Number(applicationNumber);
			vehicleApplicationRepository.save(vehicleApplicationModel);
			
		} else if (service_type.equalsIgnoreCase("Vehicle Renewal")) {
			vehicleApplicationModel.setApplication_Type("RENEWAL");
			applicationNumber = applicationNumberService.applicationNumberVehicle("RENEWAL");
			vehicleApplicationModel.setApplication_Number(applicationNumber);
			vehicleApplicationRepository.save(vehicleApplicationModel);
		}
		taskDetailsModel.setApplication_Number(applicationNumber);
		workflowDetailsModel.setApplication_Number(applicationNumber);
		paymentDetailsModel.setApplication_Number(applicationNumber);
		paymentDetailsModel.setAmount(Double.parseDouble(vehicleApplicationModel.getAmount()));
		paymentDetailsModel.setApplication_Type(vehicleApplicationModel.getApplication_Type());
		taskDetailsRepository.save(taskDetailsModel);
		paymentDetailsRepository.save(paymentDetailsModel);
		workflowDetailsRepository.save(workflowDetailsModel);
	}

	@PostMapping("/eralisPaymentLicense/{service_type}")
	private void savePaymentDetailsDrivingLicense(@PathVariable("service_type") String service_type,
			@RequestBody DrivingLicenseApplicationModel drivingLicenseApplicationModel) {
		TaskDetailsModel taskDetailsModel = new TaskDetailsModel();
		WorkflowDetailsModel workflowDetailsModel = new WorkflowDetailsModel();
		PaymentDetailsModel paymentDetailsModel = new PaymentDetailsModel();
		String applicationNumber = null;

		if(service_type.equalsIgnoreCase("Driving License Renewal")) {
			drivingLicenseApplicationModel.setApplication_Type("LICENSERENEWAL");
			applicationNumber = applicationNumberService.applicationNumberDrivingLicense("LICENSERENEWAL");
			drivingLicenseApplicationModel.setApplication_Number(applicationNumber);
			drivingLicenseApplicationRepository.save(drivingLicenseApplicationModel);
		} else if(service_type.equalsIgnoreCase("Driving License Replacement")) {
			drivingLicenseApplicationModel.setApplication_Type("LICENSEDUPLICATION");
			applicationNumber = applicationNumberService.applicationNumberDrivingLicense("LICENSEDUPLICATION");
			drivingLicenseApplicationModel.setApplication_Number(applicationNumber);
			drivingLicenseApplicationRepository.save(drivingLicenseApplicationModel);
		}
		taskDetailsModel.setApplication_Number(applicationNumber);
		workflowDetailsModel.setApplication_Number(applicationNumber);
		paymentDetailsModel.setApplication_Number(applicationNumber);
		paymentDetailsModel.setApplication_Type(drivingLicenseApplicationModel.getApplication_Type());
		paymentDetailsModel.setAmount(Double.parseDouble(drivingLicenseApplicationModel.getAmount()));
		taskDetailsRepository.save(taskDetailsModel);
		paymentDetailsRepository.save(paymentDetailsModel);
		workflowDetailsRepository.save(workflowDetailsModel);
		
	}
	
	@PostMapping("/eralisPaymentLearnerLicense/{service_type}")
	private void savePaymentDetailsLearnerLicense(@PathVariable("service_type") String service_type,
			@RequestBody LearnerLicenseApplicationModel learnerLicenseApplicationModel) {
		TaskDetailsModel taskDetailsModel = new TaskDetailsModel();
		WorkflowDetailsModel workflowDetailsModel = new WorkflowDetailsModel();
		PaymentDetailsModel paymentDetailsModel = new PaymentDetailsModel();
		String applicationNumber = null;

		if(service_type.equalsIgnoreCase("Learner License Renewal")) {
			learnerLicenseApplicationModel.setApplication_Type("RENEWAL");
			applicationNumber = applicationNumberService.applicationNumberLearnerLicense("RENEWAL");
			learnerLicenseApplicationModel.setApplication_Number(applicationNumber);
			learnerLicenseApplicationRepository.save(learnerLicenseApplicationModel);
		} 
		taskDetailsModel.setApplication_Number(applicationNumber);
		workflowDetailsModel.setApplication_Number(applicationNumber);
		paymentDetailsModel.setApplication_Number(applicationNumber);
		paymentDetailsModel.setApplication_Type(learnerLicenseApplicationModel.getApplication_Type());
		paymentDetailsModel.setAmount(Double.parseDouble(learnerLicenseApplicationModel.getAmount()));
		taskDetailsRepository.save(taskDetailsModel);
		paymentDetailsRepository.save(paymentDetailsModel);
		workflowDetailsRepository.save(workflowDetailsModel);
	}
	
	@GetMapping("/getApplicationNumber")
	public PaymentDetailsModel getApplicationNumber() {
	  return paymentDetailsRepository.getApplicationNumber();
	}
	
	@PostMapping("/gateWay/{application_number}")
	public PaymentDetailsModel gateWayResponse(@PathVariable ("application_number") String application_number) {
		return null;
	}

	@PostMapping("/updatePaymentDetails/{application_number}/{reciept_number}/{reciept_date}/{Is_Payment_Successful}")
	public void updatePaymentDetailsFromAggregator(@PathVariable ("application_number") String application_number, @PathVariable ("reciept_number") String reciept_number,
			@PathVariable ("reciept_date") Date reciept_date, @PathVariable ("Is_Payment_Successful") String Is_Payment_Successful) {	 
		paymentDetailsRepository.updatePaymentDetails(reciept_number, reciept_date, Is_Payment_Successful, application_number);
	}
	
	
	
}
