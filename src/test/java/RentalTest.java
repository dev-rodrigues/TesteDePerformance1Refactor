import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RentalTest {


    @Test
    void deveCriarUmRental() {
        var movie = new Movie("Titanic", Movie.REGULAR);
        var rental = new Rental(movie, 2);

        Assertions.assertNotNull(rental);
    }
}