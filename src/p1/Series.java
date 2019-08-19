package p1;

import java.util.Scanner;

//1 1 2 3 4 9 8 27 16 81 32 243
public class Series {

	public static void main(String[] args) {
		
		int i=0,n1=1,n2=3,n3;
	Scanner s=new Scanner(System.in);
	System.out.println("enter n");
	int n=s.nextInt();
		System.out.println("1st case :"+n1);
		System.out.println("1st case :"+n1);
		while(i<n)
		{
			if(i%2==0)
			
			{
				n3=n1*2;
				System.out.println("2st case :"+n3);
				n1=n3;
				
			}
			 
			else
			{
				 if(i==1)
				 {
					 System.out.println("3st case :"+n2); 
				 }
				 else 
				 {
				n3=n2*3;
				System.out.println("3st case :"+n3);
				n2=n3;
				}
				
			}
			i++;
		}
	}

}
