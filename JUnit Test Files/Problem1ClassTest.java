package com ;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static junitparams.JUnitParamsRunner.$;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class Problem1ClassTest {

	private Problem1Class prob1 ;
	
	@SuppressWarnings("unused")
	private static final Object[] parametersForProblem1ClassTest () {
		return $(
//				Parameters are: Balance1	 Balance2
				//Test case 1
				$(-0.01,			-500.01),
				//Test case 2
				$(0.00,				-150.00),
				//Test case 3
				$(799.99,			812.38),
				//Test case 4
				$(3499.99,			3589.23),
				//Test case 5 
				$(249999.99,		257887.48),
				//Test case 6
				$(250000.00,		258225.00),
				//Test case 7
				$(-1000.00,			-1500.00),
				//Test case 8
				$(0.01,				0.01),
				//Test case 9
				$(800.00,			820.40),
				//Test case 10
				$(3500.00,			3610.42),
				//Test case 11
				$(300000.00,		309850.00)
				); 
	}

	@Before
	public void setUp () {
		prob1 = new Problem1Class();
	}
	
	
	@Test
	@Parameters(method="parametersForProblem1ClassTest")
	public void test(double balance1 , double balance2) {
			assertEquals(balance2 , prob1.calcBalance(balance1) , 1000);

	}


}
