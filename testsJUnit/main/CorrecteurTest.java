package main;

import static org.junit.Assert.*;
import main.Main;

import org.junit.Test;
 
public class CorrecteurTest{
	//Tests Fonction "recherche" :
	@Test
	public void test1() {
		String[] t = {"abc","def","ghi","jkl","mno"};
		int resultatRecherche=Main.rechercheDichoStr("ghi", t);
		assertEquals(2, resultatRecherche);
	}
	
	@Test
	public void test2() {
		String[] t = {"abc","def","ghi","jkl","mno"};
		int resultatRecherche=Main.rechercheDichoStr("mno", t);
		assertEquals(4, resultatRecherche);
	}
	@Test
	public void test3() {
		String[] t = {"abc"};
		int resultatRecherche=Main.rechercheDichoStr("abc", t);
		assertEquals(0, resultatRecherche);
	}
	@Test
	public void test4() {
		String[] t = {};
		int resultatRecherche=Main.rechercheDichoStr("abc", t);
		assertEquals(-1, resultatRecherche);
	}
	@Test
	public void test5() {
		String[] t = {"abc","def","ghi","ghi","jkl","mno"};
		int resultatRecherche=Main.rechercheDichoStr("ghi", t);
		assertEquals(2, resultatRecherche);
	}
	
	
	//Tests Fonction "rechercheDichoStr" :
	@Test
	public void test6() {
		String[] t = {"abc","def","ghi","jkl","mno"};
		int resultatRecherche=Main.rechercheDichoStr("ghi", t);
		assertEquals(2, resultatRecherche);
	}
	
	@Test
	public void test7() {
		String[] t = {"abc","def","ghi","jkl","mno"};
		int resultatRecherche=Main.rechercheDichoStr("abc", t);
		assertEquals(0, resultatRecherche);
	}
	@Test
	public void test8() {
		String[] t = {"abc"};
		int resultatRecherche=Main.rechercheDichoStr("abc", t);
		assertEquals(0, resultatRecherche);
	}
	@Test
	public void test9() {
		String[] t = {};
		int resultatRecherche=Main.rechercheDichoStr("abc", t);
		assertEquals(-1, resultatRecherche);
	}
	@Test
	public void test10() {
		String[] t = {"abc","def","ghi","ghi","jkl","mno"};
		int resultatRecherche=Main.rechercheDichoStr("ghi", t);
		assertEquals(2, resultatRecherche);
	}
	
	
	//Tests Fonction "triParInsertion" :
	
	@Test
    public void test11() {
        String[] tab = {"ghi","jkl","abc","def","mno","ghi"};
        String[] resultatAttendu = {"abc","def","ghi","ghi","jkl","mno"};
        String[] resultatTriParInsertion = Main.triParInsertion(tab);
        assertArrayEquals(resultatAttendu, resultatTriParInsertion);
	}
	@Test
    public void test12() {
        String[] tab = {"abc","def","ghi","ghi","jkl","mno"};
        String[] resultatAttendu = {"abc","def","ghi","ghi","jkl","mno"};
        String[] resultatTriParInsertion = Main.triParInsertion(tab);
        assertArrayEquals(resultatAttendu, resultatTriParInsertion);
	}
	@Test
    public void test13() {
        String[] tab = {};
        String[] resultatAttendu = {};
        String[] resultatTriParInsertion = Main.triParInsertion(tab);
        assertArrayEquals(resultatAttendu, resultatTriParInsertion);
	}
	@Test
    public void test14() {
        String[] tab = {"abc"};
        String[] resultatAttendu = {"abc"};
        String[] resultatTriParInsertion = Main.triParInsertion(tab);
        assertArrayEquals(resultatAttendu, resultatTriParInsertion);
	}
	@Test
    public void test15() {
        String[] tab = {"abc","def","ghi","ghi","ghi","jkl","mno"};
        String[] resultatTriParInsertion = {"abc","def","ghi","ghi","ghi","jkl","mno"};
        String[] resultat = Main.triParInsertion(tab);
        assertArrayEquals(resultatTriParInsertion, resultat);
	}
	
