package com;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem3ClassTest {
	private Problem3Class prob3 ;
	@Before
	public void setUp() throws Exception {
		prob3 = new Problem3Class();
	}
	@FileParameters("src/Problem3solution.csv")
	@Test
	public void testCheckOut(int testcaseno , double cart , int creditRating , statusClass.Status status , boolean output , String bs) {
	assertEquals( output , prob3.checkOut(cart, creditRating, status));
	}
}