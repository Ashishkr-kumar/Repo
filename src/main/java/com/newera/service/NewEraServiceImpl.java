package com.newera.service;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newera.dao.ServiceDao;
import com.newera.model.ContactForm;
import com.newera.model.Email;
import com.newera.model.Login;
import com.newera.model.Registration;
import com.newera.model.ResetPassword;
import com.newera.model.RewardPoint;
import com.newera.util.ConnectionUtil;
import com.newera.util.Constants;
import com.oracle.xmlns.adf.svc.types.DataObjectResult;

@Service("newEraService")
public class NewEraServiceImpl implements NewEraService {

	@Autowired
	ServiceDao serviceDao;

	@Autowired
	EmailService emailService;

	public void setServiceDao(ServiceDao serviceDao) {
		this.serviceDao = serviceDao;
	}

	public DataObjectResult createContact(Registration registration) {

		DataObjectResult id = null;
		if (null != registration) {
			String saltedPassword = registration.getPassword();
			String encryptedPassword = ConnectionUtil
					.generateHash(saltedPassword);
			registration.setPassword(encryptedPassword);
			id = serviceDao.createContact(registration);
			if (id != null) {
				return id;
			} else {
				return id;
			}
		}
		return id;
	}

	public Registration verifyLogin(Login login) {
		Registration response = null;
		if (null != login) {
			if (null != login.getPassword() && login.getEmail() != null) {
				String password = ConnectionUtil.generateHash(login
						.getPassword());
				login.setPassword(password);
				response = serviceDao.verifyLogin(login);
			} else {
				// response = "Enter Email or Password";
			}
		}
		return response;
	}

	public String resetPassword(Login login) {
		String response = null;
		if (null != login) {
			char[] pswd = ConnectionUtil.generatePswd(Constants.minLen,
					Constants.maxLen, Constants.noOfCAPSAlpha,
					Constants.noOfDigits, Constants.noOfSplChars);
			String password = ConnectionUtil.generateHash(new String(pswd));
			response = serviceDao.resetPassword(login.getEmail(), password);
			if (response != null
					&& response
							.contains("Password has been reseted sucessfully")) {
				String content = "Your Password has been reseted successfully and your new password is"
						+ new String(pswd) + ".";
				Email email = new Email();
				email.setRecipient(login.getEmail());
				email.setSubject("Rest password Mail.");
				email.setContent(content);
				emailService.emailConfiguration(email);
			}
		}
		return response;
	}

	public String changePassword(ResetPassword resetPassword) {
		String response = null;
		if (null != resetPassword && null != resetPassword.getNewPassword()
				&& null != resetPassword.getCurrentPassword()
				&& null != resetPassword.getcPassword()) {

			String currentPassword = ConnectionUtil.generateHash(resetPassword
					.getCurrentPassword());
			String encryptedpassword = ConnectionUtil
					.generateHash(resetPassword.getNewPassword());
			resetPassword.setNewPassword(encryptedpassword);
			resetPassword.setCurrentPassword(currentPassword);
			response = serviceDao.verifyResetPassword(resetPassword);
			if (response != null) {
				response = "Password Changed";
			} else {
				response = "Problem in password Change";
			}
		}
		return response;
	}

	public Registration getUserProfile(String email) {
		Registration reg = null;
		if (null != email) {
			reg = serviceDao.getUseerProfile(email);
		}
		return reg;
	}

	public void report(RewardPoint points) {
		int requestpoint;
		int totalpoint;
		int finalpoint;
		String reportPath = null;
		Registration reg = null;
		try {

			if (points != null && points.getEmail() != null) {
				requestpoint = Integer.parseInt(points.getRewardPoint());
				reg = getUserProfile(points.getEmail());
				if (reg != null && reg.getRewardpoints() != null) {
					totalpoint = Integer.parseInt(reg.getRewardpoints());
					if (requestpoint > 0 && requestpoint <= totalpoint) {
						finalpoint = totalpoint - requestpoint;
						reg.setRewardpoints(Integer.toString(finalpoint));
						RewardPoint point = new RewardPoint();
						point.setNewValue_c(finalpoint);
						point.setOldValue_c(totalpoint);
						point.setRewardPoints_c(requestpoint);
						serviceDao.updateRewardPoints(reg, point);
						reg.setRewardpoints(Integer.toString(requestpoint));
					}
				}

			}

			reportPath = ConnectionUtil.genrateReport(reg);
			String[] attachFiles = new String[1];
			attachFiles[0] = reportPath;
			Email email = new Email();
			email.setRecipient(reg.getEmail());
			email.setSubject("New Era Voucher");
			String msg = "<b>Hi "
					+ reg.getFname()
					+ " "
					+ reg.getLname()
					+ ",<b><br><br>"
					+ "   Please find the attchment for new era voucher<br><br><br>"
					+ "   <b>Thanks & Regards<b><br>" + "   <b>New Era<b>";
			email.setContent(msg);
			email.setAttachFiles(attachFiles);
			emailService.emailConfiguration(email);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createContacts(ContactForm contact) {

		if (null != contact) {
			String msg = "<b>Name of Customer: </b>" + contact.getName()
					+ "</b><br><br>" + "<b>Email Id of Customer: "
					+ contact.getEmail() + "</b><br><br>"
					+ "<b>Mobile Number of Customer: " + contact.getMobile()
					+ "</b><br><br>" + "<b>Requirement of Customer: "
					+ contact.getRequirement() + "<br>"
					+ "<b>Thanks & Regards<b><br>" + "<b>" + contact.getName()
					+ "</b>";
			Email email = new Email();
			email.setRecipient("ashish.kumar@speridian.com");
			email.setSubject("Contact details of " + contact.getName());
			email.setContent(msg);
			emailService.emailConfiguration(email);
		}
	}
}
