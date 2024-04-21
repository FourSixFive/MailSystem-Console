package kr.ac.kopo.mail.service;
import kr.ac.kopo.dao.MailDAO;
import kr.ac.kopo.vo.MailVO;

public class MailService2 {

	private MailDAO dao2;
	
	public MailService2() {
		dao2 = new MailDAO();
	}
	
	public void writemail(MailVO mail) {
		dao2.writemail(mail);
	}
}
