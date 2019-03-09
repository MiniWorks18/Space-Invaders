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
Target target;
ArrayList<Target> targets = new ArrayList<Target>();

Boolean liveBullet = false, gameOver = false, pauseGame = false;

float normWidth = 40, normHeight = 30, normSpeed = 1;

//Target move direction, false for left
boolean tDirect = true;

int targetbuffer = 40, tankWidth = 30, tankHeight = 40, lives = 3, score = 0;



public void setup() {

  
  background(0);
  frameRate(60);
  textSize(50);

  vanillaLayout();
};

public void draw() {
  background(0);
  fill(0xff0000FF);
  rect(mouseX-10, height-31, tankWidth, tankHeight, 2);
  text(lives, width-60, 60);
  text(score, 20, 60);
  println(targets.size() + " " + bullets.size());

  if (targets.size() < 2 && bullets.size() < 2) {
    fill(0xffFFFF00);
    vanillaLayout();
    normSpeed = 2;
  }

  //for loop moves each bullet in ArrayList "bullets"
    for (int i = 0; i < bullets.size(); i++) {
      bullet = bullets.get(i);
      bullet.move(bullet);
    }



  noCursor();

  for (int i = 0; i < targets.size(); i++) {
    target = targets.get(i);


      //Toggle target direction based on distance from the window edge
      if (target.xpos < targetbuffer) {
        tDirect = true;
      } else if (target.xpos > width-(targetbuffer+target.widthh)) {
        tDirect = false;
      };

      //Forward/backward movement
      if (tDirect) {
          targets.get(i).xpos += target.speed;
      } else {
          targets.get(i).xpos -= target.speed;
      };
      target.updateTarget(target);
  }

};

public void lifeLost() {
  lives--;
  pauseGame = true;
  bullets.clear();
  delay(1500);
  pauseGame = false;

  if (lives > 0) {


  }
};

public void mousePressed() {
  bullet = new Bullet(mouseX, height-60, 10, 20, 30, 0);
  bullets.add(bullet);

};
//defining targets. Usage Target(xpos, ypos, width, height, speed, columnID, inheritID, gunner, hitStatus)

public void vanillaLayout() {
targets.add(new Target(200, 100, normWidth, normHeight, normSpeed, 1, 1, false, false));
targets.add(new Target(300, 100, normWidth, normHeight, normSpeed, 2, 1, false, false));
targets.add(new Target(400, 100, normWidth, normHeight, normSpeed, 3, 1, false, false));
targets.add(new Target(500, 100, normWidth, normHeight, normSpeed, 4, 1, false, false));
targets.add(new Target(600, 100, normWidth, normHeight, normSpeed, 5, 1, false, false));
targets.add(new Target(700, 100, normWidth, normHeight, normSpeed, 6, 1, false, false));

targets.add(new Target(200, 150, normWidth, normHeight, normSpeed, 1, 2, false, false));
targets.add(new Target(300, 150, normWidth, normHeight, normSpeed, 2, 2, false, false));
targets.add(new Target(400, 150, normWidth, normHeight, normSpeed, 3, 2, false, false));
targets.add(new Target(500, 150, normWidth, normHeight, normSpeed, 4, 2, false, false));
targets.add(new Target(600, 150, normWidth, normHeight, normSpeed, 5, 2, false, false));
targets.add(new Target(700, 150, normWidth, normHeight, normSpeed, 6, 2, false, false));

targets.add(new Target(200, 200, normWidth, normHeight, normSpeed, 1, 3, false, false));
targets.add(new Target(300, 200, normWidth, normHeight, normSpeed, 2, 3, false, false));
targets.add(new Target(400, 200, normWidth, normHeight, normSpeed, 3, 3, false, false));
targets.add(new Target(500, 200, normWidth, normHeight, normSpeed, 4, 3, false, false));
targets.add(new Target(600, 200, normWidth, normHeight, normSpeed, 5, 3, false, false));
targets.add(new Target(700, 200, normWidth, normHeight, normSpeed, 6, 3, false, false));

targets.add(new Target(200, 250, normWidth, normHeight, normSpeed, 1, 4, false, false));
targets.add(new Target(300, 250, normWidth, normHeight, normSpeed, 2, 4, false, false));
targets.add(new Target(400, 250, normWidth, normHeight, normSpeed, 3, 4, false, false));
targets.add(new Target(500, 250, normWidth, normHeight, normSpeed, 4, 4, false, false));
targets.add(new Target(600, 250, normWidth, normHeight, normSpeed, 5, 4, false, false));
targets.add(new Target(700, 250, normWidth, normHeight, normSpeed, 6, 4, false, false));

targets.add(new Target(200, 300, normWidth, normHeight, normSpeed, 1, 5, false, false));
targets.add(new Target(300, 300, normWidth, normHeight, normSpeed, 2, 5, false, false));
targets.add(new Target(400, 300, normWidth, normHeight, normSpeed, 3, 5, false, false));
targets.add(new Target(500, 300, normWidth, normHeight, normSpeed, 4, 5, false, false));
targets.add(new Target(600, 300, normWidth, normHeight, normSpeed, 5, 5, false, false));
targets.add(new Target(700, 300, normWidth, normHeight, normSpeed, 6, 5, false, false));

targets.add(new Target(200, 350, normWidth, normHeight, normSpeed, 1, 6, true, false));
targets.add(new Target(300, 350, normWidth, normHeight, normSpeed, 2, 6, true, false));
targets.add(new Target(400, 350, normWidth, normHeight, normSpeed, 3, 6, true, false));
targets.add(new Target(500, 350, normWidth, normHeight, normSpeed, 4, 6, true, false));
targets.add(new Target(600, 350, normWidth, normHeight, normSpeed, 5, 6, true, false));
targets.add(new Target(700, 350, normWidth, normHeight, normSpeed, 6, 6, true, false));
};


