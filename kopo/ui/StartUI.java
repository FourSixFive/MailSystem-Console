package kr.ac.kopo.ui;

public class StartUI extends BaseUI{
	
	private int signMenu() {
		System.out.println();
		System.out.println("------------------------");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("0. 종료");
		System.out.println("------------------------");
		int type = scanInt("항목을 선택하세요");
		return type;
	}
	
	@Override
	public void execute() throws Exception {
		while(true) {
			IMailUI ui = null;
			int type = signMenu();
			switch (type) {
			case 1 :
				ui = new SignupUI();
				break;
			case 2 :
				ui = new LoginUI();
				break;
			case 0 :
				ui = new ExitUI();
			}
			if(ui!=null) {
				ui.execute();
			}else {
				System.out.println("다시 입력하세요");
			}
		}
	}
}
