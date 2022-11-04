package ExcelFilehandling;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class TC2_WriteFile 
{
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException 
	{
		File f=new File("../CoreJavaFile/ExcelFileHandling.xls");
		WritableWorkbook ww=Workbook.createWorkbook(f);
		WritableSheet ws=ww.createSheet("Hello All",0);
				for(int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++)
			{
				Label l=new Label(j, i, "Heeeya"); 		//Label define the cell structure 
				ws.addCell(l);
			}
		}
		ww.write();	//for saving the file
		ww.close();	//for closing the file
	}

}
