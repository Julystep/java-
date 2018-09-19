package hello;
import java.util.Date;
import java.text.*;
public class DA {
		   public static void main(String args[]) {
		       // 初始化 Date 对象
		       Date date = new Date();
		        
		       // 使用 toString() 函数显示日期时间
		       SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
		       System.out.println(date.toString());
		       System.out.println(ft.format(date));
		       System.out.println(new Date(99,2,17).after(new Date(99,2,18)));
		       System.out.printf("全部日期和时间信息：%tc%n",date); 
		       System.out.printf("%tF%n",date);
		       System.out.printf("%tD%n",date);
		   }
}
