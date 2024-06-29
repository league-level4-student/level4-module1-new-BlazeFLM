package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {
    	StringBuilder b = new StringBuilder();
    	b.append(unfunkifiedText);
    	b.reverse();
        return b.toString();

    }
}
