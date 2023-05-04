import java.util.Scanner;

public class MiniProject {
	public static void main(String args[]) {
		
		char repeat = 'y';
		Scanner sc = new Scanner (System.in);
		
		while(repeat == 'y'|| repeat =='Y') {
			System.out.println("1.addition program");
			System.out.println("2.Armstrong Number");
			System.out.println("3.palindrome Number");
			System.out.println("4.reverse of a Number");
			System.out.println("5.Fibanacci series");
			
			System.out.println("please select your choice of program: ");
			
			int choice =sc.nextInt();
			
			switch(choice) {
			case 1:addition();break;
			case 2:armstrongNumber();break;
			case 3:palindromeNumber();break;
			case 4: reverse();break;
			case 5:FibanacciSeries();break;
			
			default:System.out.println("Entered choice is wrong ");
			}
			System.out.println("Do you want to continue");
			repeat = sc.next().charAt(0);
			}
		System.out.println("Thanks for trying my project...Visit again");
	}
	
	//Fibanacci Series program
	public static void FibanacciSeries() {
		int a=0;
		int b=1;
		int t= a+b;
		System.out.println(a);
		for(int i=1;i<=10;i++) {
			t=a+b;
			System.out.print(","+t);
			b=a;
			a=t;
		}
	}
	//End of Fibanacci Series program
	
	//Reverse of a number program
	public static void reverse() {
		Scanner SC = new Scanner(System.in);
		System.out.println(" Enter a no: ");
		
		int num = SC.nextInt();
		int temp;
		 int rev=0;
				 
		 for( ; num!=0; ) {
			 temp= num%10;
			 rev=rev*10+temp;
			 num= num/10;}
		 
		 System.out.println(" rev="+ rev);
		 
	}
	//End of reverse program
	
	//Palindrome Number program
	public static void palindromeNumber() {
		Scanner sc = new Scanner (System.in);
		System.out.println(" enter no: ");
		
		int a=sc.nextInt();
	
			int dupe = a;
			int rev =0;
			
			for(;a !=0;) {
				int temp = a%10;
				rev =rev*10+temp;
				a=a/10;
			}
			
			System.out.println(rev);
			
			if (dupe==rev) {
				System.out.println("palindrome");
			}
			else {
				System.out.println("not palindrome");
			}	
		}
	//End of palindrome program

	//Armstrong Number program
	public static void armstrongNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find Amstrong or not : ");
		int num = sc.nextInt();
		
		int duplicateNum =num;
		int amstrongNum = 0;
	 	
		for ( ; duplicateNum!=0 ; duplicateNum /= 10) {
			int temp = duplicateNum %10;
			amstrongNum = amstrongNum + ( temp*temp*temp );
		}
		
		if ( amstrongNum == num ) {
			System.out.println("Entered number is Amstrong number ...");
		} else {
			System.out.println("Entered number is not Amstrong number ...");
		}
	}
	//End of armstrong Number program
	
	//addition program started
	public static void addition() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a,b values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c =a+b;
		System.out.println(c);

	}	
	//End of addition program
}
