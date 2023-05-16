/** Circle.java
 *  This program calculates the diameter of a circle
 *  Andrea Jacobs 218024266
 *  17 May 2023 */

package za.ac.cput;

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
