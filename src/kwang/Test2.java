package kwang;

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

//xxxx
//import acm.graphics.GLabel;
//import acm.graphics.GOval;
//import acm.graphics.GRect;
//import acm.program.*;

 	   
	   
public class Test2 extends GraphicsProgram  {
   public static final double PHI = 1.618;
   public void run() {
      println("hello, world");
      //GLabel label = new GLabel("hello, world");
      //label.setFont("SansSerif-100");
      //double x = (getWidth() - label.getWidth()) / 2;
      //double y = (getHeight() + label.getAscent()) / 2;
      //add(label, x, y);
      
      //GRect rect = new GRect(100, 50, 100, 100 / PHI);
      //rect.setFilled(true);
      //rect.setColor(Color.RED);
      //add(rect);
      //GOval oval = new GOval(150, 50 + 50 / PHI, 100, 100 / PHI);
      GOval oval = new GOval(0,0,100,100);
      oval.setFilled(true);
      oval.setColor(Color.GREEN);
      add(oval);

      for(int i =0;i<10;i++) {
    	  GPoint point = oval.getLocation();
    	  System.out.println(point);
    	  point.setLocation(point.getX(),point.getY() + i/PHI);
    	  oval.setLocation(point);
    	  pause(20);
      }
      
      
      //GLabel label = new GLabel(HEADLINE);
      //label.setFont("Serif-72");
      //add(label, getWidth(), (getHeight() + label.getAscent()) / 2);
      //while (label.getX() + label.getWidth() > 0) {
      //   label.move(-2, 0);
      //   pause(20);
      //}
      
      
   }
 
/* Standard Java entry point */
/* This method can be eliminated in most Java environments */
   public static void main(String[] args) {
      new Test2().start(args);
	  //System.out.println("xxxx");
   }
} 
/*
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(2);
		System.out.println(c1);
		Number n = new Number(2.01);
		System.out.println(n);
	}

}*/



		