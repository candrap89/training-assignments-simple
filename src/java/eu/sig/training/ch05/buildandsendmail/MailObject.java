package eu.sig.training.ch05.buildandsendmail;

public class MailObject {
	private String firstName;
	private String lastName;
	private String division;
	private String subject;
	private String message1;
	private String message2;
	private String message3;

	public MailObject(String firstName, String lastName, String division, String subject, String message1,
			String message2, String message3) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.division = division;
		this.subject = subject;
		this.message1 = message1;
		this.message2 = message2;
		this.message3 = message3;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage1() {
		return message1;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public String getMessage2() {
		return message2;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	public String getMessage3() {
		return message3;
	}

	public void setMessage3(String message3) {
		this.message3 = message3;
	}
}