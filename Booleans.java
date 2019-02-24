
public class Booleans {

	public static void main(String[] args) {
		
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		
		double costOfMilk = 2.50;
		double moneyInWallet = 75.63;
		int thirstLevel = 6; //on a scale of 1 to 10
		
		
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
			System.out.println("Will I buy ice cream? " + shouldBuyIcecream);
		
		boolean willGoSwimming = isHotOutside && !isWeekday;
			System.out.println("Will I go swimming? " + willGoSwimming);
		
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
			System.out.println("Is it a good day? " + isAGoodDay);
			
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= 2*costOfMilk;
			System.out.println("Will I buy milk? " + willBuyMilk);
		
	}

}
