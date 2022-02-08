/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ruben.test.robot;

import java.awt.*;


/**
 *
 * @author rsalazar
 */
public class Robot extends Canvas{
    
    public Robot(){
        setBackground(Color.gray);
    }
    
    //Pintar
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        //x,y tamaño width - height fill rellena
        g.fillRect(0, 0, 30, 30);
        
        g.setColor(Color.yellow);
        //draw dibuja el contorno
        g.drawRect(40, 40, 30, 30);
        
        g.setColor(Color.blue);
        g.drawString("Hola",200,200);
        
    }
    
    
    
}
