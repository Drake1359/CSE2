public class Arithmetic{
	public static void main (String [] args){
		//Tax
		double taxPercent=0.06;
		//Number of pairs of socks
		int nSocks=3;
		//Cost per pair of socks
		//(‘$’ is part of the variable name)
		double sockCost$=2.58;
		double totalSockCost=((double)((int)(100*(sockCost$*nSocks)))/100);
		double totalSockCostTax=((double)((int)(100*(totalSockCost*(1+taxPercent))))/100);
		
		//Number of drinking glasses
		int nGlasses=6;
		//Cost per glass
		double glassCost$=2.29;
		double totalGlassesCost=((double)((int)(100*(glassCost$*nGlasses)))/100);
		double totalGlassesCostTax=((double)((int)(100*(totalGlassesCost*(1+taxPercent))))/100);
		
		//Number of boxes of envelopes
		int nEnvelopes=1;
		//cost per box of envelopes
		double envelopeCost$=3.25;
		double totalEnvelopeCost=((double)((int)(100*(envelopeCost$*nEnvelopes)))/100);
		double totalEnvelopeCostTax=((double)((int)(100*(totalEnvelopeCost*(1+taxPercent))))/100);
		
		
		System.out.println("$"+totalSockCost+" is the total cost for Socks before Tax.");
		System.out.println("$"+totalGlassesCost+" is the total cost for Glasses before Tax.");
		System.out.println("$"+totalEnvelopeCost+" is the total cost for Envelopes before Tax.");
		System.out.println("$"+totalSockCostTax+" is the total cost for Socks after Tax.");
		System.out.println("$"+totalGlassesCostTax+" is the total cost for Glasses after Tax.");
		System.out.println("$"+totalEnvelopeCostTax+" is the total cost for Envelope after Tax.");
	}//End Main Method
}//End Class