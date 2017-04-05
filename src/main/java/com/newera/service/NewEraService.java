package com.newera.service;


import com.newera.model.ContactForm;
import com.newera.model.Incentive;
import com.newera.model.Login;
import com.newera.model.Registration;
import com.newera.model.ResetPassword;
import com.newera.model.RewardPoint;
import com.oracle.xmlns.adf.svc.types.DataObjectResult;

public interface NewEraService {

	DataObjectResult createContact(Registration registration);
	public Registration verifyLogin(Login login);
	String resetPassword(Login login);
	String changePassword(ResetPassword resetPassword);
	Registration getUserProfile(String email);
	void report(RewardPoint point);
	void createContacts(ContactForm contact);
	
}
