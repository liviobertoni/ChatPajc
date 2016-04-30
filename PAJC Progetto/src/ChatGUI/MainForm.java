package ChatGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.Stroke;
import java.awt.GridBagConstraints;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.JComboBox;

import java.awt.BasicStroke;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JTextField;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.Format;

import javax.swing.JFormattedTextField;
import java.awt.Insets;

public class MainForm {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm window = new MainForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(Color.BLACK);
		frame.setBounds(100, 100, 883, 626);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{583, 270, 0};
		gridBagLayout.rowHeights = new int[]{16, 388, 164, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		JLabel lblPaintArea = new JLabel("Paint Area");
		
		
		lblPaintArea.setForeground(new Color(0, 0, 0));
		lblPaintArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblPaintArea = new GridBagConstraints();
		gbc_lblPaintArea.anchor = GridBagConstraints.WEST;
		gbc_lblPaintArea.fill = GridBagConstraints.VERTICAL;
		gbc_lblPaintArea.insets = new Insets(0, 0, 5, 5);
		gbc_lblPaintArea.gridx = 0;
		gbc_lblPaintArea.gridy = 0;
		frame.getContentPane().add(lblPaintArea, gbc_lblPaintArea);
		JLabel lblChatArea = new JLabel("Chat Area");
		
		
		lblChatArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblChatArea = new GridBagConstraints();
		gbc_lblChatArea.anchor = GridBagConstraints.WEST;
		gbc_lblChatArea.fill = GridBagConstraints.VERTICAL;
		gbc_lblChatArea.insets = new Insets(0, 0, 5, 0);
		gbc_lblChatArea.gridx = 1;
		gbc_lblChatArea.gridy = 0;
		frame.getContentPane().add(lblChatArea, gbc_lblChatArea);
		DrawPanel drawPanel = new DrawPanel();
		GridBagConstraints gbc_drawPanel = new GridBagConstraints();
		gbc_drawPanel.fill = GridBagConstraints.BOTH;
		gbc_drawPanel.insets = new Insets(0, 0, 5, 5);
		gbc_drawPanel.gridx = 0;
		gbc_drawPanel.gridy = 1;
		frame.getContentPane().add(drawPanel, gbc_drawPanel);
		
		ChatPanel chatPanel = new ChatPanel();
		GridBagConstraints gbc_chatPanel = new GridBagConstraints();
		gbc_chatPanel.fill = GridBagConstraints.BOTH;
		gbc_chatPanel.gridheight = 2;
		gbc_chatPanel.gridx = 1;
		gbc_chatPanel.gridy = 1;
		frame.getContentPane().add(chatPanel, gbc_chatPanel);
		
		OptionsPanel optionsPanel = new OptionsPanel();
		GridBagConstraints gbc_optionsPanel = new GridBagConstraints();
		gbc_optionsPanel.anchor = GridBagConstraints.NORTH;
		gbc_optionsPanel.insets = new Insets(0, 0, 0, 5);
		gbc_optionsPanel.gridx = 0;
		gbc_optionsPanel.gridy = 2;
		frame.getContentPane().add(optionsPanel, gbc_optionsPanel);
		
		
		
		
		
		
		
		
	}
}
