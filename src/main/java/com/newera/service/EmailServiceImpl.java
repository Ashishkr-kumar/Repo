package com.newera.service;


import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

import com.newera.model.Email;
import com.newera.util.EmailUtility;
@Service("newEraEmailService")
public class EmailServiceImpl implements EmailService {

	public void emailConfiguration(Email email) {
		Email emailModel=new Email();
		  if(null !=email){
		  
		  emailModel.setHost("smtp.gmail.com");
		  emailModel.setPort("587");
		  emailModel.setUser("newmailbox2015dec@gmail.com");
		  emailModel.setPass("G@nesh@1432");
		  emailModel.setRecipient(email.getRecipient());
		  emailModel.setSubject(email.getSubject());
		  emailModel.setContent(email.getContent());
		  emailModel.setAttachFiles(email.getAttachFiles());
		  }
		  try {
			EmailUtility.sendEmail(emailModel);
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public String sendEmail(String subject, List<String> emailToAddresses,
			String emailBodyText) {
		// from email address
        final String username = "ashishkr.kumar@gmail.com";
        // make sure you put your correct password
        final String password = "G@nesh@1432";
        // smtp email server
        final String smtpHost = "smtp.gmail.com";
 
        // We will put some properties for smtp configurations
        Properties props = new Properties();
 
        // do not change - start
        props.put("mail.smtp.user", "username");
        props.put("mail.smtp.host", smtpHost);
        props.put("mail.smtp.port", "587");
        // props.put("mail.debug", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        // do not change - end
 
        // we authentcate using your email and password and on successful
        // we create the session
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });
        String emails = null;
        String response="Email successfully sent";
        try {
            // we create new message
            Message message = new MimeMessage(session);
            // set the from 'email address'
            message.setFrom(new InternetAddress(username));
            // set email subject
            message.setSubject(subject);
            // set email message
            // this will send html mail to the intended recipients
            // if you do not want to send html mail then you do not need to wrap the message inside html tags
            String content = "<html>\n<body>\n";
            content += emailBodyText + "\n";
            content += "\n";
            content += "</body>\n</html>";
            message.setContent(content, "text/html");
 
            // form all emails in a comma separated string
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (String email : emailToAddresses) {
                sb.append(email);
                i++;
                if (emailToAddresses.size() > i) {
                    sb.append(", ");
                }
            }
 
            emails = sb.toString();
 
            // set 'to email address'
            // you can set also CC or TO for recipient type
            message.setRecipients(Message.RecipientType.BCC,
                    InternetAddress.parse(sb.toString()));
 
            System.out.println("Sending Email to " + emails + " from "
                    + username + " with Subject - " + subject);
 
            // send the email
            Transport.send(message);
 
            System.out.println("Email successfully sent to " + emails);
 
        } catch (MessagingException e) {
            System.out.println("Email sending failed to " + emails);
            System.out.println(e);
        }
		return response;
	}
}
