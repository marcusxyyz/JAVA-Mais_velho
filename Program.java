package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people are you going to type? ");
		int n = sc.nextInt();
		
		String[] names = new String[n];
		int[] ages = new int[n];
		
		int older = 0;
		String olderPerson = "";
		for(int i=0; i < n; i++) {
			System.out.println(i + 1 + "st person details:");
			sc.nextLine();
			System.out.print("Name: ");
			names[i] = sc.nextLine();
			System.out.print("Age: ");
			ages[i] = sc.nextInt();
			
			if (ages[i] > older) {
				older = ages[i];
				olderPerson = names[i];
			}
		}
		
		System.out.println("Older Person: "+ olderPerson);
		
		sc.close();
	}

}
