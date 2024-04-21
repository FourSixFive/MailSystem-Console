package kr.ac.kopo.ui;

import java.util.List;
import kr.ac.kopo.vo.SignUpVO;

public class LoginUI extends BaseUI{

	@Override
	public void execute() throws Exception {
		
		List<SignUpVO> list = service.login();
		
		System.out.println("< 로그인 서비스 >");
		String id = scanStr("아이디 : ");
		String password = scanStr("패스워드 : ");
		
		if(list.get(0).getId().equals(id) && list.get(0).getPassword().equals(password)) {
			System.out.println("로그인 완료");
			MailStartUI msu = new MailStartUI();
			try {
				msu.execute();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("아이디 또는 패스워드가 다릅니다");
		}
	}
	
	
}
