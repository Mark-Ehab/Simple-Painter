
package painter;

import java.awt.Color;
import java.awt.Graphics;


public class Shape {

    private int x1, x2, y1, y2;
    private Color color;
    private boolean filled = false;

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public void draw(Graphics g) {
    }

    public void fill(Graphics g){
    }
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color c) {
        this.color = c;
    }
    
    public int getX1() {
        return x1;
    }

    public Shape get() {
        return new Shape();
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
}
