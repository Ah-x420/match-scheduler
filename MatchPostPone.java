/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchpostpone;

/**
 *
 * @author PC
 */
public class MatchPostPone {

    static HiomePage currentFrame;

    public static void showFrame(HiomePage frame) {
        if (currentFrame != null) currentFrame.dispose();
        currentFrame = frame;
        currentFrame.setVisible(true);
    }
    public static void main(String[] args) {
         showFrame(new HiomePage());
        new HiomePage();
    }
    
}
