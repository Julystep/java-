package  Emploo;
import java.sql.*;
public class MySqlDemo {
	static final String jdbc_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/RUNOOB?serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false&user=root&password=997917";
    public static void main(String[] args)  {
    	Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(jdbc_DRIVER);
            System.out.println("成功加载MYSQL驱动");
            conn=DriverManager.getConnection(URL);
            System.out.println(" 实例化Statement对象...");
            stmt=conn.createStatement();
            String sql;
            sql="SELECT id, name, url FROM websites";
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                // 通过字段检索
                int id  = rs.getInt("id");
                String name = rs.getString("name");
                String url = rs.getString("url");
    
                // 输出数据
                System.out.print("ID: " + id);
                System.out.print(", 站点名称: " + name);
                System.out.print(", 站点 URL: " + url);
                System.out.print("\n");
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
}