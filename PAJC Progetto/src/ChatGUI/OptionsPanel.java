package ChatGUI;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JRadioButton;

import java.awt.Cursor;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class OptionsPanel extends JComponent {
	
	private JTextField textIP;
	JRadioButton radioPenna;
	JRadioButton radioGomma;
	JSlider sliderStroke;
	JComboBox comboBox;
	JRadioButton radioSegmento;
	/**
	 * Create the panel.
	 */
	public OptionsPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		
		JLabel lblSpessore = new JLabel("Spessore");
		GridBagConstraints gbc_lblSpessore = new GridBagConstraints();
		gbc_lblSpessore.insets = new Insets(0, 0, 5, 5);
		gbc_lblSpessore.gridx = 5;
		gbc_lblSpessore.gridy = 1;
		add(lblSpessore, gbc_lblSpessore);
		
		JLabel lblColore = new JLabel("Colore");
		GridBagConstraints gbc_lblColore = new GridBagConstraints();
		gbc_lblColore.gridwidth = 2;
		gbc_lblColore.insets = new Insets(0, 0, 5, 5);
		gbc_lblColore.gridx = 7;
		gbc_lblColore.gridy = 1;
		add(lblColore, gbc_lblColore);
		
		radioPenna = new JRadioButton("Penna", true);
		radioPenna.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				radioGomma.setSelected(false);
				radioSegmento.setSelected(false);
			}
		});
		GridBagConstraints gbc_radioPenna = new GridBagConstraints();
		gbc_radioPenna.anchor = GridBagConstraints.WEST;
		gbc_radioPenna.insets = new Insets(0, 0, 5, 5);
		gbc_radioPenna.gridx = 1;
		gbc_radioPenna.gridy = 1;
		add(radioPenna, gbc_radioPenna);
		

		radioGomma = new JRadioButton("Gomma");
		Toolkit toolKit = Toolkit.getDefaultToolkit();
		Image image = toolKit.getImage("/Users/Livio/Documents/workspace_mars/PAJC Progetto/Risorse/gomma.png");
		image.getScaledInstance(1, 1, 1);
		Cursor c = toolKit.createCustomCursor(image, new Point(), "Gomma");
		radioGomma.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				radioPenna.setSelected(false);
				radioSegmento.setSelected(false);
			}
		});
		GridBagConstraints gbc_radioGomma = new GridBagConstraints();
		gbc_radioGomma.anchor = GridBagConstraints.WEST;
		gbc_radioGomma.insets = new Insets(0, 0, 5, 5);
		gbc_radioGomma.gridx = 1;
		gbc_radioGomma.gridy = 2;
		add(radioGomma, gbc_radioGomma);
		
		radioSegmento = new JRadioButton("Segmento");
		radioSegmento.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				radioGomma.setSelected(false);
				radioPenna.setSelected(false);
			}
		});
		GridBagConstraints gbc_radioSegmento = new GridBagConstraints();
		gbc_radioSegmento.anchor = GridBagConstraints.WEST;
		gbc_radioSegmento.insets = new Insets(0, 0, 0, 5);
		gbc_radioSegmento.gridx = 1;
		gbc_radioSegmento.gridy = 3;
		add(radioSegmento, gbc_radioSegmento);
		
		sliderStroke = new JSlider();
		GridBagConstraints gbc_sliderStroke = new GridBagConstraints();
		gbc_sliderStroke.insets = new Insets(0, 0, 5, 5);
		gbc_sliderStroke.gridx = 5;
		gbc_sliderStroke.gridy = 2;
		add(sliderStroke, gbc_sliderStroke);
		
		comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 7;
		gbc_comboBox.gridy = 2;
		add(comboBox, gbc_comboBox);
		
		
		
		JLabel lblIndirizzoIp = new JLabel("Indirizzo IP:");
		GridBagConstraints gbc_lblIndirizzoIp = new GridBagConstraints();
		gbc_lblIndirizzoIp.insets = new Insets(0, 0, 0, 5);
		gbc_lblIndirizzoIp.gridx = 5;
		gbc_lblIndirizzoIp.gridy = 3;
		add(lblIndirizzoIp, gbc_lblIndirizzoIp);
		
		textIP = new JTextField();
		GridBagConstraints gbc_textIP = new GridBagConstraints();
		gbc_textIP.insets = new Insets(0, 0, 0, 5);
		gbc_textIP.fill = GridBagConstraints.HORIZONTAL;
		gbc_textIP.gridx = 7;
		gbc_textIP.gridy = 3;
		add(textIP, gbc_textIP);
		textIP.setColumns(10);

	}

}
