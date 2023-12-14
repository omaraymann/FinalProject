/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject.pkg01.newpackage;
import finalproject.pkg01.*;
/**
 *
 * @author 20127
 */
public class NewClass {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        System.out.println(((Plate)factory.getShape("Plate")).getColor());
    }
}
