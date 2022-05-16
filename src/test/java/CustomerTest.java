import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomerTest {


    @Test
    void deveCriarUmCustomerAndAdicionarUmFilmeREGULAR() {
        var filme = new Movie("Titanic", Movie.REGULAR);
        var rental = new Rental(filme, 2);

        var customer = new Customer("João");
        customer.addRental(rental);

        var result = customer.statement();
        var expected = result.contains("Amount owed is 2.0");
        Assertions.assertTrue(expected);
    }

    @Test
    void deveCriarUmCustomerAndAdicionarDoisFilmesREGULARAndNEW_RELEASE() {

        var titanic = new Movie("Titanic", Movie.REGULAR);
        var harryPotter = new Movie("Harry Potter", Movie.NEW_RELEASE);
        var rental = new Rental(titanic, 2);
        var rental2 = new Rental(harryPotter, 2);

        var customer = new Customer("João");
        customer.addRental(rental);
        customer.addRental(rental2);

        var result = customer.statement();
        var expected = result.contains("Amount owed is 8.0");
        Assertions.assertTrue(expected);
    }

    @Test
    void deveCriarUmCustomerAndAdicionarDoisFilmesREGULARAndNEW_RELEASEOndeDiaMaiorQueDois() {

        var titanic = new Movie("Titanic", Movie.REGULAR);
        var harryPotter = new Movie("Harry Potter", Movie.NEW_RELEASE);
        var rental = new Rental(titanic, 3);
        var rental2 = new Rental(harryPotter, 3);

        var customer = new Customer("João");
        customer.addRental(rental);
        customer.addRental(rental2);

        var result = customer.statement();
        var expected = result.contains("Amount owed is 12.5");
        Assertions.assertTrue(expected);
    }

    @Test
    void deveCriarUmCustomerAndAdicionarDoisFilmesREGULARAndChildrenOndeDiaMaiorQueDois() {

        var titanic = new Movie("Titanic", Movie.REGULAR);
        var harryPotter = new Movie("Harry Potter", Movie.CHILDRENS);
        var rental = new Rental(titanic, 3);
        var rental2 = new Rental(harryPotter, 4);


        var customer = new Customer("João");
        customer.addRental(rental);
        customer.addRental(rental2);

        var result = customer.statement();
        var expected = result.contains("Amount owed is 6.5");
        Assertions.assertTrue(expected);
    }

}