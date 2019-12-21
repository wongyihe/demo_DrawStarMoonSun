package demo_DrawStarMoonSun;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class moon extends draw_element {
	private double n=100;
	private double r=100;
	
	public moon(Point p) {
	super(p);
	}
	
	public moon(int x,int y) {
		super(x,y);
	}
	void setup(double n,double r){
		this.n=n;
		this.r=r;
	}
	
	void move(int dirrection,Graphics g) {
		g.clearRect(p.x-1, p.y-1, (int)(2*r)+2, (int)(2*r)+2);
		switch(dirrection) {
		case 1:p.y+=10;break;//up
		case 2:p.y-=10;break;//down
		case 3:p.x+=100;break;//right
		case 4:p.x-=10;break;//left
		}
		draw(g);
	}
	@Override
	void draw(Graphics g) {
		
		g.setColor(Color.YELLOW);
		g.drawArc(p.x, p.y, (int)r*2, (int)r*2, 90, 180);
//		System.out.println("x1:"+(p.x));
//		System.out.println("y1:"+p.y);
//		System.out.println("r1:"+r);
//		System.out.println("startangle1:"+90);
//		System.out.println("arcAngle1:"+180);
		
		g.setColor(Color.LIGHT_GRAY);
		if(n>0) {
		int t=(int)Math.toDegrees(Math.atan(n/r));
		int r2=(int)(Math.sqrt(r*r+n*n));
		int r1_r2=(int) (r2-r);
		int x2=(int)(p.x+n-r1_r2);
		int y2=p.y-r1_r2;
		int w2=r2*2;
		int h2=r2*2;
		int startangle2=t+90;
		int arcangle2=180-2*t;
		
		if(arcangle2>40) 
			g.drawArc(x2,y2, w2, h2, startangle2, arcangle2);	
		
		else if(arcangle2<=40) 
			g.drawLine((int)(p.x+r), (int)(p.y), (int)(p.x+r), (int)(p.y+2*r));
	
//		System.out.println("x2:"+x2);
//		System.out.println("y2:"+y2);
//		System.out.println("w2:"+w2);
//		System.out.println("h2:"+h2);
//		System.out.println("startangle2:"+startangle2);
//		System.out.println("arcangle2:"+arcangle2);
		}
		
		else if(n==0) {
			g.drawArc(p.x, p.y, (int)r*2, (int)r*2, 90, -180);
		}
		else {

			int t=(int)Math.toDegrees(Math.atan(n/r));
			int r2=(int)(Math.sqrt(r*r+n*n));
			int r1_r2=(int) (r2-r);
			int x2=(int)(p.x+n-r1_r2);
			int y2=p.y-r1_r2;
			int w2=r2*2;
			int h2=r2*2;
			int startangle2=t+90;
			System.out.println("t:"+t);
			int arcangle2=180+2*t;
			
			if(arcangle2>40) 
				g.drawArc(x2,y2, w2, h2, startangle2, -arcangle2);	
			
			else if(arcangle2<=40) 
				g.drawLine((int)(p.x+r), (int)(p.y), (int)(p.x+r), (int)(p.y+2*r));
		
//			System.out.println("x2:"+x2);
//			System.out.println("y2:"+y2);
//			System.out.println("w2:"+w2);
//			System.out.println("h2:"+h2);
//			System.out.println("startangle2:"+startangle2);
//			System.out.println("arcangle2:"+arcangle2);
		
		}
	}
}
