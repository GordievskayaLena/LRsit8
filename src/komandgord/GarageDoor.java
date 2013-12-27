/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package komandgord;

/**
 *
 * @author Коленька
 */
public class GarageDoor {
    String name;
    
    GarageDoor(String name) {
        this.name = name;
    }
    
    public void up() {
        System.out.println(name + " Door is up!");
    }
    
    public void down() {
        System.out.println(name + " Door is down!");
    }
    
    public void stop() {
        System.out.println(name + " Door is stopped!");
    }
    
    public void lightOn() {
        System.out.println(name + " Light is on!");
    }
    
    public void lightOff() {
        System.out.println(name + " Light is off!");
    }
}
