package Seatwork;

    public class PaymentApp {
        public static void main (String[] args){

            Order order = new Order("Keyboard", 10 ,300.0,new Gcash());
            System.out.println();
            System.out.println("Order item is " + order.getItem());
            System.out.println("Unit Price is " + order.getUnitPrice());
            System.out.println("Quantity is " + order.getQuantity());
            System.out.println();

            //order.setSpecific(new Gcash());
            order.setTotalAmount();
            System.out.println("Payment order details if " + order.getSpecific().getClass().getSimpleName());
            System.out.println("Discount Rate is " + order.getSpecific().determineDiscountRate());
            System.out.println("Payment amount is " + order.getTotalAmount());
            System.out.println();

            order.setSpecific(new Maya());
            order.setTotalAmount();
            System.out.println("Payment order details if " + order.getSpecific().getClass().getSimpleName());
            System.out.println("Discount Rate is " + order.getSpecific().determineDiscountRate());
            System.out.println("Payment amount is " + order.getTotalAmount());
            System.out.println();

            order.setSpecific(new ShopeePay());
            order.setTotalAmount();
            System.out.println("Payment order details if " + order.getSpecific().getClass().getSimpleName());
            System.out.println("Discount Rate is " + order.getSpecific().determineDiscountRate());
            System.out.println("Payment amount is " + order.getTotalAmount());


        }
    }