/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import modelo.m_Cocomo;
import modelo.m_KLOC;

/**
 *
 * @author Eduardo Reyes
 */
public class GenerarPDF {
   
    public static m_KLOC objM_KLOC = new m_KLOC();
    public static m_Cocomo objM_Cocomo = new m_Cocomo();
    
    
public void generar(String nombre) throws FileNotFoundException, DocumentException {
            
            FileOutputStream archivo = new FileOutputStream(nombre + ".pdf");
            Document documento = new Document();
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            
            Paragraph parrafo = new Paragraph("UNIVERSIDAD NACIONAL DE LOJA\n" +
"FACULTAD DE ENERGÍA, LAS INDUSTRIAS Y  LOS  RECURSOS NATURALES NO RENOVABLES\n" +
"CARRERA DE INGENIERÍA EN SISTEMAS - COMPUTACIÓN\n\n");
            parrafo.setAlignment(1);
            documento.add(parrafo);
            
            documento.add(new Paragraph("Integrantes : Eduardo Reyes, Raquel Lojano, Lorena Guadalima" ));
            documento.add(new Paragraph(" " ));
            documento.add(new Paragraph("Docente: José Guaman"));
                        documento.add(new Paragraph(" " ));

            documento.add(new Paragraph("Informe de Esmimacion" ));
                        documento.add(new Paragraph(" " ));

            documento.add(new Paragraph("Lineas de codigo: "+objM_KLOC.getLDC()));
            documento.add(new Paragraph("KLOC " +objM_KLOC.getKLOC()));
            documento.add(new Paragraph("Sumatoria Factor Escala: "+ objM_Cocomo.getSumFEscala()));
            documento.add(new Paragraph("B(Factor Econofia escala): "+objM_Cocomo.getB()));
            documento.add(new Paragraph("Esfuerzo " +objM_Cocomo.getE()));
            documento.add(new Paragraph("Tiempo desarrollo " +objM_Cocomo.getTdes()+" meses"));
            
            
            
            documento.close();
            JOptionPane.showMessageDialog(null, "Archivo PDF creado correctamente");
    

}    
    
    
    
    
}
