package Module1Assi;

import java.util.Scanner;

public class GroceryBillCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Customer Name: ");
		String name = sc.next();
	    System.out.println("Enter Number of items: ");
	    int item = sc.nextInt();
	    
	    String[] itemName = new String[item];
	    int[] quantity = new int[item];
	    double[] pricepu = new double[item];
	    double[] totalPrice = new double[item];
	    
	    
	    for(int i = 0; i < item;i++) {
	    System.out.println("Enter item " + (i + 1) + " Name:  ");
	    itemName[i] = sc.next();
	    System.out.println("Enter Quantity: ");
	    quantity[i] = sc.nextInt();
	      while(quantity[i] <= 0) { 
	    	   System.out.println("Quantity cannot be 0 or less");
	    	   System.out.println("Re-Enter Quantity: ");
	    	   quantity[i] = sc.nextInt();
	      }
	    System.out.println("Enter Price per unit: ");
	    pricepu[i] = sc.nextDouble();
	    while(pricepu[i] <= 0) { 
	    	   System.out.println("Price cannot be 0 or less");
	    	   System.out.println("Re-Enter Price per unit: ");
	    	   pricepu[i] = sc.nextDouble ();
	      }
	    }
	    
	    for(int i = 0; i < item; i++) 
	    	totalPrice[i] = quantity[i] * pricepu[i];
	    
	    double subTotal = 0;
	    
	    for(int i = 0; i < item; i++) 
	    	subTotal = subTotal + (quantity[i] * pricepu[i]);
	    
	    double discount = 0;
	    if(subTotal < 1000) {
	    	discount = 0;
	    }
	    else if(subTotal > 1000 && subTotal < 5000) {
	    	discount = subTotal * 0.05;
	    }
	    else if(subTotal > 5000 && subTotal < 10000) {
	    	discount = subTotal * 0.10;
	    }
	    else if(subTotal >= 10000) {
	    	discount = subTotal * 0.15;
	    }
	    
	    double amountAfterDiscount = subTotal - discount; 
	    
	    double gst = amountAfterDiscount * 0.18;
	    
	    double finalAmount = amountAfterDiscount + gst;
	    
	    
	    System.out.println("=======================================");
	    System.out.println();
	    System.out.println("           GROCERY BILL     ");
	    System.out.println();
	    System.out.println("=======================================");
	    System.out.println();
	    System.out.println();
	    System.out.println("Customer Name: " + name);
	    System.out.println();
	    System.out.println();
	    System.out.println(" Item   Quantity   Price   Total");
	    System.out.println();
	    System.out.println("-----------------------------");
	    System.out.println();
	    for(int i = 0;i < item;i++){
	    	System.out.println("  " + itemName[i] + "     " + quantity[i] + "       " + pricepu[i] + "     " + totalPrice[i]);
	    }
	    System.out.println();
	    System.out.println("-----------------------------");
	    System.out.println("Subtotal:          " + subTotal);
	    System.out.println("Discount:          " + discount);
	    System.out.println("Amount After Discount: " + amountAfterDiscount );
	    System.out.println("GST(18%):          " + gst);
	    System.out.println();
	    System.out.println("-----------------------------");	    
	    System.out.println();
        System.out.println("Final Payable Amount: " + finalAmount );	
        System.out.println();
        System.out.println("=======================================");  
        System.out.println();
        System.out.println("Thank you for shopping!");

}
}
