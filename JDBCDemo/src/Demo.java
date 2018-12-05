
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

class Demo {
	public static void main(String[] args) {
		try {
			// Register the Driver
			Class.forName("com.mysql.jdbc.Driver");
			// Create a Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root");

			// Create SQL Statement
			Statement s = con.createStatement();
			// Execute SQL Statement
			ResultSet rs = s.executeQuery("select * from Employee");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}

//			// INSERTING DATA
//
//			// Create SQL Prepare Statement
//			PreparedStatement pst = con.prepareStatement("insert into Employee values(?,?)");
//
//			pst.setInt(1, 100);
//			pst.setString(2, "Narayana");
//			pst.executeUpdate();

			// Closing the connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}