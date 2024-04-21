package kr.ac.kopo.ui;

import java.util.Scanner;

import kr.ac.kopo.mail.service.MailService2;
import kr.ac.kopo.mail.service.MailServiceFactory2;
import kr.ac.kopo.service.MailService;
import kr.ac.kopo.service.MailServiceFactory;

public abstract class BaseUI implements IMailUI {
	
	private Scanner sc;
	protected MailService service;
	protected MailService2 service2;
	
	public BaseUI() {
		sc = new Scanner(System.in);
		service = MailServiceFactory.getInstance();
		service2 = MailServiceFactory2.getInstance();
	}
	
	protected String scanStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}
	protected int scanInt(String msg) {
		return Integer.parseInt(scanStr(msg));
	}
}
