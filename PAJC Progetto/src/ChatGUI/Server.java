package ChatGUI;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	static int port = 1234;
	static String line;
	static ServerSocket server;
	static Socket client = null;
	static DataInputStream input;
	static PrintStream output;
	
	public static void main (String args){
		
	try {
		server = new ServerSocket(port);
	}
	catch (IOException ioe){
		System.out.println(ioe);
		}
	
	try {
		client = server.accept();
		input = new DataInputStream(client.getInputStream());
		output = new PrintStream(client.getOutputStream());
		
		while (true) {
			line = input.readLine();
			output.println(line);
			
		}
	} catch (IOException ioe){
		System.out.println(ioe);
		}
	
	
	try {
		input.close();
		output.close();
		client.close();
		server.close();
	} catch (Exception e) {
		System.out.println(e);
		}
	}
	
}
