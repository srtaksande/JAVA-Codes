package chars;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharRead {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\dhpcap\\Desktop\\new_file.txt");
		FileWriter fw = new FileWriter("C:\\Users\\dhpcap\\Desktop\\new_file1.txt");
		
		int data = 0; String str = " ";
		while ((data = fr.read()) != -1)
		{
		 str += (char) data;
		}
		
		System.out.println(str);
	
		fw.write(str);
		
		fw.close();
		fr.close();
	}
	
	

}
