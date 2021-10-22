package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List <TaxPayer> list =  new ArrayList<TaxPayer>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.println();
			System.out.println("Tax payer #"+ i +" data: ");
			System.out.print("Individual or company (i/c)? ");
			char ind = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual Income: ");			
			Double annualIncome = sc.nextDouble();
			if (ind == 'i') {
				System.out.print("Health expenditures: ");
				Double healthEx = sc.nextDouble();				
				list.add(new Individual(name, annualIncome, healthEx));
			}
			else {
				System.out.print("Number of employees: ");
				Integer numEmp = sc.nextInt();				
				list.add(new Company(name, annualIncome, numEmp));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer payer : list) {
			System.out.println(payer.getName() + ": $ " + String.format("%.2f", payer.tax()));
		}

		System.out.println();
		double sum = 0;
		for (TaxPayer payer : list) {
			sum += payer.tax();
		}
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

		
		sc.close();
	}

}
