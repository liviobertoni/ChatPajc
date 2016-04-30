package ChatGUI;

import ChatGUI.ThreadedEchoServer;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.Timer;

import ChatGUI.EchoThread;

public class Main {

	static int port = 1234;
	static String line;
	static ServerSocket server;
	static Socket client = null;
	static DataInputStream input;
	static PrintStream output;
	
	//public static void main (String args){
		
	
	

	public static void main(String[] args) {
		
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
		
//		System.out.println("ip: ");
//		Scanner in = new Scanner(System.in);
//		
//		String s = in.nextLine();
//		ThreadedEchoServer tes = new ThreadedEchoServer();
//		Socket socket = null;
//		EchoThread et;
//		Timer timer = new Timer();
//		try {
//			socket = new Socket(s, 1234);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		if (socket != null)
//		et = new EchoThread(socket);
//}

}
