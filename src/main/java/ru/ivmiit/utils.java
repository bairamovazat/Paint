package ru.ivmiit;

import models.Interfaces.Figure;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class utils {
    public Icon getIconToURLOrNull(){
        try {
            return new ImageIcon(ImageIO.read(getClass().getResource("resources/water.bmp")));
        } catch (Exception ex) {
            return null;

        }
    }

    public static void clearAllComponents(JPanel panel){
        Component[] components = panel.getComponents();

        for (Component component : components) {
            panel.remove(component);
        }

        panel.revalidate();
        panel.repaint();
        panel.validate();
    }
    public static int min(int x, int y){
        if(x < y){
            return x;
        }else {
            return y;
        }
    }

    public static int max(int x, int y){
        if(x > y){
            return x;
        }else {
            return y;
        }
    }
}
