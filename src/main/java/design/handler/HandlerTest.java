package design.handler;

public class HandlerTest {

    public static void main(String[] args) {

        Handler oddHandler = new OddHandler("홀수");
        Handler evenHandler = new EvenHandler("짝수");

        oddHandler.setNext(evenHandler);

        for (int i = 1; i <= 10; i++) {
            oddHandler.handleRequest(i);
        }
    }
}
