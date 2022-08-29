public class SQRService {

    public int countingSquares(int start, int end) {
        int sqr = 0;
        for (int i = 10; i <= 99; i++) {
            if (i*i >= start & i*i <= end ) {
                sqr++;
            }
        }
        return sqr;
    }
}
