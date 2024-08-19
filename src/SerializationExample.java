import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String[] args){
        Students s1=new Students();
        s1.id=23010501;
        s1.name="Suresh siripurapu";
        s1.password="suresh@123";
        try{
            FileOutputStream fos=new FileOutputStream("C:\\Users\\Suresh Siripurapu\\Char.txt");
            ObjectOutputStream ous=new ObjectOutputStream(fos);
            ous.writeObject(s1);
            ous.close();
            fos.close();
            System.out.printf("Serializing data is saved in Char.txt");



        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
