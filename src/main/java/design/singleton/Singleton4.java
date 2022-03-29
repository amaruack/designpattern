package design.singleton;

class Singleton4 {

    private Singleton4() {}

    private static class SingletonHolder {
        static final Singleton4 instance = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return SingletonHolder.instance;
    }

}