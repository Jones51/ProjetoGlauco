/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocg;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Objects;

/**
 *
 * @author Jones
 */
public abstract class Base {
    
    protected int x = 0;
    protected int y = 0;
    protected int incrX = 1;
    protected int incrY = 1;
    protected Color cor = Color.BLACK;
    protected Color borda = Color.BLUE;
    protected int largura=30;
    protected int altura=30;
    protected int bloco = 0;
    protected int bola = 0;

    public int getBloco() {
        return bloco;
    }

    public void setBloco(int bloco) {
        this.bloco = bloco;
    }
    protected Rectangle rect = new Rectangle(0,0,30,30);
    
    
    public Base(){
    }

    public abstract void desenhar(Graphics g);
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        this.rect.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
        this.rect.y = y;
    }

    public int getIncrX() {
        return incrX;
    }

    public void setIncrX(int incrX) {
        this.incrX = incrX;
    }

    public int getIncrY() {
        return incrY;
    }

    public void setIncrY(int incrY) {
        this.incrY = incrY;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public Color getBorda() {
        return borda;
    }

    public void setBorda(Color borda) {
        this.borda = borda;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
        this.rect.width = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
        this.rect.height = altura;
    }

    public Rectangle getRect() {
        return rect;
    }

    public void setRect(Rectangle rect) {
        this.rect = rect;
    }
    
     public void mover() {
        x = x + incrX;
        y = y + incrY;
        this.rect.x= x;
        this.rect.y = y;
    }

    public Colisao trataColisao(int width, int height) {
        Colisao resp = Colisao.NONE;
        
        if (x < 0) {
            incrX = 1;
            resp = Colisao.LEFT;
        } else if (x > width - 30) {
            incrX = -1;
            resp = Colisao.RIGHT;
        }

        if (y < 28) {
            incrY = 1;
            resp = Colisao.UP;
        } else if (y > height - altura) {
            incrY = -1;
            resp = Colisao.DOWN;
        }
        
        return resp;
    }
    
    public boolean colisao(Base outraBase){
        if(this.equals(outraBase))
            return false;
        else            
            return rect.intersects(outraBase.rect);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Base other = (Base) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        if (this.incrX != other.incrX) {
            return false;
        }
        if (this.incrY != other.incrY) {
            return false;
        }
        if (this.largura != other.largura) {
            return false;
        }
        if (this.altura != other.altura) {
            return false;
        }
        if (!Objects.equals(this.cor, other.cor)) {
            return false;
        }
        if (!Objects.equals(this.borda, other.borda)) {
            return false;
        }
        if (!Objects.equals(this.rect, other.rect)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Base{" + "x=" + x + ", y=" + y + ", incrX=" + incrX + ", incrY=" + incrY + ", cor=" + cor + ", borda=" + borda + ", largura=" + largura + ", altura=" + altura + ", rect=" + rect + '}';
    }
}
