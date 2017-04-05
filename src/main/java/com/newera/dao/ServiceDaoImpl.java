package com.newera.dao;

import org.springframework.stereotype.Repository;


import com.newera.model.Login;
import com.newera.model.Registration;
import com.newera.model.ResetPassword;
import com.newera.model.RewardPoint;
import com.newera.util.ConnectionUtil;
import com.oracle.xmlns.adf.svc.types.Conjunction;
import com.oracle.xmlns.adf.svc.types.DataObjectResult;
import com.oracle.xmlns.adf.svc.types.FindControl;
import com.oracle.xmlns.adf.svc.types.FindCriteria;
import com.oracle.xmlns.adf.svc.types.ViewCriteria;
import com.oracle.xmlns.adf.svc.types.ViewCriteriaItem;
import com.oracle.xmlns.adf.svc.types.ViewCriteriaRow;
/*import com.oracle.xmlns.apps.cdm.foundation.custextn.extnservice.CrmCommonReferenceService;*/
import com.oracle.xmlns.apps.crmcommon.salesparties.contactservice.Contact;
import com.oracle.xmlns.apps.crmcommon.salesparties.contactservice.ContactService;
import com.oracle.xmlns.apps.crmcommon.salesparties.contactservice.ObjectFactory;
import com.oracle.xmlns.apps.crmcommon.salesparties.contactservice.ServiceException;

