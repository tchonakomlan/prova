package ProvaLog.provalog;

import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mailreciever {
/*	
	static Logger log = LoggerFactory.getLogger("Mailreciever");

	public static void main(String[] args) throws Exception {
		Store store = getConnection();
		Folder inbox = store.getFolder("inbox");
		   inbox.open(Folder.READ_ONLY);
		   int messageCount = inbox.getMessageCount();

		   System.out.println("Total Messages:- " + messageCount);

		   Message[] messages = inbox.getMessages();
		   System.out.println("------------------------------");
		   for (int i = 0; i < 10; i++) {
		      System.out.println("Mail Subject:- " + messages[i].getSubject());      
		   }
		   inbox.close(true);
		   store.close();
	}	

	
	private static Store getConnection() throws MessagingException {
	    Properties properties;
	    Session session;
	    Store store = null;

	    properties = new Properties();
	    properties.setProperty("mail.smtp.auth", "true");
	    properties.setProperty("mail.smtp.host", "smtp.gmail.com");
	    properties.setProperty("mail.smtp.port", "465");
	    properties.setProperty("mail.smtp.socketFactory.port", "465");
	    properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	    properties.setProperty("javax.net.ssl.KeyStore", "D:\\programs\\jdk1.8.0_92\\jre\\lib\\security\\cacerts");
	    properties.setProperty("javax.net.ssl.keyStorePassword", "changeit");
	    session = Session.getInstance(properties, new Authenticator() {
	        protected PasswordAuthentication getPasswordAuthentication() {
	            return new PasswordAuthentication("siaeumail@gmail.com",
	                                              String.valueOf("Uchiya2130*"));
	        }
	    });
	 
	    try {
	        store = session.getStore("imaps");
	        store.connect();	       
	       // return store;
	    } catch (MessagingException e) {
	        log.error("Error when creating the email store " + e);	       
	    }
		
		return store;
	}
	*/ 
}
