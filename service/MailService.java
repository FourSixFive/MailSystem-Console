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
	
	public List<SignUpVO> login(){
		List<SignUpVO> list = dao.login();
		return list;
	}
}
