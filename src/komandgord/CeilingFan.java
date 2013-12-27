/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package komandgord;

/**
 *
 * @author Коленька
 */
public class CeilingFan {
 String name;
    int speed;
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    
    CeilingFan(String name) {
        this.name = name;
    }
    
    public void high() {
        System.out.println(name + " CeilingFan is HIGH");
        speed = HIGH;
    }
    
    public void medium() {
        System.out.println(name + " CeilingFan is MEDIUM");
        speed = MEDIUM;
    }
    
    public void low() {
        System.out.println(name + " CeilingFan is LOW");
        speed = LOW;
    }
    
    
    public void on() {
        System.out.println(name + " CeilingFan on");
    }

    public void off() {
        System.out.println(name + " CeilingFan is OFF");
        speed = OFF;
    }
    
    public int getSpeed() {
        return speed;
    }
}
