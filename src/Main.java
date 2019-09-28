public class Main {
    public static void main(String[] args) {
        int landingPrice = 60;
        int distance = 7;
        int pricePerKm = 20;
        int bonusPercentage = 5;
        int maximalBonus = 100;
        int priceForDistance = distance * pricePerKm;
        int totalPrice = landingPrice + priceForDistance;
        int bonus = (totalPrice * bonusPercentage) / 100;
        if (totalPrice > 1000 && bonus < 100) {
            int lastPrice = totalPrice - bonus;
            System.out.println(lastPrice);
        } else if (totalPrice > 1000 && bonus > 100) {
            int lastPrice = totalPrice - maximalBonus;
            System.out.println(lastPrice);
        } else if (totalPrice < 1000) {
            System.out.println(totalPrice);
        }
    }
}
