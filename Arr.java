package 基本数据类型;

public class Arr {
	public static void main(String[] args) {
	      int size = 10;
	      double[] myList = new double[size];
	      myList[0] = 5.6;
	      myList[1] = 4.5;
	      myList[2] = 3.3;
	      myList[3] = 13.2;
	      myList[4] = 4.0;
	      myList[5] = 34.33;
	      myList[6] = 34.0;
	      myList[7] = 45.45;
	      myList[8] = 99.993;
	      myList[9] = 11123;
	      double total = 0;
	      for (int i = 0; i < size; i++) {
	         total += myList[i];
	      }
	      System.out.println(total);
	      double max=myList[0];
	      for(int i=1;i<myList.length;i++)
	      {
	    	  if(max<myList[i])	    		  
	    	  {
	    		  max=myList[i];
	    	  }
	      }
	      System.out.println(max);
	      //for-each
	      for(double em:myList)
	      {
	    	  System.out.println(em);
	      }
	   }
}
