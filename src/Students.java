import java.io.Serializable;

public class Students implements Serializable {
    int id;
    String name;
   transient String password;
}
