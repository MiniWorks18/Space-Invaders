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

  void move(Bullet bullet) {
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
