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

  void move() {

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
