class DeliveryCharges {

    // Basic delivery (just distance)
    void calculateDelivery(double distance) {
        double charge = distance * 5; // ₹5 per km
        System.out.println("Basic Delivery:");
        System.out.println("Distance: " + distance + " km");
        System.out.println("Delivery Charge: ₹" + charge);
    }

    // Premium delivery (distance + priority fee)
    void calculateDelivery(double distance, double priorityFee) {
        double charge = (distance * 5) + priorityFee;
        System.out.println("\nPremium Delivery:");
        System.out.println("Distance: " + distance + " km");
        System.out.println("Priority Fee: ₹" + priorityFee);
        System.out.println("Delivery Charge: ₹" + charge);
    }

    // Group delivery (distance + number of orders discount)
    void calculateDelivery(double distance, int numOrders) {
        double baseCharge = distance * 5;
        double discount = (numOrders > 3) ? baseCharge * 0.1 : 0; // 10% discount for >3 orders
        double charge = baseCharge - discount;
        System.out.println("\nGroup Delivery:");
        System.out.println("Distance: " + distance + " km");
        System.out.println("Number of Orders: " + numOrders);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Delivery Charge: ₹" + charge);
    }

    // Festival special (distance + discount percentage + free delivery over certain amount)
    void calculateDelivery(double distance, double discountPercent, double orderAmount) {
        double baseCharge = distance * 5;
        double discount = baseCharge * (discountPercent / 100);

        double charge = baseCharge - discount;
        System.out.println("\nFestival Special Delivery:");
        System.out.println("Distance: " + distance + " km");
        System.out.println("Discount Percentage: " + discountPercent + "%");
        System.out.println("Order Amount: ₹" + orderAmount);

        if (orderAmount > 500) {
            charge = 0; // free delivery
            System.out.println("Order amount is over ₹500 — FREE DELIVERY!");
        } else {
            System.out.println("Discount: ₹" + discount);
        }

        System.out.println("Delivery Charge: ₹" + charge);
    }
}

public class Main {
    public static void main(String[] args) {
        DeliveryCharges delivery = new DeliveryCharges();

        delivery.calculateDelivery(10); // Basic
        delivery.calculateDelivery(10, 50); // Premium
        delivery.calculateDelivery(10, 5); // Group
        delivery.calculateDelivery(10, 20, 600); // Festival special
    }
}
