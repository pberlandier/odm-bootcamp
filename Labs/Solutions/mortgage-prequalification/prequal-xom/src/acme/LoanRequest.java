package acme;

import java.util.List;

public class LoanRequest {
	private Borrower primaryBorrower;
	private List<Borrower> coBorrowers;
	private Property property;
	
	private int amount;	
	private String purpose;
	private String term;
	
	private boolean eligible;
	private String riskGrade;
	private double baseRate;
	private double finalRate;
	//
	// Accessors
	//
	public int getLTV() {
		return (int)(((double)amount / (double)property.getValue())*100);
	}
	
	public Borrower getPrimaryBorrower() {
		return primaryBorrower;
	}
	public void setPrimaryBorrower(Borrower primaryBorrower) {
		this.primaryBorrower = primaryBorrower;
	}
	public List<Borrower> getCoBorrowers() {
		return coBorrowers;
	}
	public void setCoBorrowers(List<Borrower> coBorrowers) {
		this.coBorrowers = coBorrowers;
	}
	public Property getProperty() {
		return property;
	}
	public void setProperty(Property property) {
		this.property = property;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public boolean isEligible() {
		return eligible;
	}
	public void setEligible(boolean eligible) {
		this.eligible = eligible;
	}
	public String getRiskGrade() {
		return riskGrade;
	}
	public void setRiskGrade(String riskGrade) {
		this.riskGrade = riskGrade;
	}
	public double getBaseRate() {
		return baseRate;
	}
	public void setBaseRate(double baseRate) {
		this.baseRate = baseRate;
	}
	public double getFinalRate() {
		return finalRate;
	}
	public void setFinalRate(double finalRate) {
		this.finalRate = finalRate;
	}
}
