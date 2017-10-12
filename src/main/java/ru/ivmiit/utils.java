package ru.ivmiit;

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
}
