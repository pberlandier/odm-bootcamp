package acme;

import java.util.Date;

public class Borrower {
	private Date dateOfBirth;
	private String employmentType;
	private String employerName;
	private int creditScore;
	private int latePayments;
	private String citizenshipStatus;
	//
	// Accessors
	//
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmploymentType() {
		return employmentType;
	}
	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	public int getLatePayments() {
		return latePayments;
	}
	public void setLatePayments(int latePayments) {
		this.latePayments = latePayments;
	}
	public String getCitizenshipStatus() {
		return citizenshipStatus;
	}
	public void setCitizenshipStatus(String citizenshipStatus) {
		this.citizenshipStatus = citizenshipStatus;
	}
}
