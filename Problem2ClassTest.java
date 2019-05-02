package Homework5;
import static org.junit.Assert.*;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import Homework5.Problem2Class.Problem2Enum;

@RunWith(JUnitParamsRunner.class)
public class Problem2ClassTest {
	private Problem2Class prob2;
	@Before
	public void setUp() throws Exception {
		prob2=new Problem2Class(0,0,0,0,Problem2Enum.OFF);
	}
	@Test
	@FileParameters("src/Homework5/Problem2.csv")
	public void test(String testcase, Problem2Enum state,Problem2Enum Nextstate, int D, int G, int P, int Z, int B, int I, int T, int X) {
		prob2.setState(state);		
		prob2.processState(D,G,P,Z);
		assertEquals(B,prob2.getB());
		assertEquals(I,prob2.getI());
		assertEquals(T,prob2.getT());
		assertEquals(X,prob2.getX());	
	}
}