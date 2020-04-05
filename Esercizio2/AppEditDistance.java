import java.io.*;
import java.util.ArrayList;

public class AppEditDistance {
  private static ArrayList<String> load_data(String pathname){
    ArrayList<String> str = new ArrayList<String>();
    try {
      FileReader filein = new FileReader(pathname);      
      int next;
      do {
        next = filein.read(); 
        String s = "";
        while (next != -1 && Character.isLetter(next)){
          s+= (char) next;
          next = filein.read();
        }
        if (s != "")
          str.add(s);
      } while (next != -1);
      filein.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return str;
  }

  public static void main(String[] args) throws IOException {
    ArrayList<String> dictionary = load_data("dataset/dictionary.txt"); 
    ArrayList<String> text = load_data("dataset/correctme.txt");
  }
}