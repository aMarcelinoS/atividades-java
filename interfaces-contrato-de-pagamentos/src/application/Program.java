package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.OnlinePaymentService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		OnlinePaymentService ps = new PaypalService();



		System.out.println("Enter contract data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/mm/yyyy): ");
		sc.nextLine();
		Date date = sdf.parse(sc.nextLine());
		System.out.print("Contract value: ");
		double value = sc.nextDouble();

		Contract contract = new Contract(number, date, value);

		System.out.println();
		System.out.print("Enter number of installments: ");
		int numMonths = sc.nextInt();

		ContractService cs = new ContractService(new PaypalService());

		cs.processContract(contract, numMonths);

		System.out.println();
		System.out.println("Intallments:");
		for(Installment x : contract.getInstallments()) {
			System.out.println(x);
		}
		sc.close();
	}
}
