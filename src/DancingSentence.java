import java.util.Random;

public class DancingSentence {
	public final static String ALPHABET = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsVvUuXxWwYyZz ";
	
	public static String generateSentence(){
		Random random = new Random();
		int size = random.nextInt(50);
		String sentence = "";
		for(int i = 0; i < size; i++){
			sentence += ALPHABET.charAt(random.nextInt(50));
		}
		return sentence;
	}
	
	public static String toDancingSentence(String sentence){
		String dancingSentence = "" + Character.toUpperCase(sentence.charAt(0));
		boolean previous;
		if(sentence.charAt(0) == ' ')
			previous = false;
		else
			previous = true;
		for(int i = 1; i < sentence.length(); i++)
		{
			if(sentence.charAt(i) == ' '){
				dancingSentence += sentence.charAt(i);
				continue;
			}
			else{
				if(previous){
					dancingSentence += Character.toLowerCase(sentence.charAt(i));
					previous = false;
				}
				else{
					dancingSentence += Character.toUpperCase(sentence.charAt(i));
					previous = true;
				}
			}
		}
		return dancingSentence;
	}

	public static void main(String[] args) {
		String sentence = generateSentence();
		System.out.println(sentence);
		System.out.println(toDancingSentence(sentence));
	}
}
