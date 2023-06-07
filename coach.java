import java.util.Scanner;

public class coach extends person {

    public static Scanner input = new Scanner(System.in);

    private String CardType; 

    public void Read_CardType() {
        System.out.println("Enter type of card between(A,B,C) --> ");
        CardType = input.next();
    }

    public void Show_CardType() {
        System.out.printf("\nType of card is --> : %s", CardType);
    }
    public void Read_Coach_Info() {
        Read_fname();
        Read_lname();
        Read_idcode();
        Read_birthdate();
        Read_CardType();
    }
    public void Show_Coach_Info() {
        Show_fullname();
        Show_idcode();
        Show_birthdate();
        Show_CardType();
    }

}
