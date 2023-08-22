public class VehicleSales{
	
	public final double INTEREST_RATE = 6.5/100;
	private String model;
	private int year;
	private int term;
	private double principalDebt;
	private double totalInterest;
	private double overallDebt;
	private double monthlyInstalment;
	
	
	public VehicleSales(String model, int year, double principalDebt, int term){
		
		this.model = model;
		this.year = year;
		this.principalDebt = principalDebt;
		this.term = term;

		calcTotalInterest();
		calcOverallDebt();
		calcMonthlyInstallment();
	}
	
	public String getModel(){
		
		return model;
	}
	
	public int getYear(){
		
		return year;
	}
	
	public int getTerm(){
		
		return term;
	}
	
	public double getPrincipalDebt(){
		
		return principalDebt;
	}
	
	public double getTotalInterest(){
		
		return totalInterest;
	}
	
	public double getOverallDebt(){
		
		return overallDebt;
	}
	
	public double getMonthlyIntsalment(){
		
		return monthlyInstalment;
	}
	
	public void calcTotalInterest(){
		
		totalInterest = (principalDebt * INTEREST_RATE) * term;
	}
	
	public void calcOverallDebt(){
		
		overallDebt = principalDebt + totalInterest;
	}
	
	public void calcMonthlyInstallment(){
		
		monthlyInstalment = overallDebt/term;
	}
	
	
}