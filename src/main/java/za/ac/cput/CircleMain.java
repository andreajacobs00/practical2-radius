/** CircleMain.java
 *  This runs the main section
 *  Andrea Jacobs 218024266
 *  17 May 2023 */

package za.ac.cput;

import javax.swing.*;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle1 = new Circle();

        String radiusInput1 = JOptionPane.showInputDialog("Enter the radius for Circle 1:");
        double radius1 = Double.parseDouble(radiusInput1);

        circle1.setRadius(radius1);

        Circle circle2;

        String radiusInput2 = JOptionPane.showInputDialog("Enter the radius for Circle 2:");
        double radius2 = Double.parseDouble(radiusInput2);

        circle2 = new Circle(radius2);

        String output1 = "Circle 1:\n" +
                "Radius: " + circle1.getRadius() + "\n" +
                "Diameter: " + circle1.getDiameter() + "\n" +
                "Circumference: " + circle1.getCircumference() + "\n" +
                "Area: " + circle1.getArea();

        String output2 = "Circle 2:\n" +
                "Radius: " + circle2.getRadius() + "\n" +
                "Diameter: " + circle2.getDiameter() + "\n" +
                "Circumference: " + circle2.getCircumference() + "\n" +
                "Area: " + circle2.getArea();

        JOptionPane.showMessageDialog(null, output1 + "\n\n" + output2);
    }
}