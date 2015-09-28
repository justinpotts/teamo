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
	public void textFileMaker(ArrayList<String> input) {
		try {

			String content = "";
      for(int i = 0; i<input.size();i++){
        content+=input.get(i) + "\n";
      }

			File file = new File("/datafiles/storage.txt");//TODO FIX THIS!!!!

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
	}
}
