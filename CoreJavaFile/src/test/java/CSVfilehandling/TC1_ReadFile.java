package CSVfilehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TC1_ReadFile
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("../CoreJavaFile/CSVfileHandling.csv");
		FileReader fr=new FileReader(f);
		@SuppressWarnings("resource")
		BufferedReader br=new BufferedReader(fr);
		String s;
		while((s= br.readLine()) != null)
		{
			String[] s1=s.split(",");
			int l= s1.length;
			for(int i=0; i<l; i=i+1)
			{
				System.out.print(s1[i]+" ");
				
			}
		}
	}
}
