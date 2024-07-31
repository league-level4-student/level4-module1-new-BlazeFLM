package _06_Hospital;

import java.util.ArrayList;

public class Hospital {

	private ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
	private ArrayList<Patient> unassignedPatientList = new ArrayList<Patient>();

	public void addDoctor(Doctor d) {
		doctorList.add(d);
	}

	public void addPatient(Patient p) {
		unassignedPatientList.add(p);
	}

	public ArrayList<Doctor> getDoctors() {
		return doctorList;
	}

	public ArrayList<Patient> getPatients() {
		return unassignedPatientList;
	}

	public void assignPatientsToDoctors() throws DoctorFullException {
		int count = 0;
		int currentDoctor = 0;
		while(!unassignedPatientList.isEmpty()) {
			doctorList.get(currentDoctor).assignPatient(unassignedPatientList.get(0));
			unassignedPatientList.remove(0);
			count++;
			if(count > 2) {
				currentDoctor++;
				count = 0;
			}
			
		}
	}
	
}
