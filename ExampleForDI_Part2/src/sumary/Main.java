package sumary;

public class Main {

	public static void main(String[] args) {

		MessageService messageService = new EmailService();
		// MessageService messageService2 = new SmsService();
		
		UserController userController = new UserController(messageService);
		userController.send();
	}
}