public void otherLayout() {
  targets.add(new Target(200, 350, normWidth, normHeight, normSpeed, 1, 6, true, false));
  targets.add(new Target(300, 350, normWidth, normHeight, normSpeed, 2, 6, true, false));
  targets.add(new Target(400, 350, normWidth, normHeight, normSpeed, 3, 6, true, false));
  targets.add(new Target(500, 350, normWidth, normHeight, normSpeed, 4, 6, true, false));
  targets.add(new Target(600, 350, normWidth, normHeight, normSpeed, 5, 6, true, false));
  targets.add(new Target(700, 350, normWidth, normHeight, normSpeed, 6, 6, true, false));
}
public boolean doExplode = false;
public boolean targetHit = false;

private Bullet bullett;

public class Bullet {
  float xpos, ypos, bwidth, bheight, speed;
  int bulletType;
  boolean doExplode = false;
  Bullet(float x, float y, float bulletWidth, float bulletHeight, float speedd, int bullettype) {
    ypos = y;
    xpos = x;
    bwidth = bulletWidth;
    bheight = bulletHeight;
    speed = speedd;
    bulletType = bullettype;
  };

  public void move(Bullet bullet) {
    if (bullet.bulletType == 0) {
    if (ypos < 40) {
      doExplode = true;
    } else {
      ypos -= speed;
    }

    for (int i = 0; i < targets.size(); i++) {
      target = targets.get(i);
      if (ypos < (target.ypos+target.heightt) && xpos > (target.xpos-bwidth) && xpos < (target.xpos+target.widthh)) {
        target.removeTarget(i, target);
        doExplode = true;

      }
    }


    if (!doExplode) {
      rect(xpos, ypos, 10, 30);
    } else {
      xpos = 0;
      ypos = 0;
    }



  } else if (bullet.bulletType == 1) {
     if (ypos > height) {
       doExplode = true;
     } else {
      ypos += speed;
    }

    if (ypos > (height-tankHeight) && xpos > mouseX-20 && xpos < (mouseX+tankWidth-10)) {
      doExplode = true;
      lifeLost();
    }

    if (!doExplode) {
      rect(xpos, ypos, 10, 30);
    } else {
      xpos = 0;
      ypos = 0;
    }


  }
}

};


public class Target {
  float xpos, ypos, heightt, widthh, speed, chance;
  int inheritID, columnID, killedColumnID, killedInheritID, max = -2, activeDifficulty;
  boolean targetHit, willContinue = false, shooting;
  Target nextInLine;
  Bullet badBullet;


  Target(float x, float y, float xLength, float yLength, float speedd, int colInheritance, int inheritance, boolean gunner, boolean tHit) {
    ypos = y;
    xpos = x;
    widthh = xLength;
    heightt = yLength;
    speed = speedd;
    columnID = colInheritance;
    inheritID = inheritance;
    shooting = gunner;
    targetHit = tHit;
  };


  public void updateTarget(Target target) {
    rect(target.xpos, target.ypos, target.widthh, target.heightt);
    if (target.shooting) {
    activeDifficulty = targets.size()*8;
    chance = random(1, activeDifficulty);
    if (round(chance) == 5) {
      bullet = new Bullet((target.xpos+(target.widthh/2)), target.ypos+target.heightt, 10, 20, 4, 1);
      bullets.add(bullet);
    }
  }
  };


  public void removeTarget(int index, Target target) {
    killedColumnID = target.columnID;
    killedInheritID = target.inheritID;

    for (int i = 0; i < targets.size(); i++) {
      if (targets.get(i).columnID == killedColumnID) {
        if (targets.get(i).inheritID-1 > max){
          nextInLine = targets.get(i);
          max = targets.get(i).inheritID;
          willContinue = true;
        }
      } else if (!willContinue) {
        max = -2;
      }
    }
    if (willContinue) {
      nextInLine.shooting = true;
    }
    score = score+10;
    targets.remove(index);

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
