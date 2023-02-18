import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_mahmut {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("mahmut.txt");
		FileReader reader = null;
		if(file.exists()) {
			
			try {
				 reader= new FileReader(file);
				
				int data= reader.read();
				while(data !=-1) {
					System.out.print((char)data);
					data=reader.read();
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			finally {
				reader.close();
			}
				
			
		}
		else {
			System.out.println("No File exist!, Check your file name");
		}

	}

}
