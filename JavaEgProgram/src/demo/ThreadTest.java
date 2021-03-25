package demo;

public class ThreadTest extends Thread {
	public static void main(String args[])
	{
		ThreadTest t1=new ThreadTest();
		ThreadTest t2=new ThreadTest();
		ThreadTest t3=new ThreadTest();
		
		t1.run();
		t2.run();
		t3.run();
		System.out.println();
		t1.start();
		t2.start();
		t3.start();
	}
	
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			try {
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		System.out.println(i);
		}
	}

}
