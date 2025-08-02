package skill;
import java.util.Scanner;
public class ForLoop {
	public static void main(String[] args) {
		  int num;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the number ");
		  num=sc.nextInt();
		  for(int i=1;i<=num;i++) {
			  System.out.println("Count:"+i);
		  }
	}
}
