import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startx = 150;
int starty = 0;
int endx = 0;
int endy = 150;
int timer =0;

public void setup()
{
  size(300,300);
  background(0);
  strokeWeight(1);
}
public void draw()
{
  timer();
lightning();
}
public void lightning(){
  int sa = (int)(Math.random()*256);
  int sb = (int)(Math.random()*256);
  int sc = (int)(Math.random()*256);
 stroke(sa,sb,sc);
 while(endy<300){
  endx=startx+((int)(Math.random()*3)-1)*(int)(Math.random()*20);
  endy=starty+(int)(Math.random()*10); 
 line(startx,starty,endx,endy);
 startx=endx;
 starty=endy;
 }
}
public void lighting(){
  int lightr=(int)(Math.random()*8);
  if(lightr>2){
    background(0);
  }
  else{
    background(255);
  }
  
  
}
public void mousePressed()
{
	lighting();
startx = mouseX;
starty = 0;
endx = 0;
endy = 150;

}
public void timer()
{

	if(timer==20){
		timer=0;
		background(0);
	}
	timer++;
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
