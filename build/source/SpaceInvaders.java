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

public class SpaceInvaders extends PApplet {


public ArrayList[] bullets = new ArrayList[];

public void setup() {

  
  background(0);
  frameRate(60);

};

public void draw() {
  background(0);
  fill(0xff0000FF);
  rect(mouseX-15, height-31, 30, 40, 2);
  if (!bullets[].isEmpty()) {
    bullet1.move();
  }

};

public void mouseClicked() {
  Bullet bullet1 = new Bullet(mouseX, mouseY, 1);

};

public class Bullet {
  float xpos, ypos, speed;
  boolean doExplode = false;
  Bullet(int x, int y, int speedd) {
    ypos = y;
    xpos = x;
    speed = speedd;
  };

  public void move() {

    if (ypos < 40) {
      doExplote = true;
    } else {
      ypos -= speed;
    }

    if (!doExplode) {
      rect(xpos, ypos, 10, 30);
    }



  };



};
  public void settings() {  size(900, 900); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "SpaceInvaders" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
