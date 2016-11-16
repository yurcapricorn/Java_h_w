import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by user on 16-Nov-16.
 */
public class LetterrsRate {
    public static void main(String[] args) {

        char[] fileArr = fileRead("C:\\Git\\Java_h_w\\letters_Rate(3)\\file1.txt");
        entryCount(fileArr);
    }

    public static char[] fileRead(String file) {
        char[] buffer = new char[0];
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[file.length()];
            reader.read(buffer);
            System.out.println(new String(buffer));
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
        return buffer;
    }

    public static void entryCount(char[] file){
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i=0;i<file.length;i++){
            String s = String.valueOf(file[i]);
            if (map.get(s)!=null){map.put(s,(map.get(s)+1));}
            else {map.put(s,1);}
        }
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            int value = pair.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
