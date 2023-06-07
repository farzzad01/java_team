import java.util.Scanner;

public class person {

    public static Scanner input = new Scanner(System.in);

    private String fname;
    private String lname;
    private String idcode;
    private date bday = new date();

    public void Read_fname() {
        System.out.println("Enter First Name--> ");
        fname = input.next();
    }

    public void Read_lname() {
        System.out.println("Enter Last Name--> ");
        lname = input.next();
    }

    public void Read_idcode() {
        System.out.println("Enter your Id--> ");
        idcode = input.next();
    }

    public void Read_birthdate() {
        System.out.println("Enter Birth date--> ");
        bday.Readdate();
    }

    public void Show_fullname() {
        System.out.println("\nfullName--> " + fname + lname);
    }

    public void Show_idcode() {
        System.out.printf("\nIdcode --> : %s", idcode);
    }

    public void Show_birthdate() {
        System.out.printf("\nbirthdate--> ");
        bday.Showdate();
    }
    
    public String get_fname() {
        return fname;
    }
    
    public String get_lname() {
        return lname;
    }

    public String get_IdCode() {
        return idcode;
    }
    public date get_Birthdate() {
        return bday;
    }
    public void Show_fullName_and_idcod() {
        Show_fullname();
        Show_idcode();
    }

    public int getYear() {
        return bday.birthYear();
    }
}
