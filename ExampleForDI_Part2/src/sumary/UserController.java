package sumary;

public class UserController {

	private MessageService messageService;
	public UserController(MessageService messageService) {
		this.messageService = messageService;
	}
	
	void send() {
		messageService.sendMessage("Hello dependency injection partten");
	}
}
