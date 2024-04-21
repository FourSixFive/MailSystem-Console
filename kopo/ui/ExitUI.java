package kr.ac.kopo.ui;

public class ExitUI implements IMailUI{

	@Override
	public void execute() throws Exception {
		System.out.println("******Bye******");
		System.out.println("프로그램을 종료합니다");
		System.out.println("******Bye******");
		System.out.println();
		System.exit(0);
	}
	
}
