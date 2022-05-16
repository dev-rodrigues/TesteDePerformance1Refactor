
public class ChildrenMovie implements ICustomer{
    @Override
    public double calcule(double thisAmount, Rental rental) {
        thisAmount += 1.5;
        if (rental.getDaysRented() > 3) {
            thisAmount += (rental.getDaysRented() - 3) * 1.5;
        }
        return thisAmount;
    }
}
