package kr.ac.kopo.start;

import kr.ac.kopo.ui.StartUI;

public class MailMain {

	public static void main(String[] args) {
		
		StartUI su = new StartUI();
		try {
			su.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
