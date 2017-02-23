package day3;
import javax.swing.JOptionPane;
import java.util.Random;

public class Magic8ball {
	
	public static void main(String[] args) {
		int something = new Random().nextInt(4);
		JOptionPane.showMessageDialog(null, something );
	JOptionPane.showMessageDialog(null,("ENTER A QUESTION"));
	String words = JOptionPane.showInputDialog("Type The Question");
	if(something == 0) {
	speak("yes");}
	if(something == 1) {
		speak("what are you doing");}
	if(something == 2) {
		speak("no, you wrong person");}
		if(something == 3) {
			speak("i hate you, you got it wrong");}
			if(something == 4) {
				speak("got like a bonnit");}
				
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
