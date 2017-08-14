package main;

import ThreadPoolUtil.ThreadPool;

/**
 * Created by Jang Jeong Hyeon on 2017-08-15.
 */
public class Test {

    public static void main(String args[]) {

        // Create thread pool that number of thread is 5 and each thread is processing 10 items
        ThreadPool p = new ThreadPool(5, 10);
        p.toggleDebugWithQueue(true);
        p.toogleDebugWithRunnable(true);

        // Test code
        try {
            for (int i = 0; i < 100; i++) {
                Runnable r = new TestRunnable(i);
                p.execute(r);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            p.stop();
        }catch (InterruptedException e){
            System.out.println("ThreadPool is stopped");
        }
    }


}
