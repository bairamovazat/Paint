package ru.ivmiit;

import models.CentralPanelMouseListener;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class PaintGUI extends JFrame{
    private JPanel mainPanel;
    private JPanel topPanel;
    private JPanel leftPanel;
    private JPanel centralPanel;

    public static void main(String[] args) {
        new PaintGUI();
    }

    public PaintGUI(){
        createInterface();
        this.add(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);
    }

    private JButton createFunctionalButton(String name, String text){
        JButton button = new JButton();
        button.setActionCommand(name + "was pressed!");
        button.setBackground(new Color(-1842206));
        button.setText(text);
        return button;
    }

    private JButton createActionButton(String name, String text){
        JButton button = new JButton();
        button.setActionCommand(name + "was pressed!");
        button.setMargin(new Insets(0, 0, 0, 0));
        button.setPreferredSize(new Dimension(30, 30));
        button.setBackground(new Color(-1842206));
        button.setText(text);
        return button;
    }
    private JButton createActionButton(String name, String text, Icon icon){
        JButton button = createActionButton(name,text);
        button.setIcon(icon);
        return button;
    }


    private void createInterface(){
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(5, 5));
        mainPanel.setEnabled(false);

        topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        topPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), null));
        mainPanel.add(topPanel, BorderLayout.NORTH);

        JButton funcButton1 = createFunctionalButton("func1","кнопка 1");
        topPanel.add(funcButton1);
        JButton funcButton2 = createFunctionalButton("func2","кнопка 3");
        topPanel.add(funcButton2);
        JButton funcButton3 = createFunctionalButton("func3","кнопка 3");
        topPanel.add(funcButton3);

        leftPanel = new JPanel();
        leftPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        leftPanel.setPreferredSize(new Dimension(80, 40));
        leftPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), null));
        mainPanel.add(leftPanel, BorderLayout.WEST);

        JButton actionButton1 = null;
        actionButton1 = createActionButton("actionButton1", "", new ImageIcon(getClass().getResource("/icons/001-circle-1.png")));

        leftPanel.add(actionButton1);
        JButton actionButton2 = createActionButton("actionButton2","");
        leftPanel.add(actionButton2);
        JButton actionButton3 = createActionButton("actionButton3","");
        leftPanel.add(actionButton3);

        centralPanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                paintComponentsOnCentralPanel(g);
            }
        };

        centralPanel.addMouseListener(new CentralPanelMouseListener());
        centralPanel.setLayout(new GridBagLayout());
        centralPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), null));
        mainPanel.add(centralPanel, BorderLayout.CENTER);

    }

    private void paintComponentsOnCentralPanel(Graphics g){

    }

    private void setCurrentShape(){

    }

}
