/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package komandgord;

/**
 *
 * @author Коленька
 */
public class Stereo {
    String name;
    
    public Stereo(String name) {
        this.name = name;
    }
    
    public void on() {
        System.out.println(name + " Stereo on!");        
    }
    
    public void off() {
        System.out.println(name + " Stereo off!");
    }
    
    public void setCd() {
        System.out.println(name + " Stereo setCd!");
    }
    
    public void setDvd() {
        System.out.println(name + " Stereo setDvd!");
    }
    
    public void setRadio() {
        System.out.println(name + " Stereo setRadio!");
    }
    
    public void setVolume(int volume) {
        System.out.println(name + " Stereo setVolume is set to " + volume);
    }
}

