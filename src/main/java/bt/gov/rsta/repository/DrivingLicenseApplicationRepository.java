package bt.gov.rsta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import bt.gov.rsta.model.DrivingLicenseApplicationModel;

public interface DrivingLicenseApplicationRepository extends JpaRepository<DrivingLicenseApplicationModel, String> {

	@Query(value = "SELECT * FROM t_driving_license_application WHERE Application_Number = ?1", nativeQuery = true)
	public List<DrivingLicenseApplicationModel> drivingLicenseApplicationDetails(String application_number);
}
