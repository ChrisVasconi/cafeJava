public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 3.75;
        double smLatte = 3.50;
        double smCappuccino = 2.75;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); 
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(customer1 + " ordered a coffee");
                

            //Noah's great 'ccinno journey

            System.out.println(customer4 + "Ordered a Cappuccino");
                if(isReadyOrder1){
                    System.out.println(pendingMessage);
                }else{
                    System.out.println(customer4 + readyMessage + " The total is $" + smCappuccino);
                }



                //Sam and her 'lattes'

        System.out.println(customer2 + ",Ordered 2 Lattes");
                if (isReadyOrder1 != false){
                System.out.println(customer2 + pendingMessage);
                }else{
                    System.out.println(customer2 + " Total will be $" + smLatte*2);
                }           


                //Jimmy's coffe crisis
        System.out.println(customer3 + " Ordered a latte and got charged for a coffe");
        System.out.println(customer3 + displayTotalMessage + (dripCoffee - smLatte));
    }
}
        
    


