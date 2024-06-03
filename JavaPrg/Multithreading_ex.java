class MyThread1 extends Thread{
    int i=0;
    @Override
    public void run()
    { 
        while (i<2) {
            System.out.println("My thread is running");
            System.out.println("I am happy");
            i++;
        }
    }
  
}

class MyThread2 extends Thread{
    int i =0;
    @Override
    public void run()
    {
        while (i<2) {
            System.out.println("My thread is not running");
            System.out.println("I am sad");
            i++;
        }
    }
  
}

class Multithreading_ex {
    
    public static void main(String args[])
    {
       MyThread1 M1 = new MyThread1();
       MyThread2 M2 = new MyThread2();
       
       M1.run();
       M2.run();
    }
}
