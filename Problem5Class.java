package Homework5;

public class Problem5Class {

	boolean chime, redLight, yellowLight, greenLight;
	
	public void setAlerts (double fuel_level) {

		chime=false; redLight=false; yellowLight=false; greenLight=false;

		if (fuel_level<=30.0)
			greenLight=true;
		else
			if (fuel_level<45.0)
				yellowLight=true;
			else
				if (fuel_level<=65.0)
					redLight=true;
	
		if (fuel_level > 10.0)
			chime=true;
	}

	public boolean isChime() {
		return chime;
	}

	public void setChime(boolean chime) {
		this.chime = chime;
	}

	public boolean isRedLight() {
		return redLight;
	}

	public void setRedLight(boolean redLight) {
		this.redLight = redLight;
	}

	public boolean isYellowLight() {
		return yellowLight;
	}

	public void setYellowLight(boolean yellowLight) {
		this.yellowLight = yellowLight;
	}

	public boolean isGreenLight() {
		return greenLight;
	}

	public void setGreenLight(boolean greenLight) {
		this.greenLight = greenLight;
	}
}