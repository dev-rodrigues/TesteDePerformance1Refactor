
public class NewReleaseMovie implements ICustomer{
    @Override
    public double calcule(double thisAmount, Rental rental) {
        return thisAmount + rental.getDaysRented() * 3;
    }
}
