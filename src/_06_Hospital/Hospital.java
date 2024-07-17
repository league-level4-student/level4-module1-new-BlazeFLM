package _06_Hospital;

import java.util.ArrayList;

public class Hospital {
	
	private ArrayList<Doctor> doctorList;
	private ArrayList<Patient> unassignedPatientList;
	
	public void addDoctor(Doctor d) {
		doctorList.add(d);
	}
	
	public void addPatient(Patient p) {
		unassignedPatientList.add(p);
	}
	
	public ArrayList<Doctor> getDoctors(){
		return doctorList;
	}
	
	public ArrayList<Patient> getPatients(){
		return unassignedPatientList;
	}
}
