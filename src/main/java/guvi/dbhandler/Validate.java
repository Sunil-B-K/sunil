package guvi.dbhandler;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class Validate {
	public static String fetchData(String email) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String psa="system";
		String sql="select password   from  guvi_table where email=?";
		String dbpass="";
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, user, psa);
			PreparedStatement ps=con.prepareStatement(sql);
		// Statement ps=con.createStatement();
			ps.setString(1, email);
	ps.executeUpdate();
			 ResultSet rs=ps.executeQuery(sql);
			while( !rs.next());
			{
			 dbpass=rs.getString(1);
			}
		

			
			} catch (Exception e) {
			e.printStackTrace();
			System.out.println("login issue");
			e.printStackTrace();
		}
		return dbpass;
	}

	public static void insertData(String name,String mail,String pass,String conf)
	{
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String psa="system";
		String sql="insert into  guvi_table values(?,?,?,?)";
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, user, psa);
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, mail);
			ps.setString(3, pass);
			ps.setString(4, conf);
			ps.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}


	
	}

	public static void insert(String age, String mobile, String date, String address, String gender) {
		
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String psa="system";
		String sql="insert into  guvi_table1 values(?,?,?,?,?)";
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, user, psa);
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, age);
			ps.setString(2, mobile);
			ps.setString(3, date);
			ps.setString(4, address);
			ps.setString(5, gender);
			ps.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	
	}
	



