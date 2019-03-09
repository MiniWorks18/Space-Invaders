
Bullet bullet;
ArrayList<Bullet> bullets = new ArrayList<Bullet>();
Boolean liveBullet = false;

float targetx = width/2, targety = 100, targetheight = 30, targetwidth = 40, speed = 1;
//Target move direction, false for left
Boolean tdirect = false;
int targetbuffer = 40;



public void setup() {

  size(900, 900);
  background(0);
  frameRate(60);

  //Target target1 = new Target(width/2, 100, 40, 50, 1);

};

void draw() {
  background(0);
  fill(#0000FF);
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



void mousePressed() {
  bullet = new Bullet(mouseX, height-60, 10, 20, 30);
  bullets.add(bullet);

};
