import java.util.*;
class Assignment04{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("|\t\t\tSALARY INFORMATION SYSTEM\t\t\t|");
		System.out.println("-------------------------------------------------------------------------\n");
		System.out.println("\t[1] Calculate Income Tax");
		System.out.println("\t[2] Calculate Annual Bonus");
		System.out.println("\t[3] Calculate Loan Amount");	
		
		System.out.print("\nEnter an option to continue > ");
		int num = input.nextInt();
		input.nextLine();

		String name;
		double salary;

		switch(num){
			case 1:
				System.out.println("\n\n\n-------------------------------------------------------------------------");
				System.out.println("|\t\t\tCalculate Income Tax\t\t\t\t|");
				System.out.println("-------------------------------------------------------------------------");

				System.out.print("\nInput employee name\t : ");
				name = input.nextLine();

				System.out.print("Input employee salary\t : ");
				salary = input.nextDouble();

				double tax=0;

				if(salary<=100000){
					tax=0;
				}else if(salary<=141667){
					tax=(salary-100000)*0.06;
				}else if(salary<=183333){
					tax=2500+(salary-141667)*0.12;
				}else if(salary<=225000){
					tax=7500+(salary-183333)*0.18;
				}else if(salary<=266667){
					tax=15000+(salary-225000)*0.24;
				}else if(salary<=308333){
					tax=25000+(salary-266667)*0.30;
				}else if(salary>308333){
					tax=37500+(salary-308333)*0.36;
				}
				
				int tax_round = (int)Math.round(tax);
				System.out.println("\nYou have to pay Income Tax per month : "+tax_round+"\n\n\n");
				break;
			case 2:
				System.out.println("\n\n\n-------------------------------------------------------------------------");
				System.out.println("|\t\t\tCalculate Annual Bonus\t\t\t\t|");
				System.out.println("-------------------------------------------------------------------------");

				System.out.print("\nInput employee name\t : ");
				name = input.nextLine();

				System.out.print("Input employee salary\t : ");
				salary = input.nextDouble();

				double bonus=0;

				if(salary<=100000){
					bonus=5000;
				}else if(salary<=199999){
					bonus=salary*0.10;
				}else if(salary<=299999){
					bonus=salary*0.15;
				}else if(salary<=399999){
					bonus=salary*0.20;
				}else if(salary>399999){
					bonus=salary*0.35;
				}

				System.out.println("\nAnnual bonus : "+bonus+"\n\n\n");
				break;
			case 3:
				System.out.println("\n\n\n-------------------------------------------------------------------------");
				System.out.println("|\t\t\tCalculate Loan Amount\t\t\t\t|");
				System.out.println("-------------------------------------------------------------------------");

				System.out.print("\nInput employee name\t\t : ");
				name = input.nextLine();

				System.out.print("Input employee salary\t\t : ");
				salary = input.nextDouble();

				System.out.print("Enter the number of years\t : ");
				double years = input.nextDouble();
				
				double monthly_installment=salary*0.6;
				double months=12*years;
				double annual_interest_rate = 15.0 / 100;
				double monthly_Interest_rate = annual_interest_rate / 12;

				if(salary>=50000 && years<=5){
					double loan_amount = monthly_installment * (1-(1/Math.pow(1+monthly_Interest_rate,months)))/monthly_Interest_rate;
					int loan_amount_round = (int)Math.round(loan_amount / 1000) * 1000;
					System.out.println("\nYou can get Loan Amount : "+loan_amount_round+"\n\n\n");
				}else if(salary<50000 && years>5){
					System.out.println("\nYou can not get a loan because your salary lessthan Rs. 50 000...");
					System.out.println("Maximum number of years allowed is 5...\n\n\n");
				}else if(salary<50000){
					System.out.println("\nYou can not get a loan because your salary lessthan Rs. 50 000...\n\n\n");	
				}else if(years>5){
					System.out.println("\nMaximum number of years allowed is 5...\n\n\n");
				}
				break;
			default:
				System.out.println("\nEnter valid option!");
		}
	}
}