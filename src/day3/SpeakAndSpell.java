package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak(" spell duckface");
		// 2. Catch the user's answer in a String
String words = JOptionPane.showInputDialog("type the word");
		// 3. If the user spelled the word correctly, speak "correct"
if (words.equals("duckface")) {
speak("correct, you wrote the correct word. good for you. have some bling everyday.");
}
else{
speak("wrong word you wrote. you suck at english. get out of my face ASAP.");
}
	
	 
	speak(" spell fishface");
	// 2. Catch the user's answer in a String
 words = JOptionPane.showInputDialog("type the word");
	// 3. If the user spelled the word correctly, speak "correct"
if (words.equals("fishface")) {
speak("correct, you wrote the correct word. good for you. have some bling everyday.");
}
else{
speak("wrong word you wrote. you suck at english. get out of my face ASAP.");
}
			// 4. Otherwise say "wrong"

	// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
	speak(" spell bolony");
	// 2. Catch the user's answer in a String
words = JOptionPane.showInputDialog("type the word");
	// 3. If the user spelled the word correctly, speak "correct"
if (words.equals("bolony")) {
speak("correct, you wrote the correct word. good for you. have some bling everyday.");
}
else{
speak("wrong word you wrote. you suck at english. get out of my face ASAP.");
}
		// 5. repeat the process for other words
		
	
	speak(" spell smartypants");
	// 2. Catch the user's answer in a String
words = JOptionPane.showInputDialog("type the word");
	// 3. If the user spelled the word correctly, speak "correct"
if (words.equals("smartypants")) {
speak("correct, you wrote the correct word. good for you. have some bling everyday.");
speak("congratulations, you have completed the boring test. hip-hip horay now get away and get some victory juck food or icecream.");
}
else{
speak("wrong word you wrote. you suck at english. get out of my face ASAP. You are not a smarty pants at all.");
speak("congratulations, you have completed the boring test. hip-hip horay now get away from the computer or i will come at you. ");
}
	}
static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