	//Tests Fonction "corriger" :
	@Test
	public void test16(){
		String [] t1= {"toit","toiture"};
		String [] d1= {"toiture"};
		boolean[] resultatCorriger = Main.corriger(t1,d1);
		assertFalse(resultatCorriger[0]);
		assertTrue(resultatCorriger[1]);
	}
	@Test
	public void test17(){
		String [] t1= {"toit","toiture"};
		String [] d1= {""};
		boolean[] resultatCorriger= Main.corriger(t1,d1);
		assertFalse(resultatCorriger[0]);
		assertFalse(resultatCorriger[1]);
	}
	@Test
	public void test18(){
		String [] t1= {""};
		String [] d1= {"toit","toiture"};
		boolean[] resultatCorriger= Main.corriger(t1,d1);
		assertFalse(resultatCorriger[0]);
	}
	@Test
	public void test19(){
		String [] t1= {"Toit","toiture"};
		String [] d1= {"toit"};
		boolean[] resultatCorriger= Main.corriger(t1,d1);
		assertTrue(resultatCorriger[0]);
		assertFalse(resultatCorriger[1]);
	}
	//Tests Fonction "corrigerParDico" :
	@Test
	public void test20(){
		String [] t1= {"toit","toiture"};
		String [] d1= {"toiture"};
		boolean[] resultatCorriger= Main.corrigerParDico(t1,d1);
		assertFalse(resultatCorriger[0]);
		assertTrue(resultatCorriger[1]);
	}
	@Test
	public void test21(){
		String [] t1= {"toit","toiture"};
		String [] d1= {""};
		boolean[] resultatCorriger= Main.corrigerParDico(t1,d1);
		assertFalse(resultatCorriger[0]);
		assertFalse(resultatCorriger[1]);
	}
	@Test
	public void test22(){
		String [] t1= {""};
		String [] d1= {"toit","toiture"};
		boolean[] resultatCorriger= Main.corrigerParDico(t1,d1);
		assertFalse(resultatCorriger[0]);
	}
	@Test
	public void test23(){
		String [] t1= {"toit","toiture"};
		String [] d1= {"toit"};
		boolean[] resultatCorriger= Main.corrigerParDico(t1,d1);
		assertTrue(resultatCorriger[0]);
		assertFalse(resultatCorriger[1]);
	}
	//Tests Fonction "estTrie" :
	@Test
	public void test24() {
		String[] t = {"abc","def","ghi","jkl","mno"};;
		boolean resultat=Main.estTrie(t);
		assertEquals(true, resultat);
	}
	@Test
	public void test25() {
		String[] t = {"abc","def","jkl","mno","ghi"};;
		boolean resultat=Main.estTrie(t);
		assertEquals(false, resultat);
	}
	@Test
	public void test26() {
		String[] t = {"abc"};;
		boolean resultat=Main.estTrie(t);
		assertEquals(true, resultat);
	}
	@Test
	public void test27() {
		String[] t = {};;
		boolean resultat=Main.estTrie(t);
		assertEquals(true, resultat);
	}
	
	//Test fonction "distanceHamming" : 
	@Test
    public void test28() {
		int resultatdistanceHamming = Main.distanceHamming("abc", "abc");
        assertEquals(0,resultatdistanceHamming );
    }

    @Test
    public void test29() {
    	int resultatdistanceHamming = Main.distanceHamming("abc", "adc");
        assertEquals(1,resultatdistanceHamming );
    }

    @Test
    public void test30() {
    	int resultatdistanceHamming = Main.distanceHamming("   ", "xyz");
        assertEquals(3,resultatdistanceHamming );
    }
    @Test
    public void test31() {
    	int resultatdistanceHamming = Main.distanceHamming("", "");
        assertEquals(0,resultatdistanceHamming );
    }
}	
	
