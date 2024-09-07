package Sesion6;

import java.util.ArrayList;

/**
 * @author GraceLowery
 * @version 1.0
 * @created 05-sep-2024 6:32:46 PM
 */
public class Faculty {

	private String building;
	private int id;
	private String name;
	private ArrayList<Cordination> cordinationList;

	// Constructor
	public Faculty() {
		cordinationList = new ArrayList<>();
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Method to add a new Cordination
	public void agregarCordination(int code, String name) {
		Cordination newCordination = new Cordination(code, name);
		cordinationList.add(newCordination);
	}

	// Method to return the list of Cordination objects
	public ArrayList<Cordination> mostrarListasCordination() {
		return cordinationList;
	}

	@Override
	public void finalize() throws Throwable {
		// Finalization logic if needed
	}
}
