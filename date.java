import java.util.Scanner;

public class date {

    public static Scanner input = new Scanner(System.in);

    private int year;
    private int month;
    private int day;
    

    public void Readdate() {
        Readyear(year);
        Readmonth(month);
        Readday(day);
    }

    public void Showdate() {
        System.out.println(year + "/" + month + "/" + day + "  ");
    }

    public void Readyear(int x) {   
        System.out.println("Enter Year: ");
        x = input.nextInt();
        year = x;
    }

    public void Readmonth(int x) {
        System.out.println("Enter Month: ");
        x = input.nextInt();
        while (x < 1 || x > 12) {
            System.out.println("!Wrong number Entered!");
            System.out.println("!Please Enter a number btw 1 to 12!");
            x = input.nextInt();
        }
        month = x;
    }

    public void Readday(int x) {
        System.out.println("Enter day: ");
        x = input.nextInt();
        while (x < 0 || x > 31) {
            System.out.println("!Wrong number Entered!");
            System.out.println("!Please Enter a number btw 0 to 31");
            x = input.nextInt();
        }
        day = x;
    }
    
    public int birthYear() {
        return year;
    }
    public void Show_birthYear() {
        System.out.println(year);
    }

}
