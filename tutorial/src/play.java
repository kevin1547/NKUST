public class play {
    public static void main(String[] args) {
        game player = new game();
        String ability = new String();
        player.name1 = "弓箭手";
        player.HP = 1;
        player.Att = 1;
        player.MP = 1;

        game player2 = new game();

        player.name2 = "狂戰士";
        player.name3 = "魔法師";

        player.show();

    }
}
