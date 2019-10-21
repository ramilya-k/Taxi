package ru.itpark;

public class Main {
    public static void main(String[] args) {
        TaxiOrderService taxiService = new TaxiOrderService();
        int price = taxiService.price(7);
        System.out.println(price);
    }
}