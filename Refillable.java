// Refillable version 2
//
public class Refillable {

	private int myAmount;
	private int myUseUpCallCount;
	private int myTotalUse; 
	
	// Initialize a Refillable object having initialAmount units.
	public Refillable (int initialAmount) {
	  if (initialAmount >= 0){
		myAmount = initialAmount;
	  }
    //   myUseUpCallCount = 0; 
	//   myTotalUse = 0; 
	}
	
	// Use amount units.
	public void useUp (int amount) {
		if (amount >= 0){
			if (myAmount-amount >= 0){
			myAmount = myAmount - amount; 
		    myTotalUse = myTotalUse + amount;
			}
			else{
				myTotalUse = myTotalUse + myAmount;
				myAmount = 0;
			}
		}
	   	myUseUpCallCount = myUseUpCallCount + 1;
    	
	}
	
	// Add amount to the current amount.
	public void refill (int amount) {
  		myAmount = myAmount + amount;
  }
	
	// Return the current amount.
	public int currentAmount ( ) {
		return myAmount;
	}

	public double averageUse(){
		if(myTotalUse >= 0){
  			return myTotalUse / (myUseUpCallCount * 1.0);
		}
		else{
			return 0.0;
		}
	} 
}