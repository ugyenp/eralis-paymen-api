package bt.gov.rsta.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Service;


@Service
public class ApplicationNumberService {
	
	/*
	 * Author: Ugyen Penjor 
	 * Designation: Software Engineer 
	 * NGN Technologies Pvt Ltd @ 2020
	 */

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public String applicationNumberVehicle(String service_identifier){
		@SuppressWarnings("rawtypes")
		List results = null;
		String queryStr = "SELECT \r\n" + 
				"  CONCAT(\r\n" + 
				"    'PN',\r\n" + 
				"    Service_Id,\r\n" + 
				"    DATE_FORMAT(CURDATE(), '%y'),\r\n" + 
				"    DATE_FORMAT(CURDATE(), '%m'),\r\n" + 
				"    DATE_FORMAT(CURDATE(), '%d'),\r\n" + 
				"    IF(\r\n" + 
				"      newapp < 10,\r\n" + 
				"      CONCAT('000', newapp),\r\n" + 
				"      IF(\r\n" + 
				"        newapp < 100,\r\n" + 
				"        CONCAT('00', newapp),\r\n" + 
				"        IF(\r\n" + 
				"          newapp < 1000,\r\n" + 
				"          CONCAT('0', newapp),\r\n" + 
				"          newapp\r\n" + 
				"        )\r\n" + 
				"      )\r\n" + 
				"    )\r\n" + 
				"  ) newApplication \r\n" + 
				"FROM\r\n" + 
				"  (SELECT \r\n" + 
				"    (\r\n" + 
				"      RIGHT(\r\n" + 
				"        IF(\r\n" + 
				"          a.Application_Number IS NULL,\r\n" + 
				"          '0000',\r\n" + 
				"          a.Application_Number\r\n" + 
				"        ),\r\n" + 
				"        4\r\n" + 
				"      ) + 1\r\n" + 
				"    ) newapp,\r\n" + 
				"    b.`Service_Id`,\r\n" + 
				"    SUBSTRING(a.Application_Number, 3, 3) AS serviceId \r\n" + 
				"  FROM\r\n" + 
				"    `t_service_master` b \r\n" + 
				"    LEFT JOIN t_vehicle_application a \r\n" + 
				"      ON b.`Service_Identifier` = a.`Application_Type` \r\n" + 
				"      AND a.App_Submission_Date = CURDATE() \r\n" + 
				"  WHERE b.`Service_Identifier` = ?1 \r\n" + 
				"    AND b.`Service_Name` LIKE '%vehicle%' \r\n" + 
				"  ORDER BY a.Application_Number DESC \r\n" + 
				"  LIMIT 1) t1 ";
		try {
			Query query = entityManager.createNativeQuery(queryStr);
			query.setParameter(1, service_identifier);
			results = query.getResultList();
		} catch(Exception e) {
			e.printStackTrace();
		}

		String listString = String.join(", ", results);
		return listString;
	}
	
	
	@SuppressWarnings("unchecked")
	public String applicationNumberDrivingLicense(String service_identifier){
		@SuppressWarnings("rawtypes")
		List results = null;
		String queryStr = "SELECT \r\n" + 
				"  CONCAT(\r\n" + 
				"    'PN',\r\n" + 
				"    Service_Id,\r\n" + 
				"    DATE_FORMAT(CURDATE(), '%y'),\r\n" + 
				"    DATE_FORMAT(CURDATE(), '%m'),\r\n" + 
				"    DATE_FORMAT(CURDATE(), '%d'),\r\n" + 
				"    IF(\r\n" + 
				"        newapp < 10,\r\n" + 
				"      CONCAT('000', newapp),\r\n" + 
				"      IF(\r\n" + 
				"        newapp < 100,\r\n" + 
				"        CONCAT('00', newapp),\r\n" + 
				"        IF(\r\n" + 
				"          newapp < 1000,\r\n" + 
				"          CONCAT('0', newapp),\r\n" + 
				"          newapp\r\n" + 
				"        )\r\n" + 
				"      )\r\n" + 
				"    )\r\n" + 
				"  ) newApplication \r\n" + 
				"FROM\r\n" + 
				"  (SELECT \r\n" + 
				"    (\r\n" + 
				"      RIGHT(\r\n" + 
				"        IF(\r\n" + 
				"          a.Application_Number IS NULL,\r\n" + 
				"          '0000',\r\n" + 
				"          a.Application_Number\r\n" + 
				"        ),\r\n" + 
				"        4\r\n" + 
				"      ) + 1\r\n" + 
				"    ) newapp,\r\n" + 
				"    b.`Service_Id`,\r\n" + 
				"    SUBSTRING(a.Application_Number, 3, 3) AS serviceId \r\n" + 
				"  FROM\r\n" + 
				"    `t_service_master` b \r\n" + 
				"    LEFT JOIN t_driving_license_application a \r\n" + 
				"      ON b.`Service_Identifier` = a.`Application_Type` \r\n" + 
				"      AND a.App_Submission_Date = CURDATE() \r\n" + 
				"  WHERE b.`Service_Identifier` = ?1 \r\n" + 
				"    AND b.`Service_Name` LIKE '%driving%' \r\n" + 
				"  ORDER BY a.Application_Number DESC \r\n" + 
				"  LIMIT 1) t1 ;\r\n";
				
		try {
			Query query = entityManager.createNativeQuery(queryStr);
			query.setParameter(1, service_identifier);
			results = query.getResultList();
		} catch(Exception e) {
			e.printStackTrace();
		}

		String listString = String.join(", ", results);
		return listString;
	}


