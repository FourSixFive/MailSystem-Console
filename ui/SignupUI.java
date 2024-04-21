package kr.ac.kopo.ui;

import kr.ac.kopo.vo.SignUpVO;

public class SignupUI extends BaseUI{

	@Override
	public void execute() throws Exception {
		System.out.println("< 회원가입 서비스 >");
		String id = scanStr("사용하실 아이디를 입력하세요 (20자 이내)");
		String password = scanStr("사용하실 비밀번호를 입력하세요 (20자 이내)");
		String name = scanStr("이름을 입력하세요");
		String phone = scanStr("휴대폰 번호를 입력하세요 ('-' 제외)");
		
		SignUpVO sign = new SignUpVO();
		sign.setId(id);
		sign.setPassword(password);
		sign.setName(name);
		sign.setPhone(phone);
		service.addSignUp(sign);
		
		System.out.println("-----Welcome-----");
		System.out.println("회원가입이 완료되었습니다");
		System.out.println("-----Welcome-----");
	}
	
}
