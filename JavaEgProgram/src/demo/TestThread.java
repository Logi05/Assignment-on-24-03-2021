package demo;

public class TestThread extends Thread {
public static void main(String args[]) throws Exception
{
	TestThread t1=new TestThread();
	TestThread t2=new TestThread();
	TestThread t3=new TestThread();	

	t2.setPriority(MIN_PRIORITY);
	System.out.println("This is Second thread: "+t2.getPriority());

	t1.setPriority(MAX_PRIORITY);
	System.out.println("This is First thread: "+t1.getPriority());

	t3.setPriority(NORM_PRIORITY);;
	System.out.println("This is Third thread: "+t3.getPriority());

	t2.start();
	t1.start();
	t1.join();
	t2.join();
	t3.start();
	System.out.println(t1.isAlive());
	System.out.println(t2.isAlive());
	System.out.println(t3.isAlive());
	
}
public void run()
{
	for(int i=0;i<4;i++)
	{
		try {
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	System.out.println(i);
	}

}

}
