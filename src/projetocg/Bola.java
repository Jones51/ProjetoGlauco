/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocg;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Jones
 */
public class Bola extends Base{
    
    public Bola(){
    this.bola = 1;
    }
    
    @Override
    public void desenhar(Graphics g) {
        g.setColor(cor);
        g.fillOval(x,y,largura,altura);
        g.setColor(Color.BLACK);
        g.drawOval(x,y,largura,altura);
    }
}
