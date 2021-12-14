import java.util.Random;

public class play {
    public static void main(String[] args) {
        game player1 = new game();
        player1.setgame("弓箭手","狂戰士","魔法師");
        player1.name = "弓箭手";
        player1.HP = 25;
        player1.Att = 5;
        player1.MP = 10;
        player1.skillName = "箭雨";
        player1.showplayer1();

        game player2 = new game();
        player2.setgame("弓箭手","狂戰士","魔法師");
        player2.name = "狂戰士";
        player2.HP = 45;
        player2.Att = 4;
        player2.MP = 10;
        player2.skillName = "連續打擊";
        player2.showplayer2();

        game player3 = new game();
        player3.setgame("弓箭手","狂戰士","魔法師");
        player3.name = "魔法師";
        player3.HP = 20;
        player3.Att = 15;
        player3.MP = 15;
        player3.skillName = "豪火球";
        player3.showplayer3();
        System.out.println("\n");

        Random ran = new Random();

        int[] num = new int[20];
        for(int i = 0; i < 20; i++) {
            if (player1.HP > 0 & player2.HP > 0 & player3.HP > 0) {
                num[i] = ran.nextInt(6);
                System.out.println("第" + (i + 1) + "回合");
                if (num[i] == 0) {
                    if (player1.MP >= 5) {
                        player2.HP = player2.HP - player1.Att;
                        player1.MP = player1.MP - 5;
                        player1.playerAtt1();
                        player2.showplayer2();
                        System.out.println("------------------------------");
                    } else {
                        player1.recover1();
                        player1.MP = player1.MP + 5;
                        System.out.println("------------------------------");
                    }
                } else if (num[i] == 1) {
                    if (player2.MP >= 2) {
                        player3.HP = player3.HP - player2.Att;
                        player2.MP = player2.MP - 2;
                        player2.playerAtt2();
                        player3.showplayer3();
                        System.out.println("------------------------------");
                    } else {
                        player2.recover2();
                        player2.MP = player2.MP + 5;
                        System.out.println("------------------------------");
                    }
                } else if (num[i] == 2) {
                    if (player3.MP >= 10) {
                        player1.HP = player1.HP - player3.Att;
                        player3.MP = player3.MP - 10;
                        player3.playerAtt3();
                        player1.showplayer1();
                        System.out.println("------------------------------");
                    } else {
                        player3.recover3();
                        player3.MP = player3.MP + 5;
                        System.out.println("------------------------------");
                    }
                } else if (num[i] == 3) {
                    if (player1.MP >= 5) {
                        player3.HP = player3.HP - player1.Att;
                        player1.MP = player1.MP - 5;
                        player1.playerAtt11();
                        player3.showplayer3();
                        System.out.println("------------------------------");
                    } else {
                        player1.recover1();
                        player1.MP = player1.MP + 5;
                        System.out.println("------------------------------");
                    }
                } else if (num[i] == 4) {
                    if (player2.MP >= 2) {
                        player1.HP = player1.HP - player2.Att;
                        player2.MP = player2.MP - 2;
                        player2.playerAtt12();
                        player1.showplayer1();
                        System.out.println("------------------------------");
                    } else {
                        player2.recover2();
                        player2.MP = player2.MP + 5;
                        System.out.println("------------------------------");
                    }
                } else {
                    if (player3.MP >= 10) {
                        player2.HP = player2.HP - player3.Att;
                        player3.MP = player3.MP - 10;
                        player3.playerAtt13();
                        player2.showplayer2();
                        System.out.println("------------------------------");
                    } else {
                        player3.recover3();
                        player3.MP = player3.MP + 5;
                        System.out.println("------------------------------");
                    }
                }
            }
            else{
                System.out.println("GAMEOVER\n最終戰績:");
                player1.showplayer1();
                player2.showplayer2();
                player3.showplayer3();
                i = 19;
                System.out.println("1");
            }
        }
    }
}
