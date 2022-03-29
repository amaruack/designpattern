package design.singleton;

class Singleton2 {
    private static Singleton2 single;

    public static synchronized Singleton2 getInstance() {
        if (single == null) {
            single = new Singleton2();
        }
        return single;
    }

    private Singleton2() {
    }
}