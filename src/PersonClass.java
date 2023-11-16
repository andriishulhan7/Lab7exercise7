import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonClass {
    String surname;
    String Firstname;
    String street;
    String zipCode;
    String city;
    public void initialize() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Retrieving data from person");
        System.out.println("Enter your surname");
        surname = br.readLine();
        System.out.println("Enter your name");
        Firstname = br.readLine();
        System.out.println("Enter you adress");
        street = br.readLine();
        System.out.println("Enter your zipCode");
        zipCode = br.readLine();
        System.out.println("Enter name ofm city");
        city = br.readLine();

    }
    public void print(){
        System.out.println("Displaying Data.");
        System.out.println("================");
        System.out.println("Surname"+surname);
        System.out.println("Firstname"+Firstname);
        System.out.println("Street"+street);
        System.out.println("zipCode"+zipCode);
        System.out.println("city"+city);
    }

}
