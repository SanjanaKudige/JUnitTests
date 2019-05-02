package Homework5;

public class Problem4Class {

	public enum Status {gold, silver, regular};
	
	public boolean checkOut (double cart, Problem4ServerData creditRating, int SSN, Problem4Class.Status status) {
		   boolean approved=false;

//		   get credit rating from the server with the clients SSN
		   int rating = creditRating.getCreditRating(SSN);
 
		   if (status==Problem4Class.Status.gold) {
			   if (cart < 3_500.00)
				   approved = true;
			   else 
				   if (rating > 650)
					   approved = true; }
		   else {
			   if (status==Problem4Class.Status.silver) {
				   if (cart < 2_500.00)
					   approved = true;
				   else 
					   if (rating > 750)
						   approved = true; }
			   else {
					   if (cart < 1_500.00)
						   approved = true;
					   else 
						   if (rating > 800)
							   approved = true;		}}
		   return approved;
		}
}