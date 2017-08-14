package main;

/**
 * Created by Jang Jeong Hyeon on 2017-08-15.
 */
class TestRunnable implements Runnable {
    private int index;

    public TestRunnable(int i) {
        index = i;
    }

    public void run() {
        System.out.println(index);
    }
}
