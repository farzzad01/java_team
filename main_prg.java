import java.util.Scanner;

public class main_prg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        League league = new League();
    
        boolean exit = false;                   
        while (!exit) {                                 
            System.out.println("Select an option:");
            System.out.println("1. Get a team information");
            System.out.println("2. Display information of all teams");
            System.out.println("3. Display information of a team by code");
            System.out.println("4. Display team name by coach ID");
            System.out.println("5. Display team name by player ID");
            System.out.println("6. Display players with the name Ali");
            System.out.println("7. Display players who are 30 years old");
            System.out.println("8. Exit");
            
            int option = scanner.nextInt();
            scanner.nextLine();
            
            switch (option) {
                case 1:
                    league.addTeam();
                    break;
                case 2:
                    league.displayAllTeams();
                    break;
                case 3:
                    league.displayTeamByCode();
                    break;
                case 4:
                    league.displayTeamByCoach();
                    break;
                case 5:
                    league.displayTeamByPlayer();
                    break;
                case 6:
                    league.displayPlayersByName();
                    break;
                case 7:
                    league.displayPlayersOver30();
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }
} 
    
    
    