package demo_DrawStarMoonSun;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class drawing {

	public static void main(String[] args) {
		Frame frame=new Frame();
		frame.setSize(1200, 700);
		frame.setBackground(Color.DARK_GRAY);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			System.exit(0);
			}
		});
		mycanvas c=new mycanvas();
		c.setSize(800,600);
		frame.add(c);
		frame.setVisible(true);

	}

}
class mycanvas extends Canvas {

	@Override
	public void paint(Graphics g) {
		
		int up=150;
		int middle=300;
		int down=500;
		int right=400;
		int left=300;
		
		// stars
		super.paint(g);
		star s=new star(left,up);
		s.draw(g);

		star s1=new star(left+40,up+30);
		s1.setup(5);
		s1.draw(g);
		
		star s2=new star(left+60,up);
		s2.setup(15);
		s2.draw(g);
		
		
		moon m2=new moon(100,middle);
		m2.setup(30, 100);
		m2.draw(g);
		
		
		moon m1=new moon(200,middle);
		m1.setup(100, 100);
		m1.draw(g);
		
		moon m3=new moon(300,middle);
		m3.setup(300, 100);
		m3.draw(g);		

		
		moon m4=new moon(420,middle);
		m4.setup(-100, 100);
		m4.draw(g);
		
		moon m5=new moon(570,middle);
		m5.setup(-30, 100);
		m5.draw(g);
		
		//滿月
		moon m6=new moon(750,middle);
		m6.setup(0, 100);
		m6.draw(g);		
		m6.move(3, g);
		
		
		//cloud
		cloud c1=new cloud(left+400,up+40);
		g.setColor(Color.LIGHT_GRAY);
		c1.setup(50);
		c1.draw(g);
		
		//sun
		sun su=new sun(left+600,up-30);
		su.draw(g);
		
		//cloud
		cloud c=new cloud(left+650,up+50);
		g.setColor(Color.WHITE);
		c.draw(g);
		

		
	}
	
	
}
