import java.util.Scanner;

public class Team {

    public static Scanner scanner = new Scanner(System.in);

    private String team_name;
    private String team_code;
    private Player[] players;
    private coach coach = new coach();

    public Team() {
        scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int num_play = scanner.nextInt();
        players = new Player[num_play];
    }

    public void Read_team_name() {
        System.out.println("Enter team_name --> ");
        team_name = scanner.next();
    }

    public void Read_team_code() {
        System.out.println("Enter team_code --> ");
        team_code = scanner.next();
    }

    public void Show_team_name() {
        System.out.printf("\nteam name is --> : %s", team_name);
        System.out.println("");
        System.out.println("************************");


    }

    public void Show_team_code() {
        System.out.printf("\nteam_code is --> : %s", team_code,"\n");
    }

    public void Read_Team_Info() {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Read_team_name();
        Read_team_code();
        System.out.println("---------------------------");
        System.out.println("coach Info : ");
        coach.Read_Coach_Info();
        System.out.println("---------------------------");
        for (int i = 0; i < players.length; i++) {
            System.out.printf("player " + (i + 1) + " Info : \n");
            players[i] = new Player();
            players[i].Read_player_Info();
            System.out.println("---------------------------");
        }
    }

    public void Show_Team_Info() {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Show_team_name();
        Show_team_code();
        System.out.println("\n---------------------------");
        System.out.printf("\ncoach Info : \n");
        coach.Show_Coach_Info();
        System.out.println("\n---------------------------");
        for (int i = 0; i < players.length; i++) {
            System.out.printf("\nplayer " + (i + 1) + " Info : \n");
            players[i].Show_player_Info();
            System.out.println("\n---------------------------");

        }
    }

    public String get_coach_idCode() {
        return coach.get_IdCode();
    }

    public void Show_team_coach_fullName() {
        coach.Show_fullname();
    }

    public String get_team_Code() {
        return team_code;
    }

    public Player[] get_players() {
        return players;
    }
    public String get_team_name() {
        return team_name;
    }
}
