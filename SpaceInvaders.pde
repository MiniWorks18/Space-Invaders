
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

  size(900, 900);
  background(0);
  frameRate(60);
  textSize(50);

  vanillaLayout();
};

void draw() {
  background(0);
  fill(#0000FF);
  rect(mouseX-10, height-31, tankWidth, tankHeight, 2);
  text(lives, width-60, 60);
  text(score, 20, 60);
  println(targets.size() + " " + bullets.size());

  if (targets.size() < 2 && bullets.size() < 2) {
    fill(#FFFF00);
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

void lifeLost() {
  lives--;
  pauseGame = true;
  bullets.clear();
  delay(1500);
  pauseGame = false;

  if (lives > 0) {


  }
};

void mousePressed() {
  bullet = new Bullet(mouseX, height-60, 10, 20, 30, 0);
  bullets.add(bullet);

};
