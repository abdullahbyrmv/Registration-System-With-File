package Utility;
import java.io.*;

public class FileUtility {
    public static void write_object_to_file(Serializable object, String filename) throws Exception {
        try (FileOutputStream fos = new FileOutputStream(filename);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(object);
        }
    }

    public static Object read_file_as_object(String filename){
        Object obj = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))){
            obj = in.readObject();
        } finally {
            return obj;
        }
    }
}
