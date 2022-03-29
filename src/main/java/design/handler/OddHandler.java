package design.handler;


public class OddHandler extends Handler {
    public OddHandler(String name) {
        super(name);
    }

    public boolean canHandle(int number) {
        return number % 2 != 0;
    }
}