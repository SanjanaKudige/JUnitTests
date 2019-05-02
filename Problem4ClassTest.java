package Homework5;

import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem4ClassTest {

	int ssn;
	private Problem4Class prob4;
	Problem4ServerData mockobj;
	
	@Before
	public void setUp() throws Exception {
		prob4=new Problem4Class();
		mockobj=EasyMock.strictMock(Problem4ServerData.class);
	}

	@Test
	@FileParameters("src/Homework5/Problem 3 solution.csv")
	public void test(int testcase, double cart, int ssn,Problem4Class.Status status,boolean expectedoutput ) {
		
		EasyMock.expect(mockobj.getCreditRating(ssn)).andReturn(ssn);
		EasyMock.replay(mockobj);
		assertEquals(expectedoutput, prob4.checkOut(cart, mockobj,ssn, status));
	}

}
