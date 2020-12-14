package bt.gov.rsta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import bt.gov.rsta.model.TaskDetailsModel;

public interface TaskDetailsRepository extends JpaRepository<TaskDetailsModel, Integer>{
	
	@Query(value = "SELECT * FROM t_task_dtls WHERE Application_Number = ?1", nativeQuery = true)
	public List<TaskDetailsModel> taskDetails(String application_number);

}
