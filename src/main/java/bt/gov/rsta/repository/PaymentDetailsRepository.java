package bt.gov.rsta.repository;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import bt.gov.rsta.model.PaymentDetailsModel;

public interface PaymentDetailsRepository extends JpaRepository<PaymentDetailsModel, Integer>{
	
	@Query(value = "SELECT * FROM t_payment_dtls WHERE Application_Number = ?1", nativeQuery = true)
	public List<PaymentDetailsModel> paymentDetails(String application_number);
	
	 @Transactional
	 @Modifying
	 @Query(value = "UPDATE t_payment_dtls set Receipt_No =?1, Receipt_Date = ?2, Is_Payment_Successful = ?3 where Application_Number = ?4",
	            nativeQuery = true)
	public void updatePaymentDetails(String Receipt_No, Date Receipt_Date, String Is_Payment_Successful,String application_number);

	 @Query(value = "SELECT  * FROM t_payment_dtls ORDER BY Created_On DESC LIMIT 1;", nativeQuery = true)
	public PaymentDetailsModel getApplicationNumber();
		
}
