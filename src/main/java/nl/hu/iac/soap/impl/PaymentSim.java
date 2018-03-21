package nl.hu.iac.soap.impl;


import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import javax.jws.WebService;



import nl.hu.iac.soap.wsinterface.PaymentFault;
import nl.hu.iac.soap.wsinterface.PaymentFault_Exception;
import nl.hu.iac.soap.wsinterface.PaymentRequest;
import nl.hu.iac.soap.wsinterface.PaymentResponse;
import nl.hu.iac.soap.wsinterface.PaymentServiceInterface;





@WebService(endpointInterface = "nl.hu.iac.soap.wsinterface.PaymentServiceInterface")
public class PaymentSim implements PaymentServiceInterface {


@Override
public PaymentResponse paySim(PaymentRequest paymentRequest) throws PaymentFault_Exception {
	// TODO Auto-generated method stub
	PaymentResponse response = new PaymentResponse();
	
	String uniqueID = UUID.randomUUID().toString();
	try {
		
		TimeUnit.SECONDS.sleep(2);
		response.setSucces(uniqueID);
		
		
	} catch( Exception e){
		PaymentFault fault = new PaymentFault();
		fault.setMessage("Er ging iets fout bij uw betaling.");
		PaymentFault_Exception faultexp = new PaymentFault_Exception("Foutmelding",fault);
		throw faultexp;
	}
	
	
	return response;
}

}





