package kr.ac.kopo.service;

import java.util.List;

import kr.ac.kopo.dao.SignUpDAO;
import kr.ac.kopo.vo.SignUpVO;

public class MailService {

	private SignUpDAO dao;

	public MailService() {
		dao = new SignUpDAO();
	}
	
	public void addSignUp(SignUpVO sign) {
		dao.signup(sign);
	}
	
	public List<SignUpVO> login(String inputid) {
		List<SignUpVO> list = dao.login(inputid);
		return list;
	}
	
	public String idcheck(String id) {
		String chk = dao.idcheck(id);
		return chk;
	}
	
}
