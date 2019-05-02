package Homework5;

public class Problem2Class {

	public enum Problem2Enum {OFF,L,U,X5,N,X10};
	
	private int b,i,t,x;
	private Problem2Enum State;
		
	public Problem2Class(int b, int i, int t, int x, Problem2Enum state) {
		this.b = b;
		this.i = i;
		this.t = t;
		this.x = x;
		this.State = state;
	}

	private void setValues (int b, int i, int t, int x, Problem2Enum state) {
		this.b = b;
		this.i = i;
		this.t = t;
		this.x = x;
		this.State = state;		
	}
	public void processState (int d,int g,int p, int z) {

		switch (State) {
		
		case OFF:if (d==1 || z==1) 
					setValues(0,0,0,0,Problem2Enum.OFF);
				else 
					if (p==1)
						setValues(1,0,0,1,Problem2Enum.U);
					else
						setValues(1,0,1,0,Problem2Enum.L);
				break;
				
		case L:if (d==1 || g==1 || z==1) 
					setValues(1,0,1,0,Problem2Enum.L);
				else 
					setValues(0,0,0,0,Problem2Enum.OFF);
				break;		
				
		case U:if (d==1 || g==1) 
					setValues(1,0,0,1,Problem2Enum.U);
				else 
					if (p==1) 
						setValues(0,0,0,0,Problem2Enum.OFF);
					else
						setValues(1,0,0,2,Problem2Enum.X5);
				break;		
				
		case X5:if (g==1 || p==1) 
					setValues(1,0,0,2,Problem2Enum.X5);
				else 
					if (d==1)
						setValues(1,1,0,2,Problem2Enum.N);
					else
						setValues(1,0,0,3,Problem2Enum.X10);						
				break;		

		case N:if (g==1 || p==1 || z==1) 
					setValues(1,1,0,2,Problem2Enum.N);
				else 
					setValues(1,0,0,2,Problem2Enum.X5);
				break;		

		case X10:if (d==1 || g==1 || p==1) 
			setValues(1,0,0,3,Problem2Enum.X10);
		else 
			setValues(1,0,0,1,Problem2Enum.U);
		break;
		
		default: //this is for the Start constructor - we ignore this				
		}
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Problem2Enum getState() {
		return State;
	}

	public void setState(Problem2Enum state) {
		State = state;
	}
}