class MyRunnable implements Runnable {
    // TODO: Override run() method
    // Loop from 1 to 5 and print numbers separated by space
    @Override
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.print(i+" ");
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        // TODO: Create an instance of MyRunnable
        // TODO: Create a Thread object passing the runnable instance
        // TODO: Start the thread
        MyRunnable obj = new MyRunnable();
        Thread t = new Thread(obj);
        t.start();
    }
}
