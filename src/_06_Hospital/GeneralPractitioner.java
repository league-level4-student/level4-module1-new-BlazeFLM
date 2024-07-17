package _06_Hospital;

import java.util.ArrayList;

public class GeneralPractitioner extends Doctor {
	
	@Override
	public void assignPatient(Patient p) {
		// TODO Auto-generated method stub
		patientList.add(p);
	}

	@Override
	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patientList;
	}

	@Override
	public void doMedicine() {
		// TODO Auto-generated method stub
		for(Patient p : patientList) {
			p.checkPulse();
		}
	}
	
	public boolean makesHouseCalls() {
		return true;
	}
	
	public boolean performsSurgery() {
		return false;
	}
}
