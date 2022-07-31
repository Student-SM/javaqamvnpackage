import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.javaqamvnpackage.services.SQRService;

public class SQRServiceTest {

    @Test
    public void calcsquares15() {
        SQRService service = new SQRService();

        int expected = 15;
        int actual = service.calcsquares(200, 300);
        Assertions.assertEquals(expected, actual);
    }

//         @Test
//    public void calcsquares16() {
//        SQRService service = new SQRService();
//
//        int expected = 16;
//        int actual = service.calcsquares(200, 300);
//        Assertions.assertEquals(expected, actual);
//    }
//    @Test
//    public void calcsquares17() {
//        SQRService service = new SQRService();
//
//        int expected = 16;
//        int actual = service.calcsquares(200, 300);
//        Assertions.assertEquals(expected, actual);
//    }
}