package ChatGUI;

import java.awt.Color;
import java.awt.Point;

public class ColoredPoint extends Point {

	Color color;
	
	public ColoredPoint(){
		super(0,0);
		color = Color.BLACK;
	}
	
	public ColoredPoint(Point point, Color color){
		super(point);
		this.color = color;
	}
	
	public ColoredPoint(ColoredPoint point){
		this.x = point.x;
		this.y = point.y;
		this.color = color;
	}
}
