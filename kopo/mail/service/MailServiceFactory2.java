package kr.ac.kopo.mail.service;

public class MailServiceFactory2 {

	private static MailService2 service2;
	
	public static MailService2 getInstance() {
		if(service2 == null) {
			service2 = new MailService2();
		}
		return service2;
	}
}
