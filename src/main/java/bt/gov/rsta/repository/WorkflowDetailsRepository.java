package bt.gov.rsta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import bt.gov.rsta.model.WorkflowDetailsModel;

public interface WorkflowDetailsRepository extends JpaRepository<WorkflowDetailsModel, Integer> {

	@Query(value = "SELECT * FROM t_workflow_dtls WHERE Application_Number = ?1", nativeQuery = true)
	public List<WorkflowDetailsModel> workflowDetails(String application_number);
}
