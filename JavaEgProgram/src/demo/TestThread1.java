package demo;

public class TestThread1 extends Thread{
	public static void main(String args[])
	{
		TestThread1 t1=new TestThread1();
		TestThread1 t2=new TestThread1();
		TestThread1 t3=new TestThread1();	
		t2.setPriority(MIN_PRIORITY);
		t2.start();
		t2.setName("This is Second thread");
		System.out.println("Min Priority: "+t2.getPriority());
      
		t1.setPriority(MAX_PRIORITY);
		t1.start();
		t1.setName("This is First thread");
		System.out.println("Max Priority: "+t1.getPriority());

		t3.setPriority(NORM_PRIORITY);;
		t3.start();
		t3.setName("This is Third thread");
		System.out.println("Normal Priority: "+t3.getPriority());


}
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	}
