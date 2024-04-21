package kr.ac.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.vo.MailVO;

public class MailDAO {

	public void writemail(MailVO mail) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO tbl_mail(id, title, contents) ");
		sql.append(" VALUES(?, ?, ?, ?) ");
		
		try (
			Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		){
			pstmt.setString(1, mail.getId());
			pstmt.setString(2, mail.getTitle());
			pstmt.setString(3, mail.getContents());
			pstmt.setString(4, mail.getReceived_id());
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
