import java.util.Scanner;
public class Cal {
            public static void main(String []args)
            {
            	Scanner wr=new Scanner(System.in);
                double x=wr.nextDouble();//�������
                double y=wr.nextDouble();//��������
                System.out.printf("%.3f\n",y/x/x);
                wr.close();
            }
}
