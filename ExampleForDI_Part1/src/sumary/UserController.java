package sumary;

public class UserController {
	private EmailService emailService = new EmailService();
	public void send() {
		// TODO Auto-generated method stub
//		emailService.sendEmail("hello depen");
		emailService.sendEmail("hello dependency injection");
	}
	

}
