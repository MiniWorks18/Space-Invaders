public boolean doExplode = false;
public boolean targetHit = false;

public class Bullet {
  float xpos, ypos, speed;
  boolean doExplode = false;
  Bullet(int x, int y, int speedd) {
    ypos = y;
    xpos = x;
    speed = speedd;
  };

  void move() {

    if (ypos < 40) {
      doExplode = true;
    } else {
      ypos -= speed;
    }

    if (!doExplode) {
      rect(xpos, ypos, 10, 30);
    }
    
    if (ypos < 140 && xpos > ((width/2)-10) && xpos < ((width/2)+40)) {
        targetHit = true;
        liveBullet = false;
    
    
    }



  };

};
