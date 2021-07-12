package convertidor_monedas;

public class Currency {
    private String currencyName;
    private String currencySymbol;
    private String id;

    Currency(String currencyName, String currencySymbol, String id) {
        this.currencyName = currencyName;
        this.currencySymbol = currencySymbol;
        this.id = id;
    }
}