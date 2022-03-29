package design.handler;

public class EvenHandler extends Handler {

    public EvenHandler(String name) {
        super(name);
    }

    public boolean canHandle(int number) {
        return number % 2 == 0;
    }
}