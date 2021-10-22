package entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenses;
	

	public Individual() {
		super();
	}
	
	public Individual(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}


	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	
	@Override
	public double tax() {
		double baseTax;
		
		if (getAnnualIncome() < 20000) {
			baseTax = getAnnualIncome() * 0.15;
		}
		else {
			baseTax = getAnnualIncome() * 0.25;
		}
		baseTax -= getHealthExpenses() * 0.5;
			if (baseTax < 0.00) {
				return 0.0;
			}
		
		
		return baseTax;
	}

}
		
		
