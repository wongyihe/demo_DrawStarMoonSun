package demo_DrawStarMoonSun;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class sun extends draw_element {

	private int l=90;
	public sun(Point p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	public sun(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	void setup(int l) {
		this.l=l;
	}
	@Override
	void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.yellow);
		
		int r=l/2;
		g.fillArc(p.x, p.y, l, l, 0, 360);
		double t,deg;
		double delta=360/12;
		int R=60;
		int Rl=(int) (R*Math.cos((delta/2)*Math.PI/180)+Math.tan(60*Math.PI/180)*R*Math.sin((delta/2)*Math.PI/180));
		
		System.out.println("R:"+R);
		System.out.println("Rl:"+Rl);
		int i,j;
		for(i=0,deg=0;i<6;i++,deg+=delta) {
			
			int []x=new int[3];
			int []y=new int[3];
	
			for(j=0;j<3;j++,deg+=(delta/2)) {
				t=deg*Math.PI/180;
				if(j==1) {
					x[j]=(int) (Rl*Math.sin(t)+p.x+r);
					y[j]=(int) (Rl*Math.cos(t)+p.y+r);
				}
				else {
					x[j]=(int) (R*Math.sin(t)+p.x+r);
					y[j]=(int) (R*Math.cos(t)+p.y+r);	
				}
			}
			deg-=(delta/2);
			g.fillPolygon(x, y, x.length);
		}
		
		
	}

}
