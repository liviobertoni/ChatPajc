package ChatGUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.KeyAdapter;
import javax.swing.ScrollPaneConstants;

public class ChatPanel extends JComponent {

	/**
	 * Create the panel.
	 */
	
	
	
	JScrollPane scrollPaneChat;
	JTextArea chatArea;
	JScrollPane scrollPaneInput;
	JTextArea inputArea;
	JButton btnInvia;
	
	public ChatPanel() {
		setLayout(null);
		
		
		
		scrollPaneChat = new JScrollPane();
		scrollPaneChat.setBounds(6, 6, 212, 388);
		add(scrollPaneChat);
		
		chatArea = new JTextArea();
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		chatArea.setEditable(false);
		scrollPaneChat.setViewportView(chatArea);
		
		scrollPaneInput = new JScrollPane();
		scrollPaneInput.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneInput.setBounds(6, 407, 159, 65);
		add(scrollPaneInput);
		
		inputArea = new JTextArea();
		inputArea.setLineWrap(true);
		inputArea.setWrapStyleWord(true);
		scrollPaneInput.setViewportView(inputArea);
		
		btnInvia = new JButton("Invia");
		btnInvia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				updateChat();
			}
		});
		btnInvia.setBounds(177, 406, 41, 66);
		add(btnInvia);
		
		
	}
	public void updateChat (){
		chatArea.append(inputArea.getText() + "\n");
		inputArea.selectAll();
		inputArea.setText("");
		
	}
}
