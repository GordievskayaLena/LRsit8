/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package komandgord;
/**
 *
 * @author Коленька
 */
public class StereoOffCommand implements Command{
    Stereo stereo;
    
    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    
    public void execute() {
        stereo.off();
    }
    
    public void undo() {
        stereo.on();
    }
}

