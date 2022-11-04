package TXTFilehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TC3_WriteDataTXTfile 
{

	public void writedata() throws IOException
	{
		File f=new File("../CoreJavaFile/JavaTextFileHandling(write).txt");
		FileWriter fw=new FileWriter(f, true);
		BufferedWriter bw=new BufferedWriter(fw);
		//file writer will overwrite the line
		//so we use boolean append filewriter and buffer writer to write the line from the end of string present in file 
		bw.newLine();
		
		bw.write("I have created a new file for writing the data in it, which is automatically connected to the project.");
		bw.close();	
	}
	public static void main(String[] args) throws IOException 
	{	
				TC3_WriteDataTXTfile w=new TC3_WriteDataTXTfile();
				w.writedata();
	}

}
