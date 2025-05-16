/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.fergn06.eq2g_java_testing.Ecu2grado;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author fernandoguenue
 */
public class EQ2GJUnitTest {
    
    public EQ2GJUnitTest() {
    }

//    @org.junit.jupiter.api.BeforeAll
//    public static void setUpClass() throws Exception {
//    }
//
//    @org.junit.jupiter.api.AfterAll
//    public static void tearDownClass() throws Exception {
//    }
//
//    @org.junit.jupiter.api.BeforeEach
//    public void setUp() throws Exception {
//    }
//
//    @org.junit.jupiter.api.AfterEach
//    public void tearDown() throws Exception {
//    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testSuma(){
        int a = 5;
        int b = 6;
        int result = Ecu2grado.suma (a, b);
        assertEquals(11,result, "La funcion suma no funciona correctamente");
    }
    @Test
    public void testMostrarSoluciones0() {
        double[] raices = new double[2];
        int numSols = Ecu2grado.resolverEcu(1, 2, 5, raices);
        assertEquals(0, numSols, "Debe haber 0 soluciones");
    }

    @Test
    public void testMostrarSoluciones1() {
        double[] raices = new double[2];
        int numSols = Ecu2grado.resolverEcu(1, -2, 1, raices);
        assertEquals(1, numSols, "Debe haber 1 solución");
        assertEquals(1.0, raices[0], "La raíz debe ser 1.0");
    }

    @Test
    public void testMostrarSoluciones2() {
        double[] raices = new double[2];
        int numSols = Ecu2grado.resolverEcu(1, -3, 2, raices);
        assertEquals(2, numSols, "Debe haber 2 soluciones");
        assertEquals(2.0, raices[0], "Raíz 1 incorrecta");
        assertEquals(1.0, raices[1], "Raíz 2 incorrecta");
    }
}
