/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package komandgord;

/**
 *
 * @author Коленька
 */
public class GarageDoorOpenCommand {
 GarageDoor garageDoor;
    
    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    
    public void execute() {
        garageDoor.up();
    }
    
    public void undo() {
        garageDoor.down();
    }
}
