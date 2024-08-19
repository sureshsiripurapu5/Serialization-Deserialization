import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Students s1=null;
        try{
            FileInputStream fis=new FileInputStream("C:\\Users\\Suresh Siripurapu\\Char.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            s1= (Students) ois.readObject();
            ois.close();
            fis.close();
        }
        finally{
            System.out.println("Deserializing the object");
            System.out.println("The student is is:"+s1.id);
            System.out.println("The student name is:"+s1.name);
            System.out.println("The student passwors is:"+s1.password);
        }
    }
}
