import java.util.Scanner;

public class League {
    private Team[] teams;
    private int teamCount;
    Scanner scanner = new Scanner(System.in);


    public League() {
        scanner = new Scanner(System.in);
        System.out.print("Enter the number of teams: ");
        int num_teams = scanner.nextInt();
        teams = new Team[num_teams];
        teamCount = 0;
    }
    public void addTeam() {
        if (teamCount < teams.length) {
            teams[teamCount] = new Team();
            System.out.printf("Enter details for team %d:\n", teamCount + 1);
            teams[teamCount].Read_Team_Info();
            System.out.println();
            teamCount++;
        } else {
            System.out.println("At least one team must enter");
        }
    }
    
    public void displayAllTeams() {
        for (int i = 0; i < teams.length; i++) {
            teams[i].Show_Team_Info();
            System.out.println();
        }
    }

    public void displayTeamByCode() {
        System.out.print("Enter team's code: ");
        String code = scanner.next();
        boolean found = false;
        for (int i = 0; i < teams.length; i++) {
            if (teams[i].get_team_Code().equals(code)) {
                teams[i].Show_Team_Info();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No team found with that code.");
        }
    }

    public void displayTeamByCoach() {
        System.out.print("Enter coach's ID code: ");
        String id = scanner.next();
        boolean found = false;
        for (int i = 0; i < teams.length; i++) {
            if (teams[i].get_coach_idCode().equals(id)) {
                teams[i].Show_team_name();
                System.out.println("");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No coach found with that ID code.");
        }
    }

    public void displayTeamByPlayer() {
        System.out.print("Enter player's ID code: ");
        String id = scanner.next();
        boolean found = false;
        for (int i = 0; i < teams.length; i++) {
            Player[] players = teams[i].get_players();
            for (int j = 0; j < players.length; j++) {
                if (players[j].get_IdCode().equals(id)) {
                    teams[i].Show_team_name();
                    System.out.println("---------------------");
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.println("No player found with that ID code.");
        }
    }

    public void displayPlayersByName() {
        for (int i = 0; i < teams.length; i++) {
            Player[] players = teams[i].get_players();
            for (int j = 0; j < players.length; j++) {
                if (players[j].get_fname().equalsIgnoreCase("Ali")) {
                    System.out.printf("%s %s (%s)\n", players[j].get_fname(), players[j].get_lname(), teams[i].get_team_name(),"\n");
                    System.out.println("------------");

                }
                else{
                    System.out.println("not found ALi");
                }
            }
        }
        System.out.println("*************************");

    }
    public void displayPlayersOver30() {
        int currentYear = 1402;
        for (int i = 0; i < teams.length; i++) {
            Player[] players = teams[i].get_players();
            for (int j = 0; j < players.length; j++) {
                int birthYear = players[j].getYear();
                int age = currentYear - birthYear;
                if (age > 30) {
                    System.out.printf("%s %s (%d years old)\n", players[j].get_fname(), players[j].get_lname(), age);
                    System.out.println("");

                }
            }
        }
    }
}