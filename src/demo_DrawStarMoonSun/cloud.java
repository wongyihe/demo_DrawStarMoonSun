package demo_DrawStarMoonSun;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class cloud extends draw_element {

	int n=30;
	public cloud(Point p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	public cloud(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	void setup(int n) {
		this.n=n;
	}
	//suppose up:1;down:2; right:3; left:4

	@Override
	void draw(Graphics g) {
		
		g.fillArc(p.x, p.y, 2*n, n, 0, 360);
		g.fillArc(p.x+n, p.y-n, 3*n, 2*n, 0, 360);
		g.fillArc(p.x+3*n, p.y-n/2, 2*n, n, 0, 360);
		g.fillArc(p.x+3*n, p.y, 3*n, n, 0, 360);
	}

}
