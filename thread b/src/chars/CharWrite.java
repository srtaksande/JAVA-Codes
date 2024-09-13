package chars;

import java.io.FileWriter;
import java.io.IOException;

public class CharWrite {

	public static void main(String[] args) throws IOException {
	
		FileWriter fos = new FileWriter("C:\\Users\\dhpcap\\Desktop\\new_file.docx");
		
		String msg = "This PC TOO doesn't work properly";
		System.out.println("Starting.....");
		fos.write(msg);
		System.out.println("Finished.....");
		
		fos.close();

	}

}
