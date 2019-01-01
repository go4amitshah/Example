import java.io.File;
import java.io.FileInputStream;
import java.util.*;
public class NumberOfCharacters {
   public static void main(String args[]) throws Exception{
   
      int i,malecount=0,femalecount=0;
	char lastchar;
	List<String> mlist=new ArrayList<String>();
	List<String> flist=new ArrayList<String>();
	File file = new File("testdata.txt");
      FileInputStream fis = new FileInputStream(file);
      byte[] byteArray = new byte[(int)file.length()];
      fis.read(byteArray);
      String data = new String(byteArray);
      String[] stringArray = data.split("\r\n");
	
      for(i=0;i<stringArray.length;i++)
	{
	lastchar=stringArray[i].charAt(stringArray[i].length()-1);
	if(lastchar=='M')
	{
		malecount++;
		mlist.add(stringArray[i].charAt(0).toString());
	}
	else
	{
		femalecount++;
		flist.add(stringArray[i].charAt(0));
	}
	}
	System.out.println("no of male " + malecount);
	System.out.println("no of female " + femalecount);
	System.out.println("no of male list " + mlist);
	System.out.println("no of female list " + flist);
	
      System.out.println("Number of lines in the file are ::"+stringArray.length);
   }

}