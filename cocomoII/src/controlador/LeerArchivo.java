/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Eduardo Reyes
 * @author Raquel Lojano
 * @author Lorena Guadalima
 * @version 1.0.0
 * @since COCOMO1 1.0.0
 */
public class LeerArchivo {

    int numCodigo = 0, numComent = 0, numBlanco = 0, ext = 0, arch = 0;
    BufferedReader bufer;
    private static ArrayList<File> ArrayArchivos = new ArrayList<File>();

    public static boolean formato(File archivo) {
        boolean band = false;
        if (archivo.getName().endsWith("java") || archivo.getName().endsWith("c") || archivo.getName().endsWith("py")
                || archivo.getName().endsWith("php") || archivo.getName().endsWith("html") || archivo.getName().endsWith("vb")
                || archivo.getName().endsWith("cs") || archivo.getName().endsWith("js") || archivo.getName().endsWith("vb")) {       //formatos soportados
            band = true;

        }
        return band;
    }

    public void leer(File archivo) {

        File dir = new File(archivo.getAbsolutePath());
        File[] filesArray = dir.listFiles();

        for (File f : filesArray) {

            if (f.isFile()) {
                if (f.getName().endsWith("java") || archivo.getName().endsWith("c") || archivo.getName().endsWith("py")
                        || archivo.getName().endsWith("php") || archivo.getName().endsWith("html") || archivo.getName().endsWith("vb")
                        || archivo.getName().endsWith("cs") || archivo.getName().endsWith("js") || archivo.getName().endsWith("vb")) {
                    // if the files match our file extension add them to our arraylist
                    ArrayArchivos.add(f);
                    arch++;
                    System.out.println(" asasa" + arch);

                }
            } // making the recursive call on a directory
            else if (f.isDirectory()) {
                leer(f);
                System.out.println("Paso a siguiente carpeta");

            }
        }
        

    }

    public int contarLineas() {

        String linea;
        String varCom;
        //System.out.println(" as 2");
        for (File file : ArrayArchivos) {
           // System.out.println("nombre " + file.getName());
           
            if (file.getName().endsWith("java")||file.getName().endsWith("php")) {
                varCom="/*";
                
            }else if(file.getName().endsWith("java")||file.getName().endsWith("php")){}
           

            try {
                FileReader entrada = new FileReader(file);      //obtener los caracteres del archivo y guardarlo en una variable
                bufer = new BufferedReader(entrada);

                while ((linea = bufer.readLine()) != null) {
//                linea = linea.trim();           //elimina espacios a la izquierda y derecha de la linea
                    //   System.out.println(linea);
                    if (linea.length() == 0) {
                        numBlanco++;
                        //  System.out.println("es una linea blanca");
                    } else if (linea.length() >= 2 && linea.substring(0, 2).equals("/*")) {

                        numComent++;
                        //System.out.println("es un comentario");
                        //continue;       //continua con el siguiente ciclo, es decir, lee la siguiente linea
                        try {
                            while ((linea = bufer.readLine()) != null) {
                                linea = linea.trim();
                                //        System.out.println(linea);
                                
                                
                                if (linea.length() == 0) {
                                    numBlanco++;
                                    // System.out.println("es una linea blanca");
                                } else if (linea.length() >= 2 && linea.substring(0, 2).equals("*/")) {
                                    numComent++;
                                    //System.out.println("es un comentario");
                                    break;
                                } else {
                                    numComent++;
                                    //System.out.println("es un comentario");
                                }
                            }
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(null, "No se ha podido leer el archivo.\nError: " + ex);
                        }
                    } else if (linea.substring(0, 1).equals("/") || linea.substring(0, 1).equals("*")) {
                        numComent++;
                        //System.out.println("es un comentario");

                    } else {
                        numCodigo++;

                    }
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido leer el archivo.\nError: " + ex);
            }

        }// end reading all the files
        return numCodigo;
    }

    /**
     * Método GET de las Líneas de Código encontradas
     *
     * @return Un entero con el número de LDC
     * @since COCOMO1 1.0.0
     */
    public int getNumCodigo() {
        return numCodigo;
    }

    /**
     * Método GET de las Líneas de Comentarios encontradas
     *
     * @return Un entero con el número de comentarios
     * @since COCOMO1 1.0.0
     */
    public int getNumComent() {
        return numComent;
    }

    /**
     * Método GET de las Líneas en Blanco encontradas
     *
     * @return Un entero con el número de líneas en blanco
     * @since COCOMO1 1.0.0
     */
    public int getNumBlanco() {
        return numBlanco;
    }

    public int getArch() {
        return arch;
    }

}
