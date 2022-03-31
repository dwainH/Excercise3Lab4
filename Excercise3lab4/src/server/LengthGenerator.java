package server;

/**
 * This class defines the sentence that is sent.
 * 
 * @author emalianakasmuri
 *
 */
public class LengthGenerator {


	/**
	 * This method defines the current sentence.
	 * 
	 * @return current sentence
	 */
	public String getCurrentSentence() {

		String currentSentence = " I love programming";
		
		int wordcount =0;

		for(int i=0; i<=currentSentence.length()-1; i++){
			if(currentSentence.charAt(i) == ' ' && currentSentence.charAt
					(i+1)!=' '){
				wordcount++;
			}
		}
		
		String words = Integer.toString(wordcount);
		
		String updatedSentence = currentSentence + " (" + words + " words)";

		return updatedSentence;

	}


}
