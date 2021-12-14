import java.util.Random;

public class game {
    int HP, Att, MP;
    String name, player1, player2, player3;

    String skillName;


    void setgame(String player1, String player2, String player3) {
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
    }

    int getHP() {
        return this.HP;
    }

    int getAtt() {
        return this.Att;
    }

    int getMP() {
        return this.MP;
    }

    String getSkillName() {
        return this.skillName;
    }

    String playername(){
        return this.name;
    }

    void showplayer1() {
        System.out.println(this.player1 + "[" + "HP:" + getHP() + "/" + "Att:" + getAtt() + "/" + "MP:" + getMP() + "]");
    }
    void showplayer2() {
        System.out.println(this.player2 + "[" + "HP:" + getHP() + "/" + "Att:" + getAtt() + "/" + "MP:" + getMP() + "]");
    }
    void showplayer3() {
        System.out.println(this.player3 + "[" + "HP:" + getHP() + "/" + "Att:" + getAtt() + "/" + "MP:" + getMP() + "]");
    }

    void player1shout() {
        System.out.println(this.player1 + "使出技能: " + getSkillName());
    }
    void player2shout() {
        System.out.println(this.player2 + "使出技能: " + getSkillName());
    }
    void player3shout() {
        System.out.println(this.player3 + "使出技能: " + getSkillName());
    }

    void attack1() {
        System.out.println("消耗5MP攻擊" + this.player2);
    }
    void attack2() {
        System.out.println("消耗2MP攻擊" + this.player3);
    }
    void attack3() {
        System.out.println("消耗10MP攻擊" + this.player1);
    }
    void attack11() {
        System.out.println("消耗5MP攻擊" + this.player3);
    }
    void attack12() {
        System.out.println("消耗2MP攻擊" + this.player1);
    }
    void attack13() {
        System.out.println("消耗10MP攻擊" + this.player2);
    }

    void recover1() {
        System.out.println(this.player1 + "攻擊，但能量不足，回復5點能量");
    }
    void recover2() {
        System.out.println(this.player2 + "攻擊，能量不足，回復5點能量");
    }
    void recover3() {
        System.out.println(this.player3 + "攻擊，能量不足，回復5點能量");
    }

    void playerAtt1(){
        player1shout();
        attack1();
        showplayer1();
    }
    void playerAtt2(){
        player2shout();
        attack2();
        showplayer2();
    }
    void playerAtt3(){
        player3shout();
        attack3();
        showplayer3();
    }
    void playerAtt11(){
        player1shout();
        attack11();
        showplayer1();
    }
    void playerAtt12(){
        player2shout();
        attack12();
        showplayer2();
    }
    void playerAtt13(){
        player3shout();
        attack13();
        showplayer3();
    }





}