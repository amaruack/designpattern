package design.singleton;

class Singleton3 {
    private volatile static Singleton3 single;

    public static Singleton3 getInstance() {
        if (single == null) {
            synchronized (Singleton3.class) {
                if (single == null) {
                    single = new Singleton3();
                }
            }
        }
        return single;
    }

    private Singleton3() {

    }
}