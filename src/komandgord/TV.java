/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package komandgord;

/**
 *
 * @author Коленька
 */
public class TV {
    String name;
    
    public TV(String name) {
        this.name = name;
    }
    
    public void on() {
        System.out.println(name + " TV on");
    }
    
    public void off() {
        System.out.println(name + " TV off");
    }
}

