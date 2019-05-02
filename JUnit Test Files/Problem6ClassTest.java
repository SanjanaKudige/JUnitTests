package com;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem6ClassTest extends Problem6Class {
	private Problem6Class prob6 ;
	@Before
	public void setUp() throws Exception {
		prob6 = new Problem6Class();
	}
	@FileParameters("src/Problem6solution.csv")
	@Test
	public void testTriang(int no , int Side1 , int Side2 , int Side3 , TriangleClass.Triangle result , String bs) {
		assertEquals( result , prob6.Triang(Side1, Side2, Side3));
	}

}
