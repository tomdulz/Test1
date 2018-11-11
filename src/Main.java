import models.Players;

public class Main {
    public static void main(String[] args) {
    Players players = new Players("Ryan", "Giggs", "Manchester United", 28, 4, 8, 20, 18, false);
    Players players1 = new Players("Zinedine", "Zidane", "Real Madrid", 26, 10, 12, 20, 17, false);

    System.out.println(players.toString());
    System.out.println(players1.toString());

    }
}
