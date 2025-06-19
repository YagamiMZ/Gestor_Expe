/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pantallas;

import javax.swing.JFrame;
import TDAs.*;


public class ScreenManager {
    
    private static final Pila<JFrame> stack = new Pila<>();
    
    public static void openNewScreen(JFrame currentScreen, JFrame newScreen) {
        currentScreen.setVisible(false);
        stack.push(currentScreen);
        newScreen.setVisible(true);
    }
    
    public static void goBack(JFrame currentScreen) {
        currentScreen.dispose();
        stack.pop().setVisible(true);
    }
    
    
}
