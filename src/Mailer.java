import java.util.Properties;  
import javax.mail.*;  
import javax.mail.internet.*;  
  
public class Mailer {  
 public static void main(String[] args) throws AddressException, MessagingException {  
  
  String host="mail.javatpoint.com";  
  final String user="pavansadhineni0707@gmail.com";//change accordingly  
  final String password="chowdary@2002";//change accordingly  
    
  String to="pavansadhineni22@gmail.com";//change accordingly  
  
   //Get the session object  
   Properties props = new Properties();  
   props.put("mail.smtp.host",host);  
   props.put("mail.smtp.auth", "true");  
     
   Session session = Session.getDefaultInstance(props,  
    new javax.mail.Authenticator() {  
      protected PasswordAuthentication getPasswordAuthentication() {  
    return new PasswordAuthentication(user,password);  
      }  
    });  
  
   //Compose the message  
    
     MimeMessage message = new MimeMessage(session);  
     message.setFrom(new InternetAddress(user));  
     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
     message.setSubject("javatpoint");  
     message.setText("This is simple program of sending email using JavaMail API");  
       
    //send the message  
     Transport.send(message);  
  
     System.out.println("message sent successfully...");  
   
    
 }  
}  