/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocg;

import java.awt.Graphics;

/**
 *
 * @author Jones
 */
public class Bloco extends Base{
    
   public Bloco(){
       this.bloco = 1;
    }
    
    @Override
    public void desenhar(Graphics g) {
        g.setColor(cor);
        g.fillRect(x, y, largura, altura);
        g.setColor(borda);
        g.drawRect(x, y, largura, altura);
    }
    
}
