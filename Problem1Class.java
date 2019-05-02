package Homework5;

public class Problem1Class {

	private double purchaseTotal;
	private boolean discountVerified;
	
	public void calcPurchase (double total, boolean existingMember, boolean validDiscount, boolean validCoupon) {
		double discount = (existingMember && (validDiscount || validCoupon)) ? 0.15 : 0.0;
		
		setDiscountVerified(validDiscount || validCoupon);
		setPurchaseTotal(total * (1-discount));
	}

	public double getPurchaseTotal() {
		return purchaseTotal;
	}

	public void setPurchaseTotal(double purchaseTotal) {
		this.purchaseTotal = purchaseTotal;
	}

	public boolean isDiscountVerified() {
		return discountVerified;
	}

	public void setDiscountVerified(boolean discountApplied) {
		this.discountVerified = discountApplied;
	}
	
}