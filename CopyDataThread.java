package lab10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyDataThread extends Thread
{
	Scanner sc=new Scanner(System.in);
	public void run()
	{
		System.out.println("Enter the source file path ");
		String path=sc.next();
		try
		{
			FileReader f=new FileReader(path);
			BufferedReader bf=new BufferedReader(f);
			
			String s;
			String str="";
			
			while((s=bf.readLine())!=null)
			{
				str=str+s;
			}
			
			FileWriter fw=new FileWriter("C:\\test\\JEE_Hrishi\\src\\lab10\\Target.txt",true);
		int count=0;
		while(count<str.length())
		{
			int n=count+10;
			for(int i=count;i<n && i<str.length();i++)
			{
				
				fw.write(str.charAt(i));
				
				System.out.println();
				count++;
				
			}
			Thread.sleep(1000);
		}
		
		f.close();
		fw.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

}
