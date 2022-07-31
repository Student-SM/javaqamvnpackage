import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.javaqamvnpackage.services.SQRService;

public class SQRServiceTest {

    @Test
    public void calcsquares() {
        SQRService service = new SQRService();

        int expected = 15;
        int actual = service.calcsquares(200, 300);
        Assertions.assertEquals(expected, actual);
    }
}
