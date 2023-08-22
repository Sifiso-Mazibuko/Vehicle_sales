import java.util.Scanner;
public class TestVehicleSales{
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the vehicle model: ");
		String VehicleModel = input.nextLine();
		
		System.out.print("Please enter the year: ");
		int year = input.nextInt();
		
		System.out.print("Please enter the vehicle price: ");
		double vehiclePrice = input.nextDouble();
		
		System.out.print("Please enter the repayment term(60 or 72 month): ");
		int repaymentTerm = input.nextInt();
		
		int yearCorrect = 0;
		
		if(repaymentTerm == 60){
			
			yearCorrect = 5;
		}
		else if(repaymentTerm == 72 ){
			
			yearCorrect = 6;
		}
		
		
		VehicleSales obj = new VehicleSales(VehicleModel, year, vehiclePrice, yearCorrect);
		
		System.out.println();
		System.out.println("======================================================================");
		System.out.println("\t\tLoan Repayment Details");
		System.out.println("======================================================================");
		
		System.out.println();
		System.out.println("Model: " + obj.getModel());
		System.out.println("Year: " + obj.getYear());
		System.out.println("Principlay debt: " + obj.getPrincipalDebt());
		System.out.println("Term: "+ obj.getTerm() + " Months");
		System.out.println("Interest Rate: " + obj.INTEREST_RATE);
		System.out.println("Total interest: " + obj.getTotalInterest());
		System.out.println("Overaall debt: "+ obj.getOverallDebt());
		System.out.println("Montlhy Instalment: " + obj.getMonthlyIntsalment());
		
	}
}