package Sesion6;

/**
 * @author GraceLowery
 * @version 1.0
 * @created 05-sep-2024 6:32:46 PM
 */
public class Teacher {

	private int id;
	private String lastname;
	private String name;
	private String qualification;
	private Cordination m_Cordination;

	// Constructor
	public Teacher() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	// Getter for Cordination
	public Cordination getCordination() {
		return m_Cordination;
	}

	// Setter for Cordination
	public void setCordination(Cordination cordination) {
		this.m_Cordination = cordination;
	}

	@Override
	public void finalize() throws Throwable {
		// Finalization logic if needed
	}
}