@Repository("serviceDao")
public class ServiceDaoImpl  implements
		ServiceDao {
	
	private static ContactService contactService=null;
	
	static{
		contactService = ConnectionUtil.getContactService();
	}

	public DataObjectResult createContact(Registration registration) {
		DataObjectResult response = null;
		ObjectFactory factory = new ObjectFactory();
		Contact contact = new Contact();
		contact.setFirstName(factory.createContactFirstName(registration
				.getFname()));
		contact.setLastName(factory.createContactLastName(registration
				.getLname()));
		contact.setMobileNumber(factory.createContactMobileNumber(registration
				.getMobile()));
		 /*contact.setPersonDEOUsernameC(factory
		  .createContactPersonDEOUsernameC(registration.getEmail()));
		  contact.setPersonDEOPasswordC(factory
		  .createContactPersonDEOPasswordC(registration.getPassword()));
		  contact.setEmailAddress(registration.getEmail());
		  contact.setPersonDEOLevelC(factory
		  .createContactPersonDEOPasswordC("Level 1"));*/
		 
		try {
			response = contactService.createContact(contact);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return response;

	}

	public Registration verifyLogin(Login login) {
		DataObjectResult findContactResponse = null;
		Registration response = null;
		Registration registration = new Registration();
		FindControl findControl = new FindControl();
		FindCriteria findCriteria = new FindCriteria();
		findCriteria.setFetchSize(-1);
		findCriteria.setFetchStart(0);
		ViewCriteria viewCriteria = new ViewCriteria();
		viewCriteria.setConjunction(Conjunction.AND);
		ViewCriteriaRow viewCriteriaRow = new ViewCriteriaRow();
		viewCriteriaRow.setConjunction(Conjunction.AND);
		viewCriteriaRow.setUpperCaseCompare(false);

		ViewCriteriaItem email = new ViewCriteriaItem();
		ViewCriteriaItem mobile = new ViewCriteriaItem();
		ViewCriteriaItem password = new ViewCriteriaItem();
		if (login.getEmail().matches("\\d+")) {
			mobile.setConjunction(Conjunction.AND);
			mobile.setUpperCaseCompare(false);
			mobile.setAttribute("MobileNumber");
			mobile.setOperator("=");
			mobile.getValue().add(login.getEmail());
			viewCriteriaRow.getItem().add(mobile);
		} else {
			email.setConjunction(Conjunction.AND);
			email.setUpperCaseCompare(false);
			email.setAttribute("EmailAddress");
			email.setOperator("=");
			email.getValue().add(login.getEmail());
			viewCriteriaRow.getItem().add(email);
		}
		password.setConjunction(Conjunction.AND);
		password.setUpperCaseCompare(false);
		password.setAttribute("PersonDEO_Password_c");
		password.setOperator("=");
		password.getValue().add(login.getPassword());
		viewCriteriaRow.getItem().add(password);
		viewCriteria.getGroup().add(viewCriteriaRow);
		findCriteria.setFilter(viewCriteria);
		try {
			findContactResponse = contactService.findContact(findCriteria,
					findControl);
			if (findContactResponse != null
					&& findContactResponse.getValue().size() > 0) {
				Contact contact = (Contact) findContactResponse.getValue().get(
						0);
				registration.setFname(contact.getFirstName().getValue());
				registration.setLname(contact.getLastName().getValue());
				registration.setEmail(contact.getEmailAddress());
				registration.setMobile(contact.getMobileNumber().getValue());
				registration.setRewardpoints(contact
				  .getPersonDEOTotalRewardPointsC().getValue());
				  registration.setResetPasswordInd(contact
				  .isPersonDEOPasswordResetC());
				 
				response = registration;
				/* loginreponse.setEmail(contact.getEmailAddress()); */
				/*
				 * if (contact.isPersonDEOPasswordResetC()) {
				 * loginreponse.setResetpasswordInd(true); } else {
				 * loginreponse.setResetpasswordInd(false); }
				 */} else {
				// response = "failed";
			}
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}

	public String resetPassword(String email, String password) {
		String response = null;
		DataObjectResult findContactResponse = null;
		ObjectFactory factory = new ObjectFactory();
		FindControl findControl = new FindControl();
		FindCriteria findCriteria = new FindCriteria();
		findCriteria.setFetchSize(-1);
		findCriteria.setFetchStart(0);
		ViewCriteria viewCriteria = new ViewCriteria();
		viewCriteria.setConjunction(Conjunction.AND);
		ViewCriteriaRow viewCriteriaRow = new ViewCriteriaRow();
		viewCriteriaRow.setConjunction(Conjunction.AND);
		ViewCriteriaItem viewCriteriaItem = new ViewCriteriaItem();
		viewCriteriaItem.setConjunction(Conjunction.AND);
		viewCriteriaItem.setUpperCaseCompare(false);
		viewCriteriaItem.setAttribute("EmailAddress");
		viewCriteriaItem.setOperator("=");
		viewCriteriaItem.getValue().add(email);
		viewCriteriaRow.getItem().add(viewCriteriaItem);
		viewCriteria.getGroup().add(viewCriteriaRow);
		findCriteria.setFilter(viewCriteria);
		try {
			findContactResponse = contactService.findContact(findCriteria,
					findControl);
			if (findContactResponse != null
					&& findContactResponse.getValue().size() > 0) {
				Contact contact = (Contact) findContactResponse.getValue().get(
						0);

				contact.setFirstName(contact.getFirstName());
				contact.setLastName(contact.getLastName());

				
				  contact.setPersonDEOPasswordResetC(Boolean.TRUE);
				  contact.setPersonDEOPasswordC(factory
				 .createContactPersonDEOPasswordC(password));
				contact.setPersonDEOLevelC(contact.getPersonDEOLevelC());
				contactService.updateContact(contact);
				response = "Password has been reseted sucessfully";
			}

		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return response;
	}

	public String verifyResetPassword(ResetPassword resetPassword) {

		DataObjectResult findContactResponse = null;
		ObjectFactory factory = new ObjectFactory();
		String response = null;
		FindControl findControl = new FindControl();
		FindCriteria findCriteria = new FindCriteria();
		findCriteria.setFetchSize(-1);
		findCriteria.setFetchStart(0);
		ViewCriteria viewCriteria = new ViewCriteria();
		viewCriteria.setConjunction(Conjunction.AND);
		ViewCriteriaRow viewCriteriaRow = new ViewCriteriaRow();
		viewCriteriaRow.setConjunction(Conjunction.AND);
		viewCriteriaRow.setUpperCaseCompare(false);

		ViewCriteriaItem email = new ViewCriteriaItem();
		ViewCriteriaItem password = new ViewCriteriaItem();
		if (resetPassword.getEmail() != null) {
			email.setConjunction(Conjunction.AND);
			email.setUpperCaseCompare(false);
			email.setAttribute("EmailAddress");
			email.setOperator("=");
			email.getValue().add(resetPassword.getEmail());
			email.setConjunction(Conjunction.AND);
		}
		password.setConjunction(Conjunction.AND);
		password.setUpperCaseCompare(false);
		password.setAttribute("PersonDEO_Password_c");
		password.setOperator("=");
		password.getValue().add(resetPassword.getCurrentPassword());
		viewCriteriaRow.getItem().add(password);
		viewCriteria.getGroup().add(viewCriteriaRow);
		findCriteria.setFilter(viewCriteria);
		try {
			findContactResponse = contactService.findContact(findCriteria,
					findControl);
			if (findContactResponse != null
					&& findContactResponse.getValue().size() > 0) {
				Contact contact = (Contact) findContactResponse.getValue().get(
						0);
				  if (contact.isPersonDEOPasswordResetC()) {
				  contact.setPersonDEOPasswordC(factory
				  .createContactPersonDEOPasswordC(resetPassword
				  .getNewPassword()));
				  contact.setPersonDEOPasswordResetC(Boolean.FALSE);
				  contactService.updateContact(contact); response = "changed";
				  }
				 
			} else {
				response = "failed";
			}
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return response;
	}

	public Registration getUseerProfile(String email) {
		DataObjectResult findContactResponse = null;
		Registration userProfile = new Registration();
		ObjectFactory factory = new ObjectFactory();
		String response = null;
		FindControl findControl = new FindControl();
		FindCriteria findCriteria = new FindCriteria();
		findCriteria.setFetchSize(-1);
		findCriteria.setFetchStart(0);
		ViewCriteria viewCriteria = new ViewCriteria();
		viewCriteria.setConjunction(Conjunction.AND);
		ViewCriteriaRow viewCriteriaRow = new ViewCriteriaRow();
		viewCriteriaRow.setConjunction(Conjunction.AND);
		viewCriteriaRow.setUpperCaseCompare(false);

		ViewCriteriaItem emails = new ViewCriteriaItem();
		emails.setConjunction(Conjunction.AND);
		emails.setUpperCaseCompare(false);
		emails.setAttribute("EmailAddress");
		emails.setOperator("=");
		emails.getValue().add(email);
		emails.setConjunction(Conjunction.AND);
		emails.setUpperCaseCompare(false);
		viewCriteriaRow.getItem().add(emails);
		viewCriteria.getGroup().add(viewCriteriaRow);
		findCriteria.setFilter(viewCriteria);
		try {
			findContactResponse = contactService.findContact(findCriteria,
					findControl);
			if (findContactResponse != null
					&& findContactResponse.getValue().size() > 0) {
				Contact contact = (Contact) findContactResponse.getValue().get(
						0);
				userProfile.setFname(contact.getFirstName().getValue());
				userProfile.setLname(contact.getLastName().getValue());
				userProfile.setEmail(contact.getEmailAddress());
				userProfile.setMobile(contact.getMobileNumber().getValue());
				
				  userProfile.setPassword(contact.getPersonDEOPasswordC()
				  .getValue()); userProfile.setRewardpoints(contact
				 .getPersonDEOTotalRewardPointsC().getValue());
				 
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return userProfile;
	}

	public void updateRewardPoints(Registration reg, RewardPoint point) {
		DataObjectResult response = null;
		DataObjectResult findContactResponse = null;
		ObjectFactory factory = new ObjectFactory();
		FindControl findControl = new FindControl();
		FindCriteria findCriteria = new FindCriteria();
		findCriteria.setFetchSize(-1);
		findCriteria.setFetchStart(0);
		ViewCriteria viewCriteria = new ViewCriteria();
		viewCriteria.setConjunction(Conjunction.AND);
		ViewCriteriaRow viewCriteriaRow = new ViewCriteriaRow();
		viewCriteriaRow.setConjunction(Conjunction.AND);
		ViewCriteriaItem viewCriteriaItem = new ViewCriteriaItem();
		viewCriteriaItem.setConjunction(Conjunction.AND);
		viewCriteriaItem.setUpperCaseCompare(false);
		viewCriteriaItem.setAttribute("EmailAddress");
		viewCriteriaItem.setOperator("=");
		viewCriteriaItem.getValue().add(reg.getEmail());
		viewCriteriaRow.getItem().add(viewCriteriaItem);
		viewCriteria.getGroup().add(viewCriteriaRow);
		findCriteria.setFilter(viewCriteria);
		try {
			findContactResponse = contactService.findContact(findCriteria,
					findControl);
			if (findContactResponse != null
					&& findContactResponse.getValue().size() > 0) {
				Contact contact = (Contact) findContactResponse.getValue().get(
						0);
				contact.setFirstName(contact.getFirstName());
				contact.setLastName(contact.getLastName());
				  contact.setPersonDEOTotalRewardPointsC(factory
				  .createContactPersonDEOTotalRewardPointsC(reg
				  .getRewardpoints()));
				 
				response = contactService.updateContact(contact);
				if (response != null) {
					/* updateRewardPointHistory(contact,point); */
				}
			}

		} catch (ServiceException e) {
			e.printStackTrace();
		}

	}

	/*
	 * private void updateRewardPointHistory(Contact contact,RewardPoint point)
	 * { CrmCommonReferenceService
	 * crmCommonReferenceService=ConnectionUtil.getCrmCommonReferenceService();
	 * //RewardPoint history=new RewardPoint();
	 * oracle.apps.cdm.foundation.custextn.views.common.ObjectFactory
	 * factory=new
	 * oracle.apps.cdm.foundation.custextn.views.common.ObjectFactory();
	 * RewardPointsHistoryC history=new RewardPointsHistoryC(); try {
	 * history.setPersonIdContactReward
	 * (factory.createRewardPointsHistoryCPersonIdContactReward
	 * (contact.getPartyId()));
	 * history.setNewValueC(factory.createRewardPointsHistoryCNewValueC
	 * (point.getNewValue_c())); history.setOldValue_c(point.getOldValue_c());
	 * history.setRewardPoints_c(point.getRewardPoints_c());
	 * history.setVoucher_c(true);
	 * crmCommonReferenceService.createEntity(history, "RewardPointsHistory_c");
	 * } catch
	 * (com.oracle.xmlns.apps.cdm.foundation.custextn.extnservice.ServiceException
	 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
	 * 
	 * }
	 */

	/*
	 * @Override public void updateRewardPoints(Registration reg) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 */
}
