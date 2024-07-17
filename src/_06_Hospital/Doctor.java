package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {
	
	protected ArrayList<Patient> patientList;
	
	public Doctor() {
		patientList = new ArrayList<Patient>();
	}
	
	public abstract void assignPatient(Patient p);
	
	public abstract ArrayList<Patient> getPatients();
	
	public abstract void doMedicine();
}
