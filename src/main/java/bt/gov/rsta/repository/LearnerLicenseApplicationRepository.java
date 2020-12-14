package bt.gov.rsta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bt.gov.rsta.model.LearnerLicenseApplicationModel;

public interface LearnerLicenseApplicationRepository extends JpaRepository<LearnerLicenseApplicationModel, String>{

	
}
