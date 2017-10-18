package models.Figures;

import models.Interfaces.Figure;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rhombus implements Figure {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color color;
    private Stroke stroke;
    private Color backgroundColor;
    Rectangle2D rect = new Rectangle2D.Double(0, 0, 0, 0);


    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setSize(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    public void setFirstPoint(int x, int y) {
        this.x1 = x;
        this.y1 = y;
        setSize(x1,y1,x2,y2);

    }

    @Override
    public void setSecondPoint(int x, int y) {
        this.x2 = x;
        this.y2 = y;
        setSize(x1,y1,x2,y2);

    }

    @Override
    public void setBackgroundColor(Color color) {
        this.backgroundColor = color;
    }

    @Override
    public void setStroke(Stroke stroke) {
        this.stroke = stroke;
    }

    @Override
    public void paintComponents(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        if(color != null)g2.setColor(color);

        if(stroke != null)g2.setStroke(stroke);

        if(backgroundColor != null)g2.setBackground(backgroundColor);

        paintHeart(g);

    }

    private void paintHeart(Graphics g){
        int lx1 = Math.min(x1,x2);
        int ly1 = Math.min(y1,y2);
        int width = Math.abs(x1-x2);
        int height = Math.abs(y1-y2);
        //i4 - поворот i5 - радиус заполнения;
        //g.drawArc(lx1,ly1,width/2,height/2,0,180);
        //g.drawArc(Math.abs(width) / 2 + lx1,ly1,width/2,height/2,0,180);
        int x[] = {lx1 + width/2, lx1, lx1 + width/2,lx1 + width};
        int y[] = {ly1, ly1 + height/2, ly1 + height, ly1 + height/2};
        if(backgroundColor != null){g.fillPolygon(x,y,x.length);return;}
        g.drawPolygon(x,y,x.length);

    }
}


