package action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class GetBook extends ActionSupport{
	
	private String author;
	private String[] bookname = null;
	private int n=0;
	private int authorid =0;
	public String[] getBookname() {
		return bookname;
	}
	public void setBookname(String[] bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	
	public void ID() throws Exception{
		ConnDao dao = new ConnDao();
		Connection con = dao.getConn();
		Statement cst = con.createStatement() ;
		String sql = "select * from author where name = '"+author+"'";
		ResultSet rd = cst.executeQuery(sql);
		while(rd.next()){
			authorid  = rd.getInt("authorid");
		}
		rd.close();
		cst.close();
        con.close();
	}
	public int getNum() {
		return n;
	}
	public void setNum(int n) {
		this.n = n;
	}
	public void Book() throws Exception {
		ConnDao dao = new ConnDao();
		Connection con = dao.getConn();
		Statement cst = con.createStatement() ;
		 String sql = "select * from book where authorid = "+authorid;
		ResultSet rd = cst.executeQuery(sql);
		int totalRows = 0;
		if (rd.last()){			
            totalRows=rd.getRow();
        }
		bookname = new String[totalRows];
		rd.beforeFirst();
		
		while(rd.next()){
			bookname[n++] = rd.getString("title");
		}
		rd.close();
		cst.close();
        con.close();
	}
	public String execute(){
			try {
				ID();
				Book();
			} catch (Exception e) {
				e.printStackTrace();
			}
		return "result";
	}
}
