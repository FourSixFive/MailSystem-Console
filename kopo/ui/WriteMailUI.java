package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MailVO;
import kr.ac.kopo.vo.SignUpVO;

public class WriteMailUI extends MailStartUI{

	public WriteMailUI(SignUpVO sign) {
		super(sign);
	}

	@Override
	public void execute() throws Exception {
		System.out.println("< 메일쓰기 >");
		System.out.println();
		String title = scanStr("제목을 입력하세요 (500자 이내)");
		String contents = scanStr("내용을 입력하세요 (2000자 이내)");
		String received_id = scanStr("수신자 ID를 입력하세요");
		
		MailVO mail = new MailVO();
		mail.setId(super.sign.getId());
		mail.setTitle(title);
		mail.setContents(contents);
		mail.setReceived_id(received_id);
		service2.writemail(mail);
	}
	
}
