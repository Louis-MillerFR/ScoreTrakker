package ScoreTrakker;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;



class ScoreTrakker {
	private ArrayList<Student> data = new ArrayList<Student>();
	private String[] files = {"scores.txt", "badscore.txt", "nofile.txt" };
	public ScoreTrakker() {};
	public void loadDataFromFile(String fileName){
		ClassLoader classLoader = getClass().getClassLoader();
		InputStream inputStream = classLoader.getResourceAsStream(fileName);
		String dat = readFromInputStream(inputStream);
		try {
			File file = new File(classLoader.getResource(fileName).getFile());
			inputStream = new FileInputStream();
		}
		finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return;
	}
	
	public void printInOrder() {
		
	}
	
	public void processFiles(){
		this.loadDataFromFile("scores.txt");
		/*For now, this method will:
    	Call the loadDataFromFile() method passing in the name of a correctly formatted file ("scores.txt").
    	Call the printInOrder() method.
		 */
	}
	
	public static void main(String[] args) {
		/*Has a main() method that simply creates a new object of type ScoreTrakker and calls processFiles().*/
		ScoreTrakker s = new ScoreTrakker();
		s.processFiles();
	}
}
