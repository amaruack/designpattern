package Test1;


import java.util.Iterator;

public class ThreadTest1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        final BlackOrWhite bow = new BlackOrWhite();

        Thread white = new Thread() {
            public void run() {
                while (true) {
                    bow.white();
                }
            }
        };
        Thread black = new Thread() {
            public void run() {
                while (true) {
                    bow.black();
                }
            }
        };
        white.start();
        black.start();
    }
}

class BlackOrWhite {
    private String str;
    private final String BLACK = "black";
    private final String WHITE = "white";
   
    public synchronized void black(){
        str = BLACK;
        try {
            long sleep = (long) (Math.random()*100L);
            Thread.sleep(sleep);
            if (!str.equals(BLACK)) {
                System.out.println("+++++++++++++++++broken!!++++++++++++++++++++");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void white(){
        str = WHITE;
        try {
            long sleep = (long) (Math.random()*100L);
            Thread.sleep(sleep);
            if (!str.equals(WHITE)) {
                System.out.println("+++++++++++++++++broken!!++++++++++++++++++++");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

