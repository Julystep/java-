import java.util.Scanner;
public class Cal {
            public static void main(String []args)
            {
            	Scanner wr=new Scanner(System.in);
                double x=wr.nextDouble();//输入身高
                double y=wr.nextDouble();//输入体重
                System.out.printf("%.3f\n",y/x/x);
                wr.close();
            }
}
