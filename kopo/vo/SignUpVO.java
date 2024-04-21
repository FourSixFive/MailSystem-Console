package kr.ac.kopo.vo;

public class SignUpVO {
	
	private int no;
	private String id;
	private String password;
	private String name;
	private String phone;
	
	public SignUpVO() {
		super();
	}

	public int getNo() {
		return no;
	}
	
	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public SignUpVO(String id, String password, String name, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}

	public SignUpVO(int no, String id, String password, String name, String phone) {
		super();
		this.no = no;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}

}
