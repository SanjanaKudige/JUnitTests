package com;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Problem2ClassTest {
	private Problem2Class prob2 ;
	private alarmClass alarm ;
	private double fuel_level ;
	private boolean redLight , yellowLight , greenLight , buzzer , chime ;
	public Problem2ClassTest(double fuel_level, boolean redLight, boolean yellowLight, boolean greenLight,
			boolean buzzer, boolean chime) {
		this.fuel_level = fuel_level;
		this.redLight = redLight;
		this.yellowLight = yellowLight;
		this.greenLight = greenLight;
		this.buzzer = buzzer;
		this.chime = chime;
	}
	@Before
	public void setUp() throws Exception {
		prob2 = new Problem2Class();
		alarm = new alarmClass();
	}
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
			//Parameters are: (1,2,3,4,5,6)
			//1=fuel_level, 2=redLight, 3=yellowLight, 4=greenLight, 5=buzzer,6=chime
			//Test case 1
        	{100.0,		false,		false,		false,		false,		true},
			//Test case 2
        	{75.1,		false, 		false,		false,		false,		true},
			//Test case 3
        	{50.0, 		false, 		false,		true,		false,		true},
			//Test case 4
        	{25.1,		false,		true,		true,		false,		true},
			//Test case 5
        	{0.0,		true,		true,		true,		true,		false},
			//Test case 6
        	{0.1,		true,		true,		true,		false,		true},
			//Test case 7
        	{99.9,		false,		false,		false,		false,		true},
			//Test case 8
        	{75.0,		false,		false,		true,		false,		true},
			//Test case 9
        	{49.9,		false,		true,		true,		false,		true},
			//Test case 10
        	{25.0, 		true,		true,		true,		false,		true},
			//Test case 10
        	{200.0,		false,		false,		false,		false,		true}
        });
    }
	@Test 
	public void testCalcLights() {
		prob2.calcLights(fuel_level, alarm);
		assertEquals(redLight,  alarm.isRedLight() );
		assertEquals(yellowLight,  alarm.isYellowLight() );
		assertEquals(greenLight,  alarm.isGreenLight() );
		assertEquals(buzzer,  alarm.isBuzzer() );
		assertEquals(chime,  alarm.isChime() );
	}
}