/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lake;

import Lake.Song;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Liseth
 */
public class SongTest {

    private Song objS;

    public SongTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        objS = new Song();
    }

    @After
    public void tearDown() {
        objS = null;
    }

    /**
     * Test of Sing method, of class Song.
     */
    @Test
    public void testSing() {
        System.out.println("Test Sing");
        String sound = "brr";
        String expResult = "fiu, cric-cric, brrah";
        String result = objS.Sing(sound);
        assertEquals(expResult, result);

        sound = "birip";
        expResult = "trri-trri, croac";
        result = objS.Sing(sound);
        assertEquals(expResult, result);

        sound = "plop";
        expResult = "cric-cric, brrah";
        result = objS.Sing(sound);
        assertEquals(expResult, result);

        sound = "croac";
        expResult = "";
        result = objS.Sing(sound);
        assertEquals(expResult, result);

        sound = "brrah";
        expResult = "";
        result = objS.Sing(sound);
        assertEquals(expResult, result);
    }

    /**
     * Test of shouldExit method, of class Song.
     */
    @Test
    public void testshouldExit() {
        System.out.println("Test containPosition");
        String sound = "croac";
        assertTrue(objS.shouldExit(sound));
        sound = "brrah";
        assertTrue(objS.shouldExit(sound));
        sound = "birip";
        assertFalse(objS.shouldExit(sound));
        sound = "fiu";
        assertFalse(objS.shouldExit(sound));
    }

    /**
     * Test of containPosition method, of class Song.
     */
    @Test
    public void testcontainPosition() {
        System.out.println("Test containPosition");
        List<String> song = objS.getSongs().get(0);
        String sound = "brr";
        int expResult = 0;
        int result = objS.containPosition(song, sound);
        assertEquals(expResult, result);
    }

    /**
     * Test of remainingSounds method, of class Song.
     */
    @Test
    public void testRemainingSounds() {
        System.out.println("Test RemainingSounds");
        int i = 1;
        String expResult = "fiu, cric-cric, brrah";
        List<String> song = objS.song1();
        String result = objS.remainingSounds(song, i);
        assertEquals(expResult, result);

        i = 2;
        expResult = "trri-trri, croac";
        song = objS.song2();
        result = objS.remainingSounds(song, i);
        assertEquals(expResult, result);
    }

    /**
     * Test of notLastElement method, of class Song.
     */
    @Test
    public void testnotLastElement() {
        System.out.println("notLastElement");
        int pos = 1;
        int tam = 3;
        assertTrue(objS.notLastElement(pos, tam));

        pos = 3;
        tam = 3;
        assertFalse(objS.notLastElement(pos, tam));
    }

    /**
     * Test of song1 method, of class Song.
     */
    @Test
    public void testSong1() {
        System.out.println("Test song1");
        List<String> expResult = new ArrayList<>();
        expResult.add("brr");
        expResult.add("fiu");
        expResult.add("cric-cric");
        expResult.add("brrah");
        List<String> result = objS.song1();
        assertEquals(expResult, result);
    }

    /**
     * Test of song2 method, of class Song.
     */
    @Test
    public void testSong2() {
        System.out.println("Test song2");
        List<String> expResult = new ArrayList<>();
        expResult.add("pep");
        expResult.add("birip");
        expResult.add("trri-trri");
        expResult.add("croac");
        List<String> result = objS.song2();
        assertEquals(expResult, result);
    }

    /**
     * Test of song3 method, of class Song.
     */
    @Test
    public void testSong3() {
        System.out.println("Test song3");
        List<String> expResult = new ArrayList<>();
        expResult.add("bri-bri");
        expResult.add("plop");
        expResult.add("cric-cric");
        expResult.add("brrah");
        List<String> result = objS.song3();
        assertEquals(expResult, result);
    }

}
