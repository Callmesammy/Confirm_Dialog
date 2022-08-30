/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package confirm_dialogue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class Messagebox extends JPanel {

    public Messagebox() {
        init();
    }
    
    public void init(){
        setOpaque(false);
        setBackground(new Color(245,245,245));
        setForeground(new Color(118,118,188));
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int x = 0;
        int y = 40;
        int width = getWidth();
        int height = getHeight();
        int iconspace = 7;
        int Totalicon = iconspace * 2;
        int iconsize = y* 2;
        int iconX = (width - (iconsize + Totalicon))/2;
        int iconY = 0;
        Area era = new Area(new Rectangle2D.Double(x, y, width, height-y));
        era.subtract(new Area(new Ellipse2D.Double(iconX, iconY-12, iconsize+Totalicon, iconsize  + Totalicon)));
        g2.setColor(getBackground());
        g2.fill(era);
        g2.dispose();
        
        super.paintComponent(g); 
    }
    
}
