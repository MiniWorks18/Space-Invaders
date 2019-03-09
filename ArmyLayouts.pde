//defining targets. Usage Target(xpos, ypos, width, height, speed, columnID, inheritID, gunner, hitStatus)

void vanillaLayout() {
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


void otherLayout() {
  targets.add(new Target(200, 350, normWidth, normHeight, normSpeed, 1, 6, true, false));
  targets.add(new Target(300, 350, normWidth, normHeight, normSpeed, 2, 6, true, false));
  targets.add(new Target(400, 350, normWidth, normHeight, normSpeed, 3, 6, true, false));
  targets.add(new Target(500, 350, normWidth, normHeight, normSpeed, 4, 6, true, false));
  targets.add(new Target(600, 350, normWidth, normHeight, normSpeed, 5, 6, true, false));
  targets.add(new Target(700, 350, normWidth, normHeight, normSpeed, 6, 6, true, false));
}
