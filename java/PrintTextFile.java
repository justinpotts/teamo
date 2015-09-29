//
//
//
//
//

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PrintTextFile {
	public ArrayList<String> textOut;
	public PrintTextFile(){
		textOut = new ArrayList<String>();
	}
	public PrintTextFile(ArrayList<String> in){
		for(int i = 0; i < in.size();i++){
			textOut.add(in.get(i));
		}
	}
	public File textFileMaker() {
		try {

			String content = "";
      for(int i = 0; i<textOut.size();i++){
        content+=textOut.get(i) + "\n";
      }

			File file = new File("~/Desktop/coolText.txt");//TODO FIX THIS!!!!

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
}
