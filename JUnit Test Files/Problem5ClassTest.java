package com;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem5ClassTest {
	private Problem5Class prob5 ;
	@Before
	public void setUp() throws Exception {
		prob5 = new Problem5Class();
	}
	@FileParameters("src/Problem5solution.csv")
	@Test
	public void testCalcY(int testcase , double x , double y , String bs) {
		assertEquals( y , prob5.calcY(x) , 10000);
	}
}