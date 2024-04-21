package kr.ac.kopo.ui;

public class MailStartUI extends BaseUI{

	private int mailMenu() {
		System.out.println();
		System.out.println("------------------------");
		System.out.println("1. 메일쓰기");
		System.out.println("2. 받은 메일함");
		System.out.println("3. 보낸 메일함");
		System.out.println("4. 휴지통");
		System.out.println("5. 즐겨찾기");
		System.out.println("0. 종료");
		System.out.println("------------------------");
		int type = scanInt("항목을 선택하세요");
		return type;
	}
	
	@Override
	public void execute() throws Exception {
		while(true) {
			IMailUI ui = null;
			int type = mailMenu();
			switch (type) {
			case 1 :
				ui = new WriteMailUI();
				break;
			case 2 :
//				ui = new ReceivedMailUI();
				break;
			case 3 :
//				ui = new SentMailUI();
				break;
			case 4 :
//				ui = new BinUI();
				break;
			case 5 :
//				ui = new FavoritesUI();
				break;
			case 0 :
				ui = new ExitUI();
			if(ui!=null) {
				ui.execute();
			}else {
				System.out.println("다시 입력하세요");
			}
			
			}
		}
	}
	
}
