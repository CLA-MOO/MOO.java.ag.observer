package miPrincipal;

import wsStockMarket.*;

public class Principal {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new Principal().getGreeting());
    }
}