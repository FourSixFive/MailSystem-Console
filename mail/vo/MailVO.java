package kr.ac.kopo.mail.vo;

public class MailVO {
	private String id;
	private String title;
	private String contents;
	private String reg_date;
	
	public MailVO() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	public MailVO(String id, String title, String contents, String reg_date) {
		super();
		this.id = id;
		this.title = title;
		this.contents = contents;
		this.reg_date = reg_date;
	}
	
}
