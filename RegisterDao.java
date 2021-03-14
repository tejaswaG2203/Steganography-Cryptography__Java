import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
	private String dburl="jdbc:mysql://localhost:3306/customer";
	private String dbuname="root";
	private String dbpassword="root";
	public String dbdriver="com.mysql.jdbc.Driver";
	public void loadDriver(String dbdriver)
	{
		try
		{
			Class.forName(dbdriver);
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	public Connection getConnection()
	{
		Connection con =null;
		try {
            con=DriverManager.getConnection(dburl, dbuname, dbpassword);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return con;
	}
	public String insert(Member member)
	{
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result="Data entered successfully";
		String sql="insert into customer_details values(?,?,?,?)";
		try 
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, member.getFirstname());
			ps.setString(2, member.getLastname());
			ps.setString(3, member.getUsername());
			ps.setString(4, member.getPassword());
			ps.executeUpdate();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			result="Data not entered";
		}
		return result;
	}
	
}
