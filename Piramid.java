package dev.uts;

import java.util.Scanner;

public class Piramid {

	public static void main(String[] arguments)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Tinggi : ");
		int n = input.nextInt();
		int cursor = n-1;
		for(int i=1; i<=n; i++)
		{
			for(int k=0; k<cursor; k++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<i; j++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
			cursor--;
			
		}
		input.close();
	}

}
