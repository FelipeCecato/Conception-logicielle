import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestEncapsulation {
    @Test
    void testAgeInvalide() {
        Personne p = new Personne("Alice", 25);
        assertThrows(IllegalArgumentException.class, () -> p.setAge(-1));
        assertThrows(IllegalArgumentException.class, () -> p.setAge(101));
    }

    @Test
    void testMoyenneInvalide() {
        Etudiant e = new Etudiant("Bob", 20, "ETU001", 10.0);
        assertThrows(IllegalArgumentException.class, () -> e.setMoyenne(22.0));
    }

    @Test
    void testNomVide() {
        assertThrows(IllegalArgumentException.class, () -> new Personne("", 20));
    }
}
