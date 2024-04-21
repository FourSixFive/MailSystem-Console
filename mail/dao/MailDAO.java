package kr.ac.kopo.mail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.ac.kopo.mail.vo.MailVO;
import kr.ac.kopo.util.ConnectionFactory;

public class MailDAO {

	public void writemail(MailVO mail) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO tbl_mail(id, title, contents) ");
		sql.append(" VALUES(?, ?, ?) ");
		
		try (
			Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		){
			pstmt.setString(1, mail.getId());
			pstmt.setString(2, mail.getTitle());
			pstmt.setString(3, mail.getContents());
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
