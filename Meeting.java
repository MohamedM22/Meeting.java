public class Meeting {
    public static void main(String[] args) {

        double sales = 24309.65; 
        int roundedsales = (int)sales;
        double profit = 18562.18; 
        int roundedprofit = (int)profit;
        double refunds = 688.78; 
        int roundedrefunds = (int)refunds;
        double shipping = 1233.57;
        int roundedshipping =(int)shipping; 

        System.out.println("This month, we made "+(roundedsales)+ " in sales");
        System.out.println("Factoring in costs, we made "+(roundedprofit)+" in profit");
        System.out.println("The refunds are at a low "+(roundedrefunds)+". This is a good sign!");
        System.out.println("Shipping costs were high. We paid "+(roundedshipping)+" in shipping");


    }
}
