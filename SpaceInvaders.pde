
Bullet bullet1;
Boolean liveBullet = false;

public void setup() {

  size(900, 900);
  background(0);
  frameRate(60);

};

void draw() {
  background(0);
  fill(#0000FF);
  rect(mouseX-10, height-31, 30, 40, 2);
  if (liveBullet) {
    bullet1.move(); 
  }
  
  noCursor();
  
  if (!targetHit) {
    rect(width/2, 100, 40, 50);
  }
  
  
};

void mouseClicked() {
  bullet1 = new Bullet(mouseX, height-60, 30);
  liveBullet = true;

};

// public class Bullet {
//   float xpos, ypos, speed;
//   boolean doExplode = false;
//   Bullet(int x, int y, int speedd) {
//     ypos = y;
//     xpos = x;
//     speed = speedd;
//   };
//
//   void move() {
//
//     if (ypos < 40) {
//       doExplote = true;
//     } else {
//       ypos -= speed;
//     }
//
//     if (!doExplode) {
//       rect(xpos, ypos, 10, 30);
//     }
//
//
//
//   };
