package ex3_autowiring;

import java.io.FileWriter;
import java.io.IOException;

public class OutputerImpl implements Outputer{

	private String path;
	
	public void setPath(String path) {
		this.path=path;
	}
	
	@Override
	public void writeMessage(String msg) throws IOException {
		FileWriter fileWriter = new FileWriter(path);
		
		fileWriter.write(msg);
		
		fileWriter.close();
	}

}
