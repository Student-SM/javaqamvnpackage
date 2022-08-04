import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.javaqamvnpackage.services.SQRService;

public class SQRServiceTest {

    @Test
    public void calcsquares3() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcsquares(200, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcsquares0() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcsquares(300, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcsquares5() {
        SQRService service = new SQRService();

        int expected = 5;
        int actual = service.calcsquares(100, 200);
        Assertions.assertEquals(expected, actual);
    }
}