package hello;
import java.util.Date;
import java.text.*;
public class DA {
		   public static void main(String args[]) {
		       // ��ʼ�� Date ����
		       Date date = new Date();
		        
		       // ʹ�� toString() ������ʾ����ʱ��
		       SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
		       System.out.println(date.toString());
		       System.out.println(ft.format(date));
		       System.out.println(new Date(99,2,17).after(new Date(99,2,18)));
		       System.out.printf("ȫ�����ں�ʱ����Ϣ��%tc%n",date); 
		       System.out.printf("%tF%n",date);
		       System.out.printf("%tD%n",date);
		   }
}
