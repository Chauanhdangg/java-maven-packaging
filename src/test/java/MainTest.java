import org.example.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testGetMessage() {
        String expected = "Nguyễn Văn An";
        assertEquals(expected, Main.getMessage(), "Tên hiển thị không chính xác!");
    }
}