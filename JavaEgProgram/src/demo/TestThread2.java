package demo;

public class TestThread2 extends Thread{
	public static void main(String args[])
	{
		TestThread2 t=new TestThread2();
		//TestThread2 t1=new TestThread2();

		t.start();	
		t.start();

	}

	public void run()
	{
		System.out.println("This is thread run method");
	}
}
