/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.plaf.basic.BasicProgressBarUI;

/**
 *
 * @author nahim
 */
public class ProgresBar extends Thread {
    
    private Color color_pg;
    private int sleep;
    private JProgressBar progressbar;
    private boolean avanzar;

    public ProgresBar(Color color_pg, int sleep, JProgressBar progressbar) {
        this.color_pg = color_pg;
        this.sleep = sleep;
        this.progressbar = progressbar;
    }

    public ProgresBar() {
    }

    public Color getColor_pg() {
        return color_pg;
    }

    public void setColor_pg(Color color_pg) {
        this.color_pg = color_pg;
    }

    public int getSleep() {
        return sleep;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    public JProgressBar getProgressbar() {
        return progressbar;
    }

    public void setProgressbar(JProgressBar progressbar) {
        this.progressbar = progressbar;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }
    

    @Override
    public void run() {
        while (avanzar) {
            
            progressbar.setUI(new BasicProgressBarUI(){
            
                    protected Color Background(){
                        return color_pg;
                    
                    }
                    
                    protected Color Foreground(){
                    return color_pg;
                    
                    }
            
            
            });
            
            progressbar.setValue(progressbar.getValue()+50);
            if (progressbar.getValue()==10000000) {
                avanzar=false;
                
            }
            
            try {
                Thread.sleep(sleep);
            } catch (Exception e) {
               
            }
            
            
            
            
        }
    }
    
    
    
}
