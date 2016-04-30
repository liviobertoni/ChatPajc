package ChatGUI;

import javax.swing.JComponent;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.event.MouseInputListener;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.List;
import java.awt.Point;
import java.awt.Shape;
import java.awt.Stroke;

public class DrawPanel extends JComponent implements MouseListener, MouseInputListener{

	
	boolean isUsable;		//perde focus uscendo dal pannello
	boolean isFirstTouch;	//flag che permette di iniziare a disegnare senza avere una eccezione (array vuoto all'inizio, dopo aver disegnato la prima linea, separa la successiva )
	//is first touch for each line
	ArrayList<ColoredPoint> pointList;
	Color currentColor;
	Stroke stroke;
	/**
	 * Create the panel.
	 */
	
	
	public DrawPanel() {
		currentColor = Color.black;
		isFirstTouch = true;
		isUsable = false;
		pointList = new ArrayList<>();
		stroke = new BasicStroke(4);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.WHITE);
		g2.fillRect(0, 0, this.getWidth(), this.getHeight());
		//pointList.forEach(point -> drawPoint(point, g, 10));
	}
	
	private void drawPoint(ColoredPoint point, Graphics g, int size) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(point.color);
		if (isFirstTouch) pointList.add(new ColoredPoint(point)); //clono il punto in quanto non ho nessun punto precedente per disegnare la linea
		Point lastPoint = pointList.get(pointList.size()-2);	//prendo l'ultimo punto per avere gli estremi della linea
		
		g2.setStroke(stroke);
		g2.drawLine(lastPoint.x, lastPoint.y, point.x, point.y);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		isFirstTouch = true; //ogni volta che termina una linea, viene messo true, in modo da separarla dalla linea successiva
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		this.isUsable = true;		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		this.isUsable = false;		
		//this.currentColor = Color.white;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if (isUsable) {
			addPointToList(currentColor, e.getPoint());
			drawPoint(new ColoredPoint(e.getPoint(), currentColor), getGraphics(), 3);
			isFirstTouch = false; //durante il drag, il mouse è premuto, è come se disegnassi punti coincidenti, mettendo false si possono distinguere i vari punti
		}		
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub	
	}
	
	private void addPointToList(Color color, Point point){
		this.pointList.add(new ColoredPoint(point, color));
		}
	
	
}
