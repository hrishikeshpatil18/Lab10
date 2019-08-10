package lab10;

public class Exercise2 implements Runnable
{
	public void run()
	{
		try
		{
			for(int j=1;j<6;j++)
			{
				System.out.println("Timer "+j);
				for(int i=1;i<11;i++)
				{
						Thread.sleep(1000);
						System.out.println(i+" second");
				}
				//Thread.sleep(10000);
				
			}	
		}catch(InterruptedException e){System.out.println(e);}
	}
	
	public static void main(String args[])
	{
		Exercise2 e1=new Exercise2();
		Thread t=new Thread(e1);
		t.start();
	}
}
