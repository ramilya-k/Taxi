public class TaxiOrderService {
    private int landingPrice = 60;
    private int pricePerKm = 20;
    private int discountPercentage = 5;
    private int maxDiscount = 100;
    private int priceForDiscount = 1000;

    int price(int distance) {
        int totalPrice = distance * pricePerKm + landingPrice;
        if (totalPrice > priceForDiscount) {
            int discount = (totalPrice * discountPercentage) / 100;
            if (discount < maxDiscount) {
                totalPrice -= discount;
            } else {
                totalPrice -= maxDiscount;
            }
        }
        return totalPrice;
    }
}