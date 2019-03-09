

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


  void updateTarget(Target target) {
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


  void removeTarget(int index, Target target) {
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
