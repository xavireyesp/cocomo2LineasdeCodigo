/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.plaf.basic.BasicScrollPaneUI;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import vista.v_principal;

/**
 *
 * @author Asus
 */
public class TestPricipal {
      
    
    v_principal vent;
    @Before
    public void setUp(){
    v_principal vent= new v_principal();
    
    
    }
    
   @Test
    public void calculo_normal(){
        double KLOC=1500;
    double productoria =0.25;
    double e=0;
        vent.Calcular();
       System.out.println(e);           
    }
   
    @Test
    public void calculo_normal_NumeroNegativo(){
        double KLOC=1500;
    double productoria =0.25;
    double e=0;
        vent.Calcular();
       System.out.println(e);           
    }
    
    
    @Test
    public void calculo_normal_SinDatos(){
     
    double e=0;
        vent.Calcular();
       System.out.println(e);           
    }
    
   
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
