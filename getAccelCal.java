
public class getAccel {
	private double velocity;
	private double velocity0;
	private double distance;
	
	public void setVelocity(double velos){
		velocity = Math.pow(velos, 2.0);
	}
	public void setVelocitySubScript0(double vel0x){
		velocity = Math.pow(vel0x, 2.0);
	}
	public void setDistance(double dist){
		distance = dist * 2;
	}
	public double getAccelCal(){
		return (velocity - velocity0) / distance;  
		/**
		 * the first class i have ever written :)  the formula i used was:
		 * a=v^2 - v^2(w/ subscript 0)/2X the formula for a uniformly accelerated motion of
		 * basically the "throwing motion." This is from my General Physics textbook. 
		 * the math and code both check out.
		 */	
	}
}
