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

    Image clouds;
    int speed = 3;

    private void moveImages() {

        getBackgroundImagePosition().y -= speed;

        if (clouds != null) {
            if (getBackgroundImagePosition().y < (-1 * clouds.getHeight(this))) {
                getBackgroundImagePosition().y = 0;
            }
        }
    }

    public City() {
        setBackground(ResourceTools.loadImageFromResource("SuicideSim/clouds.jpg").getScaledInstance(1000, 750, Image.SCALE_SMOOTH));
        clouds = ResourceTools.loadImageFromResource("SuicideSim/clouds.jpg").getScaledInstance(1000, 750, Image.SCALE_SMOOTH);
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
        moveImages();
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
        if (clouds != null) {
            graphics.drawImage(clouds, 0, this.getBackgroundImagePosition().y + clouds.getHeight(this), this);
        }

        graphics.setColor(Color.gray);
        graphics.fillRect(0, 50, 50, 1000000);
        graphics.setColor(Color.CYAN);
        graphics.fillRect(0, 100, 100, 1000000);

    }
}
