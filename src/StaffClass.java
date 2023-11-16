import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StaffClass {
    class Staff extends PersonClass{
        String education;
        String position;
        public void initialize() IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            initialize();
            System.out.println("Enter your education");
            education = br.readLine();
            System.out.println("Enter you position");
            position = br.readLine();

        }
        public void print1(){
            print1();
            System.out.println("Education"+education);
            System.out.println("position"+position);
        }
    }
    class HR{
        public static void main(String[] args) throws IOException {
            Staff employee = new Staff
            employee.initialize();
            employee.print1();
            employee.initialize();
            employee.print1();
            PersonClass person = new PersonClass();
            person.initialize();
            person.print();


        }
    }
}
