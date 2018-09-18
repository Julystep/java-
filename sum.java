package 基本数据类型;

public class sum {
          public static void main(String []args)
          {
        	  int sum=0;
        	  for(int i=1;i<=100;i++)
        	  {
        		  sum+=i;
        	  }
        	  System.out.println(sum);
        	  sum=0;
        	  for(int i=1;i<10000;i++)
        	  {
        		  if(i%3==2&&i%5==3&&i%7==2)
        		  {
        			  sum=i;System.out.println(sum);
        		  }
        	  }
        	  
          }
}
