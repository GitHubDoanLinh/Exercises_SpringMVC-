package sumary;

public class SmsService implements MessageService{

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("Sms message "+ message);
	}

}
