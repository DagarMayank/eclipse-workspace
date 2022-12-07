package pkg1;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.read.biff.BiffException;

public class DataDrivenDataProvider 
{
	//In this we are giving the hardcore data.
	
	
	@Test(dataProvider="dataprovider2")
	public static void testcase(String s1, String s2)
	{
		System.out.println(s1);
		System.out.println(s2 );
	}
	
	@DataProvider
	public  Object[][] dataprovider1()
	{
		Object[][] data= new Object[3][2];
		data[0][0]="user1";
		data[1][0]="password1";
		data[0][1]="user2";
		data[1][1]="passwrod2";
		
		return data;
	}

	@DataProvider
	public Object[][] dataprovider2() throws BiffException, IOException
	{
		File f=new File("Desktop");
		
		jxl.Workbook w=jxl.Workbook.getWorkbook(f);
		Sheet	s=w.getSheet(0);
		int r=  s.getRows();			//no of row
		int c=	s.getColumns();			//no of column
		
		
		Object[][] dta=new Object[r][c];
		
		for(int i=0; i<r;i++)
		{
			for(int j =0;j<c ;j++)
			{
				Cell c1=s.getCell(j, i);
				dta[i][j]=c1.getContents();
			}
		}
		return dta;
				
	}
	



}
