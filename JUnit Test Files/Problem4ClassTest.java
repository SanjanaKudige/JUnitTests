package com;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
@RunWith(JUnitParamsRunner.class)

public class Problem4ClassTest {
	private Problem4Class prob4 ;
	@Before
	public void setUp() throws Exception {
		prob4 = new Problem4Class();
	}
	@FileParameters("src/Problem4solution.csv")
	@Test
	public void testCarCollAlarms(int testcaseno , boolean selfDrive , double speed , double distance , boolean carCollCaut , boolean carCollWarn , boolean CarCollAlert , boolean emerBrake , String bs) {
		prob4.carCollAlarms(selfDrive, speed, distance);
		assertEquals( carCollCaut , prob4.isCarCollCaut());
		assertEquals( carCollWarn , prob4.isCarCollWarn());
		assertEquals( CarCollAlert , prob4.isCarCollAlert());
		assertEquals( emerBrake , prob4.isEmerBrake());
	}
}