package Homework5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem5ClassTest {

	private Problem5Class prob5;
	
	@Before
	public void setUp() throws Exception {
		prob5=new Problem5Class();
	}

	@Test
	@FileParameters("src/Homework5/Problem5.csv")
	public void test(int testcase,double fuellevel, boolean red, boolean yellow, boolean green, boolean chime,String bp) {
		prob5.setRedLight(!red);
		prob5.setYellowLight(!yellow);
		prob5.setGreenLight(!green);
		prob5.setChime(!chime);		
		prob5.setAlerts(fuellevel);
		assertEquals(red,prob5.isRedLight());
		assertEquals(chime,prob5.isChime());
		assertEquals(green,prob5.isGreenLight());
		assertEquals(yellow,prob5.isYellowLight());
	}

}
