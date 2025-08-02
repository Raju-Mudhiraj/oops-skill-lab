package skill;
import java.util.Scanner;
public class Switchcase {
	public static void main(String[] args) {
		  int num;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the number ");
		  num=sc.nextInt();
		  switch (num) {
		  case 1: System.out.println("Monday"); break;
          case 2: System.out.println("Tuesday"); break;
          case 3: System.out.println("Wednesday"); break;
          case 4: System.out.println("Thursday"); break;
          default: System.out.println("Other day");
		  }
}
}
