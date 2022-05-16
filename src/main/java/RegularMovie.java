
public class RegularMovie implements ICustomer{

    @Override
    public double calcule(double thisAmount, Rental rental) {
        thisAmount += 2;
        if (rental.getDaysRented() > 2)
            thisAmount += (rental.getDaysRented() - 2) * 1.5;

        return thisAmount;
    }
}
