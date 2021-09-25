/*** When you are done, this program will draw a mole in 
     each of the holes.
***/
  int e1 = (int) 200;
  int e2 = (int) 70;
  int e3 = (int) 300;
  int e4 = (int) 297;   
  
  int e1Hight = (int) 200;
  int e2Hight = (int) 119;
  int e3Hight = (int) 60;
  int e4Hight = (int) 350;

void setup() {
     size(400, 400);
     background(78, 166, 51); // green grass
     
     // This code draws the holes. Run the program to see them.
     //random(296)+20
     
     fill(0, 0, 0);
     ellipse(e1, e1Hight, 100, 30);
     ellipse(e2, e2Hight, 100, 30);
     ellipse(e3, e3Hight, 100, 30);
     ellipse(e4, e4Hight, 100, 30);
}

void draw() {
  if(mousePressed) {
    if(mouseY < e1Hight-30 && mouseY > e1Hight+30 && mouseX < e1-100 && mouseX > e1+100) {
      drawMole(e1, e1Hight);
    }
  }
/* Write code here that uses the drawMole method to put a mole in each of the holes */


}

void drawMole(int moleX, int moleY) {
     noStroke();
     fill(125, 93, 43);
     ellipse(moleX, moleY, 60, 60); // face
     fill(255, 237, 209);
     ellipse(moleX, moleY+10, 33, 28); 
     fill(0, 0, 0);
     ellipse(moleX-10, moleY-15, 10, 10); // eyes
     ellipse(moleX+10, moleY-15, 10, 10);
     ellipse(moleX, moleY-5, 10, 10); // nose
     ellipse(moleX, moleY+10, 20, 5); // mouth
}
