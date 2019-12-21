package demo_DrawStarMoonSun;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class star extends draw_element {
	private double r=30;
	
	public star(Point p) {
	super(p);
	}
	
	public star(int x,int y) {
		super(x,y);
	}
	void setup(double r){
		this.r=r;
	}
	@Override
	void draw(Graphics g) {
		double t,deg;
		double delta=360/10;
		int []X=new int[10];
		int []Y=new int[10];

		
		double r2=r/2;
		int index;
		for(deg=-90,index=0;deg<270;deg+=delta,index++)
		{
			int x=0;
			int y=0;
			if(index%2==0) 
			{
			t=deg*Math.PI/180;
			x=(int) (p.x+r*Math.cos(t));
			y=(int) (p.y+r*Math.sin(t));
			
			}
			else
			{
				t=deg*Math.PI/180;
				x=(int) (p.x+r2*Math.cos(t));
				y=(int) (p.y+r2*Math.sin(t));
			}
			X[index]=x;
			Y[index]=y;	
			
		}
	g.setColor(Color.YELLOW);
	g.fillPolygon(X,Y,X.length);
		
	}

}
