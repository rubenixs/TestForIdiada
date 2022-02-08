/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ruben.test.meseta;

import com.ruben.test.window.ParamForRobots;
import javax.swing.JFrame;

/**
 *
 * @author rsalazar
 */
public class Meseta extends JFrame{
    
    public Meseta(){
        ParamForRobots.paramRobots.dispose();
        setSize(700,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void dibuja(String[] instruccionesLeidas){
        System.out.println(instruccionesLeidas[0]);
        
    }
    
    
}
