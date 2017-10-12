package models;

import models.Interfaces.BasicOperationsWithFigures;
import models.Interfaces.Figure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.LinkedList;
import java.util.List;

public class CentralPanelListener implements MouseListener, MouseMotionListener {
    private Figure currentFigure;
    private FiguresEnum figureType;
    private Color color;
    private Color backgroundColor;
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    private JFrame rootFrame;
    private List<Figure> figuresArray = new LinkedList<Figure>();
    private FactoryOfFigures factoryOfFigures = new FactoryOfFigures();

    public CentralPanelListener(){
    }

    public CentralPanelListener(JFrame rootFrame){
        this.rootFrame = rootFrame;
    }

    public void repaint(){
        this.rootFrame.repaint();
    }

    public void setCurrentFigure(Figure currentFigure) {
        this.currentFigure = currentFigure;
    }

    public void setFigureType(FiguresEnum figure){
        figureType = figure;
    }

    public void copyValuesToFigure(Figure figure){
        if(color != null){
            figure.setColor(color);
        }
        if(backgroundColor != null){
            figure.setBackgroundColor(backgroundColor);
        }

    }



    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override //нажал
    public void mousePressed(MouseEvent e) {
        if(figureType == null){return;}
        currentFigure = factoryOfFigures.getFigure(figureType);
        currentFigure.setSize(e.getX(),e.getY(),e.getX(),e.getY());
        copyValuesToFigure(currentFigure);
    }

    @Override // отпустил
    public void mouseReleased(MouseEvent e) {
        if(currentFigure == null){return;}
        figuresArray.add(currentFigure);
        currentFigure = null;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override //перетаскивание
    public void mouseDragged(MouseEvent e) {
        if(currentFigure == null){return;}
        currentFigure.setSecondPoint(e.getX(),e.getY());
        this.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }


    public void setColor(Color color) {
        this.color = color;
    }


    public void setBackgroundColor(Color color) {

    }


    public void setStroke(Stroke stroke) {

    }

    public void paintComponents(Graphics g) {
        if(currentFigure != null){
            currentFigure.paintComponents(g);
            setDefaultGrapgics(g);
        }
        for(Figure figure : figuresArray){
            figure.paintComponents(g);
            setDefaultGrapgics(g);
        }
    }

    public void setDefaultGrapgics(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setBackground(Color.WHITE);
        g2.setPaint(Color.WHITE);
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(1));
    }
    public void removeAll(){
        this.figuresArray.clear();
        repaint();
    }

}
