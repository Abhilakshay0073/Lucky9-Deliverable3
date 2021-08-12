package ca.sheridancollege.project;

/**
 * 
 * Cards suit and number
 * 
 * @author 
 *
 */

public class Cards {
	
	private Suits cardSuit;
	private int cardNum;
	private String[] numString = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	
	/**
	 * Cards constructor
	 */
	public Cards(Suits stype, int snum){
		 
		this.cardSuit = stype;
		
		if(snum >=1 && snum <= 9)
			this.cardNum  = snum;
		else{
			
			System.err.println(snum+" is not a valid card number\n");
			System.exit(1);
		}
	}
	
	public int getCardNumber(){
		
		return this.cardNum;
	}
	
	public String toString(){
		
		return this.numString[this.cardNum - 1]+" of "+this.cardSuit.toString();
	}
	
	
	
}
