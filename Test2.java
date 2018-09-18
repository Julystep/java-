package 基本数据类型;

public class Test2 {
	public String name="张三丰";
	 public void pupAge(){
	      int age =0;
	      age = age + 7;
	      System.out.println("小狗的年龄是: " + age);
	      System.out.println(name);
	   }
	   
	   public static void main(String[] args){
	      Test2 test = new Test2();
	      test.pupAge();
	      System.out.println(test.name);
	   }
}
