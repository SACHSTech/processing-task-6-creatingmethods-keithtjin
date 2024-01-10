import processing.core.PApplet;

public class Sketch extends PApplet {

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // put your size call here
    size(400, 400);
  }

  /**
   * Called once at the beginning of execution. Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
    drawHouse(50, 50, 50); // Level 2: Draw a house at (50, 50) with a size of 50
    drawStickFigure(200, 200, 30); // Level 2: Draw a stick figure at (200, 200) with a size of 30
    int centerX = getWidthCenter(100); // Level 4: Get x-coordinate for centering an object
    int centerY = getHeightCenter(150); // Level 4: Get y-coordinate for centering an object
    drawColoredHouse(centerX, centerY, 80, color(255, 0, 0)); // Level 3: Draw a red house at the center
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // sample code, delete this stuff
    stroke(128);
    line(150, 25, 270, 350);

    stroke(255);
    line(50, 125, 70, 50);
  }

  // Level 2: Method to draw a house at specified location and size
  private void drawHouse(float x, float y, float size) {
    fill(150, 75, 0); // Brown color for house
    rect(x, y, size, size); // Body of the house
    triangle(x, y, x + size / 2, y - size / 2, x + size, y); // Roof of the house
  }

  // Level 2: Method to draw a stick figure at specified location and size
  private void drawStickFigure(float x, float y, float size) {
    fill(0); // Black color for stick figure
    ellipse(x, y - size, size, size); // Head
    line(x, y, x, y - size); // Body
    line(x, y, x - size / 2, y + size / 2); // Left leg
    line(x, y, x + size / 2, y + size / 2); // Right leg
  }

  // Level 3: Method to draw a colored house with additional parameters
  private void drawColoredHouse(float x, float y, float size, int houseColor) {
    fill(houseColor);
    rect(x, y, size, size);
    triangle(x, y, x + size / 2, y - size / 2, x + size, y);
  }

  // Level 4: Method to get x-coordinate for centering an object
  private int getWidthCenter(float objectWidth) {
    return (int) ((width - objectWidth) / 2);
  }

  // Level 4: Method to get y-coordinate for centering an object
  private int getHeightCenter(float objectHeight) {
    return (int) ((height - objectHeight) / 2);
  }
}
