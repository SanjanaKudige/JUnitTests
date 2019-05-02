package Homework5;
import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem3ClassTest {
	private Problem3Class prob3;
	@Before
	public void setUp() throws Exception {
		prob3=new Problem3Class();
	}
	@SuppressWarnings("unused")
	private static final Object[] parametersForProblem3Class (){
		return $(			
			// Parameters are: (1,2)
				// Test case 1
				$(new int [] {0,1,2,3},false),
				// Test case 2
				$(new int [] {},true),
				// Test case 3
				$(new int [] {-10},true),
				// Test case 4
				$(new int [] {-1},false),
				// Test case 5
				$(new int [] {-10,-11,10,11},true),
				// Test case 6
				$(new int [] {11},true),
				// Test case 7
				$(new int [] {0,0},true),
				// Test case 8
				$(new int [] {4,2,3,3},true),
				// Test case 9
				$(new int [] {-9,9},true),
				// Test case 10
				$(new int [] {-10,10},true),
				// Test case 11
				$(new int [] {-1000,1000},true)
				);
	}	
	@Test
	@Parameters(method="parametersForProblem3Class")
	public void test(int [] n, boolean result) {
		assertEquals(prob3.sumEvenOdd(n),result);
	}
}