	@SuppressWarnings("unchecked")
	public String applicationNumberLearnerLicense(String service_identifier){
		@SuppressWarnings("rawtypes")
		List results = null;
		String queryStr = "SELECT \r\n" + 
				"  CONCAT(\r\n" + 
				"    'PN',\r\n" + 
				"    Service_Id,\r\n" + 
				"    DATE_FORMAT(CURDATE(), '%y'),\r\n" + 
				"    DATE_FORMAT(CURDATE(), '%m'),\r\n" + 
				"    DATE_FORMAT(CURDATE(), '%d'),\r\n" + 
				"    IF(\r\n" + 
				"      newapp < 10,\r\n" + 
				"      CONCAT('000', newapp),\r\n" + 
				"      IF(\r\n" + 
				"        newapp < 100,\r\n" + 
				"        CONCAT('00', newapp),\r\n" + 
				"        IF(\r\n" + 
				"          newapp < 1000,\r\n" + 
				"          CONCAT('0', newapp),\r\n" + 
				"          newapp\r\n" + 
				"        )\r\n" + 
				"      )\r\n" + 
				"    )\r\n" + 
				"  ) newApplication \r\n" + 
				"FROM\r\n" + 
				"  (SELECT \r\n" + 
				"    (\r\n" + 
				"      RIGHT(\r\n" + 
				"        IF(\r\n" + 
				"          a.Application_Number IS NULL,\r\n" + 
				"          '0000',\r\n" + 
				"          a.Application_Number\r\n" + 
				"        ),\r\n" + 
				"        4\r\n" + 
				"      ) +1\r\n" + 
				"    ) newapp,\r\n" + 
				"    b.`Service_Id`,\r\n" + 
				"    SUBSTRING(a.Application_Number, 3, 3) AS serviceId \r\n" + 
				"  FROM\r\n" + 
				"    `t_service_master` b \r\n" + 
				"    LEFT JOIN t_learner_license_application a \r\n" + 
				"      ON b.`Service_Identifier` = a.`Application_Type` \r\n" + 
				"      AND a.App_Submission_Date = CURDATE() \r\n" + 
				"  WHERE b.`Service_Identifier` = ?1 \r\n" + 
				"    AND b.`Service_Name` LIKE '%LEARNER%' \r\n" + 
				"  ORDER BY a.Application_Number DESC \r\n" + 
				"  LIMIT 1) t1 ;\r\n";
				
		try {
			Query query = entityManager.createNativeQuery(queryStr);
			query.setParameter(1, service_identifier);
			results = query.getResultList();
		} catch(Exception e) {
			e.printStackTrace();
		}

		String listString = String.join(", ", results);
		return listString;
	}


}
