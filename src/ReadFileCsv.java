import java.io.*;

public class ReadFileCsv {
    public static void main(String[] args) {
        BufferedReader br = null;
        String line = "";
        try {
            File file = new File("text.csv");
            br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null){
                String[]data = line.split(",");
                System.out.println("Country [code= " + data[4] + " , name=" + data[5] + "]");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
            finally
        {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
