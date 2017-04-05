package com.newera.service;

import java.util.List;


import com.newera.model.Email;

public interface EmailService {

	public void emailConfiguration(Email email);
	public String sendEmail(final String subject, final List<String> emailToAddresses,
            final String emailBodyText);
}
