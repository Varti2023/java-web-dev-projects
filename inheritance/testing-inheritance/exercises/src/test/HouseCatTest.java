import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {
    @org.junit.jupiter.api.Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }
}
