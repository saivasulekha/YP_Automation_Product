package WD_YP_Ecl;

//File Name SendFileEmail.java

import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
@SuppressWarnings("unused")

public class JavaMail
{


	public void main(String string, String javamail)
	   {
	      
	      // Recipient's email ID needs to be mentioned.
		 // String to = "saivadurai.j8@gmail.com";
	     // String to = "MurugeshS@sulekha.net";
		
	      // Recipient's email ID needs to be mentioned.
	      //String to1 = "VinayS@sulekha.net";
	      
	      // Recipient's email ID needs to be mentioned.
	     // String to2 = "ArvindT@sulekha.net";
	      
	      // Recipient's email ID needs to be mentioned.
	      //String to3 = "Yogeswara.rao@sulekha.net";
	      
	      // Recipient's email ID needs to be mentioned.
	      String to4 = "ChennamS@sulekha.net";
	      
	      	      
	      // Recipient's email ID needs to be mentioned.
	      //String mailCc1 = "MurugeshS@sulekha.net";
	     // String mailCc1 = "KaviyarasanK@sulekha.net";
	      
	      // Recipient's email ID needs to be mentioned.
	      //String mailCc1 = "MurugeshS@sulekha.net";
	      //String mailCc2 = "SaradhaS@sulekha.net";

	      // Recipient's email ID needs to be mentioned.
	      //String mailCc1 = "MurugeshS@sulekha.net";
	      String mailCc3 = "SaivaduraiJ@sulekha.net";


	      // Sender's email ID needs to be mentioned
	      String from = "SaivaduraiJ@sulekha.net";

	      // Assuming you are sending email from localhost
	      //String host = "smtp.gmail.com";
	      String host = "jpcypstage.sulekha.net";

	      // Get system properties
	      Properties props = System.getProperties();

	      // Setup mail server
	      props.put("mail.smtp.host", "jpcypstage.sulekha.net");
			props.put("mail.smtp.socketFactory.port", "465");
			props.put("mail.smtp.socketFactory.class",
					"javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", "25");

	      // Get the default Session object.
			Session session = Session.getInstance(props,
					  new javax.mail.Authenticator() {
						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication("SaivaduraiJ@sulekha.net", "$@ivaMuni");
						}
					  });

	      try{
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         // message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
	        
	         // Set To1: header field of the header.
	         // message.addRecipient(Message.RecipientType.TO,new InternetAddress(to1));
	         
	         // Set To2: header field of the header.
	         // message.addRecipient(Message.RecipientType.TO,new InternetAddress(to2));
	         
	         // Set To3: header field of the header.
	         // message.addRecipient(Message.RecipientType.TO,new InternetAddress(to3));
	         
	         // Set To4: header field of the header.
	         	message.addRecipient(Message.RecipientType.TO,new InternetAddress(to4));
	         
	         
	        
	         // Set Cc: header field of the header.
	         //message.addRecipient(Message.RecipientType.CC, new InternetAddress(mailCc));
	         
	         // Set Cc1: header field of the header.
	         //message.addRecipient(Message.RecipientType.CC, new InternetAddress(mailCc1));
	         
	         // Set Cc1: header field of the header.
	         //message.addRecipient(Message.RecipientType.CC, new InternetAddress(mailCc2));
	         
	         // Set Cc1: header field of the header.
	         message.addRecipient(Message.RecipientType.CC, new InternetAddress(mailCc3));
	         
	         // Set Subject: header field
	         message.setSubject("YP Automation Results");

	         // Create the message part 
	         BodyPart messageBodyPart = new MimeBodyPart();

	         // Fill the message
	         messageBodyPart.setText("Hi Team,\n Please check the attached file for Yellow Pages Project – 1 Automated Test Results. \n Please Raise a Alarm if the Test Results Fails ( If Any ) \n\n\n\n Thanks, \n YP Testing Team \n Sulekha Yellowpages");
	         
	         // Create a multipar message
	         Multipart multipart = new MimeMultipart();

	         // Set text message part
	         multipart.addBodyPart(messageBodyPart);

	         // Part two is attachment
	         messageBodyPart = new MimeBodyPart();
	         String filename = "D:\\Saivadurai\\Automation_Results\\emailable-report.html";
	         DataSource source = new FileDataSource(filename);
	         messageBodyPart.setDataHandler(new DataHandler(source));
	         messageBodyPart.setFileName(filename);
	         multipart.addBodyPart(messageBodyPart);

	         // Send the complete message parts
	         message.setContent(multipart );

	         // Send message
	         Transport.send(message);
	         System.out.println("Sent message successfully....");
	      }catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	   }

	}
