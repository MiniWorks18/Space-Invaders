public class Target {
  float xpos, ypos, heightt, widthh, speed;
  Target(float x, float y, float ylength, float xlength, float speedd) {
    ypos = y;
    xpos = x;
    heightt = ylength;
    widthh = xlength;
    speed = speedd;
  };

  void move() {
    ypos = ypos+2;

  }

};
