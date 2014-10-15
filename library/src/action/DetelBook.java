package action;

import java.sql.Connection;
import java.sql.Statement;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class DetelBook extends ActionSupport{
	private String title;
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public void Det() throws Exception {
		ConnDao dao = new ConnDao();
		Connection con = dao.getConn();
		Statement cst = con.createStatement() ;
		String sql = "delete from book where title = '"+title+"'";
		cst.executeUpdate(sql) ;
		cst.close();
        con.close();
	}
	public String execute(){
		try {
			Det();
		} catch (Exception e) {
			// TODO 
			e.printStackTrace();
		}
		return "result";
	}
}
