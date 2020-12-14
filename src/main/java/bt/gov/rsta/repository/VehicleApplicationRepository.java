package bt.gov.rsta.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import bt.gov.rsta.model.VehicleApplicationModel;

public interface VehicleApplicationRepository extends JpaRepository<VehicleApplicationModel, String>{
	
	@Query(value = "SELECT * FROM t_vehicle_application WHERE Application_Number = ?1", nativeQuery = true)
	public List<VehicleApplicationModel> vehicleApplicationDetails(String application_number);

}
