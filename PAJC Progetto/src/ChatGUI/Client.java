package ChatGUI;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

public class Client {

	int port = 1234;
	String name;
	Socket client;
	DataInputStream input;
	PrintStream output;
	
	public void funct (){
		
	try {
		client = new Socket(name, port);
	}
	catch (IOException ioe){
		System.out.println(ioe);
		}
	
	try {
		input = new DataInputStream(client.getInputStream());
		output = new PrintStream(client.getOutputStream());
	} catch (IOException ioe) {
		System.out.println(ioe);
	}
	try {
		input.close();
		output.close();
		client.close();
	} catch (Exception e) {
		System.out.println(e);	
		}
	}
}
