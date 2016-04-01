/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suicidesim;

import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author NathanielWard
 */
class City extends Environment {

    
    
    public City() {
    
    this.setBackground(ResourceTools.loadImageFromResource("SuicideSim/building.png").getScaledInstance(1000, 750, Image.SCALE_SMOOTH));
    
    
    }

    
    
    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
   graphics.setColor(Color.gray);
        graphics.fillRect(0, 50, 50, 1000000);
    
    }
    
}
