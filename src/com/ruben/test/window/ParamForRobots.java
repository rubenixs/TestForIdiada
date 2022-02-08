/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ruben.test.window;

import com.ruben.test.meseta.Meseta;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author rsalazar
 */
public class ParamForRobots extends JFrame implements ActionListener{
    
    public static ParamForRobots paramRobots;
    private JButton botonEnviar;
    private JTextArea instrucciones;
    private JLabel etiqueta;
    public String instruccionesLeidas[];
    
    public ParamForRobots(){
        
        botonEnviar = new JButton("Send");
        botonEnviar.addActionListener(this);
        instrucciones = new JTextArea();
        instrucciones.setLineWrap(true);
        etiqueta = new JLabel("Insert input for Robots: ");
        this.setLayout(new FlowLayout());
        this.setSize(500,200);
        this.add(etiqueta);
        this.add(instrucciones);
        this.add(botonEnviar);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
    
    }
    
    public static void main(String[] args) {
        paramRobots = new ParamForRobots();
 
    }
    
    //Recogemos las instruccioens insertadas
    @Override
    public void actionPerformed(ActionEvent e){
        String text = instrucciones.getText();
        instruccionesLeidas = text.split("\\r?\\n");
        Meseta meseta = new Meseta();
        meseta.dibuja(instruccionesLeidas);
    }
    
}
