package ChatGUI;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Stroke;
import java.util.HashMap;
import java.util.Map;

public class Brain {
	
	private Color currentColor;
	private Stroke currentStroke;
	private StringBuffer testoChat;
	//private Map<ColoredPoint, String> cronologia = new HashMap<ColoredPoint, String>(); // creiamo una mappa per fare la cronologia con un combobox?? esoso
	
	
	
	public Brain(Color currentColor, Stroke currentStroke, StringBuffer testoChat) {
		super();
		this.currentColor = currentColor;
		this.currentStroke = currentStroke;
		this.testoChat = testoChat;
	}
	
	
	public Brain (){
		currentColor = Color.BLACK;
		currentStroke = new BasicStroke(4);
		testoChat = new StringBuffer();
		
	}
	
	public void setCurrentColor (Color color){
		this.currentColor = color;
	}
	
	public void setCurrentStroke (Stroke stroke){
		this.currentStroke = stroke;
	}

	public void appendChat (StringBuffer sb ){
		testoChat.append(sb.toString());
	}
	
}
