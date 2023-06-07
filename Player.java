import java.util.Scanner;

public class Player extends person {

    public static Scanner Scanner = new Scanner(System.in);

    private String Post; 

    public void Read_post() {
        System.out.println("Enter player's post--> ");
        Post = Scanner.next();
    }

    public void Show_Post() {
        System.out.printf("\nthis player post is --> : %s\n", Post);
    }
    public void Read_player_Info() {  
        Read_fname();
        Read_lname();
        Read_idcode();
        Read_birthdate();
        Read_post();
    }


    public void Show_player_Info() {
        Show_fullname();
        Show_idcode();
        Show_birthdate();
        Show_Post();
    }
    
    
    
    
}
