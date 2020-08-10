/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class LeerArchivo {

    int numCodigo = 0, numComent = 0, numBlanco = 0;
    BufferedReader bufer;

    public static int formato(File archivo) {
        int ext=0;
        if (archivo.getName().endsWith("java") || archivo.getName().endsWith("c") || archivo.getName().endsWith("py")
                || archivo.getName().endsWith("php") || archivo.getName().endsWith("html") || archivo.getName().endsWith("vb")
                ||archivo.getName().endsWith("cs")||archivo.getName().endsWith("js")|| archivo.getName().endsWith("vb")
        
                
                ) {       //formatos soportados

            if (archivo.getName().endsWith("java") || archivo.getName().endsWith("c")||archivo.getName().endsWith("js")) {
                ext = 1;
            } else if (archivo.getName().endsWith("py")) {
                ext = 2;
            } else if (archivo.getName().endsWith("cs")) {
                ext=3;
            }else if(archivo.getName().endsWith("html")){
                ext=4;
            }

        } else {

            JOptionPane.showMessageDialog(null, "Formato de Archivo No Soportado.\nSeleccione otro archivo");
        }
        return ext;
    }
    
    public void leer(File archivo) {
        try {
            FileReader entrada = new FileReader(archivo);      //obtener los caracteres del archivo y guardarlo en una variable
            bufer = new BufferedReader(entrada); //cargar en memoria el contenido del archivo                
                      
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido leer el archivo.\nError: " + e);
        }
    }
    
    public int contarLineas() {
     
    
    
    return numCodigo;
    }
    
    
    
    
}
