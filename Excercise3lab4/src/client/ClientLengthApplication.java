package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * This method launch the frame and manage the connection to the server.
 * 
 * @author emalianakasmuri
 *
 */

public class ClientLengthApplication {

	public static void main(String[] args) 
			throws UnknownHostException, IOException {
		
		// Launch client-side frame
		ClientLengthFrame clientLengthFrame = new ClientLengthFrame();
		clientLengthFrame.setVisible(true);
		
		// Connect to the server @ localhost, port 4228
		Socket socket = new Socket(InetAddress.getLocalHost(), 4227);
		
		// Update the status of the connection
		clientLengthFrame.updateConnectionStatus(socket.isConnected());
		
		// Read from network
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
		
		// Display the current Sentence and word count
		String currentSentence = bufferedReader.readLine();
		String wordCount = bufferedReader.readLine();
		clientLengthFrame.updateServerSentence(currentSentence);
		// Close everything
		bufferedReader.close();
		socket.close();

	}

}
