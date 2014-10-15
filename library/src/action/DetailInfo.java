package action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class DetailInfo extends ActionSupport{
	private String authorid;
	private String title;
	private String[] author = new String[4];
	private String[] book = new String[5];
	public String getAuthorid() {
		return authorid;
	}
	public void setAuthorid(String authorid) {
		this.authorid = authorid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String[] getAuthor() {
		return author;
	}
	public void setAuthor(String[] author) {
		this.author = author;
	}
	public String[] getBook() {
		return book;
	}
	public void setBook(String[] book) {
		this.book = book;
	}
	
	public void GetAuthorID() throws Exception {
		ConnDao dao = new ConnDao();
		Connection con = dao.getConn();
		Statement cst = con.createStatement() ;
		String sql = "select * from author where AuthorID = "+authorid;
		ResultSet rd = cst.executeQuery(sql);
		while(rd.next()){
			author[0] = rd.getString("Name");
			author[1] = rd.getString("Country");
			author[2] = rd.getString("Age");
			author[3] =  rd.getString("AuthorID");
		}
		rd.close();
		cst.close();
        con.close();
	}
	
	public void GetBookIf() throws Exception {
		ConnDao dao = new ConnDao();
		Connection con = dao.getConn();
		Statement cst = con.createStatement() ;
		 String sql = "select * from book where title = '"+title+"'";
		ResultSet rd = cst.executeQuery(sql);
		while(rd.next()){
			book[0] = rd.getString("ISBN");
			book[1] = rd.getString("Publisher");
			book[2] = rd.getString("PublishDate");
			book[3] = rd.getString("Price");
			book[4] = rd.getString("AuthorID");
		}
		rd.close();
		cst.close();
        con.close();
	}
	public String execute(){
		
			try {
				GetAuthorID();
			
				GetBookIf();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		return "result";
	}
}
