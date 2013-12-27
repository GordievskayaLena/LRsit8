/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package komandgord;

/**
 *
 * @author Коленька
 */
public class TVOffCommand implements Command {
    TV tv;
    
    public TVOffCommand(TV tv) {
        this.tv = tv;
    }
    
    public void execute() {
        tv.off();
    }
    
    public void undo() {
        tv.on();
    }
}

