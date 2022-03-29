package design.wrapper;

public class Adaptor {
    private Adaptee adaptee;

    public int getNumber() {
        adaptee = new Adaptee();
        return Integer.valueOf(adaptee.getString()); //String형 데이터를 Int형 데이터로 변환함.
    }
}