/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Admin
 */
import common.Algorithms;
import common.Library;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.View;

/**
 *
 * @author ACER
 */
public class NomalizeText extends View<String> {

    protected Library library;
    protected Algorithms algorithm;

    public NomalizeText() {
        super("NORMALIZE TEXT");
        library = new Library();
        algorithm = new Algorithms();
    }

    @Override
    public void execute(String s) {
        String result = "";
        try {
            result = algorithm.readFromFile(s);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NomalizeText.class.getName()).log(Level.SEVERE, null, ex);
        }
        result = algorithm.normalizeProcess(result);
        result += ".";
        try {
            algorithm.writeToFile("output.txt", result);
        } catch (IOException ex) {
            Logger.getLogger(NomalizeText.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
}
