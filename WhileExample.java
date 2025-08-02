package skill;
import java.util.Scanner;
public class WhileExample {
	public static void main(String[] args) {
		  int num;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the number ");
		  num=sc.nextInt();
		  while(num<=10) {
			  System.out.println("i="+num);
			  num++;
		  }
	}
}
