package demo_DrawStarMoonSun;

import java.awt.Graphics;
import java.awt.Point;

public abstract class draw_element {
	protected Point p;

	public draw_element(Point p) {
		super();
		this.p = p;
	}
	
	public draw_element(int x,int y) {
		p=new Point();
		p.x=x;
		p.y=y;
	}
	abstract void draw(Graphics g);
}
