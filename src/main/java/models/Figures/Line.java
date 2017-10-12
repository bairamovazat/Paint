package models.Figures;

import models.Interfaces.Figure;

import java.awt.*;

public class Line implements Figure {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color color;
    private Stroke stroke;
    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setSize(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void setFirstPoint(int x, int y) {
        this.x1 = x;
        this.y1 = y;
    }

    @Override
    public void setSecondPoint(int x, int y) {
        this.x2 = x;
        this.y2 = y;
    }

    @Override
    public void setBackgroundColor(Color color) {

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
        g2.drawLine(x1,y1,x2,y2);
    }
}
