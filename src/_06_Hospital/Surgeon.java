package _06_Hospital;

import java.util.ArrayList;

public class Surgeon extends Doctor {

	@Override
	public void assignPatient(Patient p) throws DoctorFullException {
		// TODO Auto-generated method stub
		if (patientList.size() >= 3) {
            throw new DoctorFullException("Cannot assign more than three patients to this Surgeon.");
        }
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

	public boolean performsSurgery() {
		return true;
	}
	
	public boolean makesHouseCalls() {
		return false;
	}
}
