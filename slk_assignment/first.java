

import java.util.Scanner;

public class first {

	public static void main (String[] args){
	Scanner sc=new Scanner(System.in);
  sc.close();
    int num= sc.nextInt();
    if (num%7==0) {
      System.out.println("Yes");
    }else {
      System.out.println("No");
    }
	}
}


