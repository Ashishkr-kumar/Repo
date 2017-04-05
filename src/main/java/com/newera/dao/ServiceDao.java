package com.newera.dao;



import com.newera.model.Login;
import com.newera.model.Registration;
import com.newera.model.ResetPassword;
import com.newera.model.RewardPoint;
import com.oracle.xmlns.adf.svc.types.DataObjectResult;


public interface ServiceDao {

	DataObjectResult createContact(Registration registration);

	Registration verifyLogin(Login login);

	String resetPassword(String email, String string);

	String verifyResetPassword(ResetPassword resetPassword);

	Registration getUseerProfile(String email);

	void updateRewardPoints(Registration reg,RewardPoint point);

}
