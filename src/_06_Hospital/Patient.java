package _06_Hospital;

public class Patient {
	
	private boolean feelsCared;
	
	public Patient() {
		feelsCared = false;
	}
	
	public boolean feelsCaredFor() {
		return feelsCared;
	}
	
	public void checkPulse() {
		feelsCared = true;
	}
	
}
