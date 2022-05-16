public class Movie {

    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;

    private final String _title;
    private final int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public String getTitle() {
        return _title;
    }

    public boolean deveAumentarFrequencia(int daysRented) {
        return this._priceCode == Movie.NEW_RELEASE && daysRented > 1;
    }
}
