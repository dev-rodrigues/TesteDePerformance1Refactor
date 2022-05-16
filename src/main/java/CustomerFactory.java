public class CustomerFactory {

    public double getAmout(int priceCode, Rental rental) {

        double thisAmount = 0;

        switch (priceCode) {
            case Movie.REGULAR -> thisAmount += new RegularMovie().calcule(thisAmount, rental);
            case Movie.NEW_RELEASE -> thisAmount += new NewReleaseMovie().calcule(thisAmount, rental);
            case Movie.CHILDRENS -> thisAmount += new ChildrenMovie().calcule(thisAmount, rental);
            default -> throw new IllegalArgumentException("Incorrect Price Code");
        }

        return thisAmount;
    }
}
