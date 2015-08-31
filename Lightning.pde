int startx = 150;
int starty = 0;
int endx = 0;
int endy = 150;
int vtimer =0;

void setup()
{
  size(300,300);
  background(0);
  strokeWeight(1);
}
void draw()
{
  timer();
lightning();
}
void lightning(){
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
void lighting(){
  int lightr=(int)(Math.random()*8);
  if(lightr>2){
    background(0);
  }
  else{
    background(255);
  }
  
  
}
void mousePressed()
{
	lighting();
startx = mouseX;
starty = 0;
endx = 0;
endy = 150;

}
void timer()
{

	if(vtimer==20){
		vtimer=0;
		background(0);
	}
	vtimer++;
}
