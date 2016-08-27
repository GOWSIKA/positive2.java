import java.io.*;
mport java.util.Scanner;


public class positive2
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a=1;int te=n;
	for(int i=0;i<=n;i++)
	{
		int temp=n%10;
	    a=a+temp*temp*temp;
		n=n/10;
	}
	System.out.println(a);
	if(a==te)
	{
		System.out.println("Amstrong number");
	}
	else
	{
		System.out.println("Not Amstrong number");
	}
	
}
}
