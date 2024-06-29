package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier{

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() { 
		String funkyText = "";
		for(int i = 0; i < unfunkifiedText.length(); i++) {
			if(i % 2 == 1) {
				funkyText += Character.toUpperCase(unfunkifiedText.charAt(i));
			} else {
				funkyText += Character.toLowerCase(unfunkifiedText.charAt(i));
			}
		}
		return funkyText;
	}

    
}
