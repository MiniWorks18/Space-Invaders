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


Bullet bullet;
ArrayList<Bullet> bullets = new ArrayList<Bullet>();
Boolean liveBullet = false;

float targetx = width/2, targety = 100, targetheight = 30, targetwidth = 40, speed = 1;
//Target move direction, false for left
Boolean tdirect = false;
int targetbuffer = 40;



public void setup() {

  
  background(0);
  frameRate(60);

  //Target target1 = new Target(width/2, 100, 40, 50, 1);

};

public void draw() {
  background(0);
  fill(0xff0000FF);
  rect(mouseX-10, height-31, 30, 40, 2);

  //for loop moves each bullet in ArrayList "bullets"
    for (int i = 0; i < bullets.size(); i++) {
      bullets.get(i).move();
    }



  noCursor();


  if (!targetHit) {

    //Toggle target direction based on distance from the window edge
    if (targetx < targetbuffer) {
      tdirect = true;
    } else if (targetx > width-(targetbuffer+targetwidth)) {
      tdirect = false;
    };

    if (tdirect) {
      targetx += speed;
    } else {
      targetx -= speed;
    };

    rect(targetx, targety, targetwidth, targetheight);
  }


};



public void mousePressed() {
  bullet = new Bullet(mouseX, height-60, 10, 20, 30);
  bullets.add(bullet);

};
public boolean doExplode = false;
public boolean targetHit = false;

public class Bullet {
  float xpos, ypos, bwidth, bheight, speed;
  boolean doExplode = false;
  Bullet(float x, float y, float bulletwidth, float bulletheight, float speedd) {
    ypos = y;
    xpos = x;
    bwidth = bulletwidth;
    bheight = bulletheight;
    speed = speedd;
  };

  public void move() {

    if (ypos < 40) {
      doExplode = true;
    } else {
      ypos -= speed;
    }

    if (!doExplode) {
      rect(xpos, ypos, 10, 30);
    } else {
      xpos = 0;
      ypos = 0;
    }

    if (ypos < targety+targetheight && xpos > (targetx-bwidth) && xpos < (targetx+targetwidth)) {
        targetHit = true;


    }



  };

};
public class Target {
  float xpos, ypos, heightt, widthh, speed;
  Target(float x, float y, float ylength, float xlength, float speedd) {
    ypos = y;
    xpos = x;
    heightt = ylength;
    widthh = xlength;
    speed = speedd;
  };

  public void move() {
    ypos = ypos+2;

  }

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
