package Sesion6;

/**
 * @author GraceLowery
 * @version 1.0
 * @created 05-sep-2024 6:32:46 PM
 */
public class Cordination {

	private int code;
	private String name;

	// Corrected constructor
	public Cordination(int code, String name) {
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void finalize() throws Throwable {
		// Your cleanup logic
	}
}
