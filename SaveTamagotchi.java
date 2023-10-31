import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveTamagotchi {
	public SaveTamagotchi(){
	}

	public void save(String data) {
		try {
			String fileName = "data.txt";
            
            // Create a BufferedWriter instance
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            // Write the string to the file
            writer.write(data);

            // Close the writer to ensure data is flushed and the file is properly closed
            writer.close();

            System.out.println("Data has been written to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
