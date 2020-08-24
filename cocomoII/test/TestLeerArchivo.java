/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controlador.LeerArchivo;
import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;

/**
 *
 * @author Asus
 */
public class TestLeerArchivo {

    @Test
    public void test_scan() throws Exception {
        LeerArchivo leer = new LeerArchivo(); // with args
        int a =  leer.contarLineas(); 
        
        
        

// If you arrive here, it"s OK
    }

}
