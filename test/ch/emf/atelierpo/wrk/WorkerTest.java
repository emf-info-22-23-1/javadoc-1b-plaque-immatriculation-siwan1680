package ch.emf.atelierpo.wrk;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mario Ramalho(EMF - Fribourg)
 */
public class WorkerTest {

    public WorkerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of controlePlaqueImmatriculation method, of class Worker.
     */
    @Test
    public void testControlePlaqueImmatriculation() {
        System.out.println("testControlePlaqueImmatriculation");

        Worker instance = new Worker();

        boolean result;

        // TEST     canton      numeroDePlaque
        // ===================================
        // 1        null        null
        // 2        null        ""
        // 3        null        "FAUX"
        // 4        null        "999999"
        // ===================================
        // 5        ""          null
        // 6        ""          ""
        // 7        ""          "FAUX"
        // 8        ""          "999999"
        // ===================================
        // 9        "FAUX"      null
        // 10       "FAUX"      ""
        // 11       "FAUX"      "FAUX"
        // 12       "FAUX"      "999999"
        // ===================================
        // 13       "FR"        null
        // 14       "FR"        ""
        // 15       "FR"        "FAUX"
        // 16       "FR"        "999999"
        // ===================================
        // 17       "VD"        "1"
        // 18       "BS"        "45666"
        // 19       "ZH"        "9999992"
        // 20       "LU"        "-333"
        // 21       "G"         "89"
        // ===================================
        // ===================================
        // 1        null        null
        System.out.println("TEST 1        null        null");
        result = instance.controlePlaqueImmatriculation(null, null);
        assertEquals(false, result);
        System.out.println("TEST 1 > OK");
        // 2        null        ""
        System.out.println("TEST 2        null        \"\"");
        result = instance.controlePlaqueImmatriculation(null, "");
        assertEquals(false, result);
        System.out.println("TEST 2 > OK");
        // 3        null        "FAUX"
        System.out.println("TEST 3        null        \"FAUX\"");
        result = instance.controlePlaqueImmatriculation(null, "FAUX");
        assertEquals(false, result);
        System.out.println("TEST 3 > OK");
        // 4        null        "999999"
        System.out.println("TEST 4        null        \"999999\"");
        result = instance.controlePlaqueImmatriculation(null, "999999");
        assertEquals(false, result);
        System.out.println("TEST 4 > OK");
        // ===================================
        // 5        ""          null
        System.out.println("TEST 5        \"\"          null");
        result = instance.controlePlaqueImmatriculation("", null);
        assertEquals(false, result);
        System.out.println("TEST 5 > OK");
        // 6        ""          ""
        System.out.println("TEST 6        \"\"          \"\"");
        result = instance.controlePlaqueImmatriculation("", "");
        assertEquals(false, result);
        System.out.println("TEST 6 > OK");
        // 7        ""          "FAUX"
        System.out.println("TEST 7        \"\"          \"FAUX\"");
        result = instance.controlePlaqueImmatriculation("", "FAUX");
        assertEquals(false, result);
        System.out.println("TEST 7 > OK");
        // 8        ""          "999999"
        System.out.println("TEST 8        \"\"          \"999999\"");
        result = instance.controlePlaqueImmatriculation("", "999999");
        assertEquals(false, result);
        System.out.println("TEST 8 > OK");
        // ===================================
        // 9        "FAUX"      null
        System.out.println("TEST 9        \"FAUX\"      null");
        result = instance.controlePlaqueImmatriculation("FAUX", null);
        assertEquals(false, result);
        System.out.println("TEST 9 > OK");
        // 10       "FAUX"      ""
        System.out.println("TEST 10       \"FAUX\"      \"\"");
        result = instance.controlePlaqueImmatriculation("FAUX", "");
        assertEquals(false, result);
        System.out.println("TEST 10 > OK");
        // 11       "FAUX"      "FAUX"
        System.out.println("TEST 11       \"FAUX\"      \"FAUX\"");
        result = instance.controlePlaqueImmatriculation("FAUX", "FAUX");
        assertEquals(false, result);
        System.out.println("TEST 11 > OK");
        // 12       "FAUX"      "999999"
        System.out.println("TEST 12       \"FAUX\"      \"999999\"");
        result = instance.controlePlaqueImmatriculation("FAUX", "999999");
        assertEquals(false, result);
        System.out.println("TEST 12 > OK");
        // ===================================
        // 13       "FR"        null
        System.out.println("TEST 13       \"FR\"        null");
        result = instance.controlePlaqueImmatriculation("FR", null);
        assertEquals(false, result);
        System.out.println("TEST 13 > OK");
        // 14       "FR"        ""
        System.out.println("TEST 14       \"FR\"        \"\"");
        result = instance.controlePlaqueImmatriculation("FR", "");
        assertEquals(false, result);
        System.out.println("TEST 14 > OK");
        // 15       "FR"        "FAUX"
        System.out.println("TEST 15       \"FR\"        \"FAUX\"");
        result = instance.controlePlaqueImmatriculation("FR", "FAUX");
        assertEquals(false, result);
        System.out.println("TEST 15 > OK");
        // 16       "FR"        "999999"
        System.out.println("TEST 16       \"FR\"        \"999999\"");
        result = instance.controlePlaqueImmatriculation("FR", "999999");
        assertEquals(true, result);
        System.out.println("TEST 16 > OK");
        // ===================================
        // 17       "VD"        "1"
        System.out.println("TEST 17       \"VD\"        \"1\"");
        result = instance.controlePlaqueImmatriculation("VD", "1");
        assertEquals(true, result);
        System.out.println("TEST 17 > OK");
        // 18       "BS"        "45666"
        System.out.println("TEST 18       \"BS\"        \"45666\"");
        result = instance.controlePlaqueImmatriculation("BS", "45666");
        assertEquals(true, result);
        System.out.println("TEST 18 > OK");
        // 19       "ZH"        "9999992"
        System.out.println("TEST 19       \"ZH\"        \"9999992\"");
        result = instance.controlePlaqueImmatriculation("ZH", "9999992");
        assertEquals(false, result);
        System.out.println("TEST 19 > OK");
        // 20       "LU"        "-333"
        System.out.println("TEST 20       \"LU\"        \"-333\"");
        result = instance.controlePlaqueImmatriculation("LU", "-333");
        assertEquals(false, result);
        System.out.println("TEST 20 > OK");
        // 21       "G"         "89"
        System.out.println("TEST 21       \"G\"         \"89\"");
        result = instance.controlePlaqueImmatriculation("G", "89");
        assertEquals(false, result);
        System.out.println("TEST 21 > OK");
        // ===================================
        System.out.println("testControlePlaqueImmatriculation > OK");
    }

}
