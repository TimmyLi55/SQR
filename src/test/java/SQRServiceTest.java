
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/file.csv")
    //@Test
    public void RangeTestingWithPositiveValues(int start, int end, int expected) {
        SQRService service = new SQRService();
        int actual = service.countingSquares(start,end);
        Assertions.assertEquals(expected, actual);


    }

}

