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
            System.out.println("�ɹ�����MYSQL����");
            conn=DriverManager.getConnection(URL);
            System.out.println(" ʵ����Statement����...");
            stmt=conn.createStatement();
            String sql;
            sql="SELECT id, name, url FROM websites";
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                // ͨ���ֶμ���
                int id  = rs.getInt("id");
                String name = rs.getString("name");
                String url = rs.getString("url");
    
                // �������
                System.out.print("ID: " + id);
                System.out.print(", վ������: " + name);
                System.out.print(", վ�� URL: " + url);
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