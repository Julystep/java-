package ������������;

public class Bufferbuilder {
	public static void main(String args[]){
	    StringBuilder sBuffer = new StringBuilder("name��");
	    sBuffer.append("Tom");
	    sBuffer.append(".Lucy");
	    sBuffer.append(".Lol");
	    System.out.println(sBuffer);  
	    //String n=new String("some")�޷��ı�
	    sBuffer.reverse();
	    System.out.println(sBuffer);
	    sBuffer.delete(0, 2);
	    System.out.println(sBuffer);
	    sBuffer.insert(3, 10);
	    System.out.println(sBuffer);
	    String x=new String ("jack");
	    sBuffer.replace(3, 3, x);
	    System.out.println(sBuffer);
	  }
}
