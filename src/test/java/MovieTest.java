import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MovieTest {


    @Test
    void deveCriarUmFilme() {
        var filme = new Movie("Titanic", 0);
        Assertions.assertEquals("Titanic", filme.getTitle());
    }
}