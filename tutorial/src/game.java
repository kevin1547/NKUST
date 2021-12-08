public class game {
    int HP, Att, MP;
    String name1;
    String name2;
    String name3;



    String getplayerName1(){
        return this.name1;
    }
    String getplayerName2(){
        return this.name2;
    };
    String getplayerName3(){
        return this.name3;
    };
    int getHP(){
        return this.HP;
    }
    int getAtt(){
        return this.Att;
    }
    int getMP(){
        return this.MP;
    }

    void show(){
        System.out.println(getplayerName1() + getHP() + getAtt() + getMP());
    }
//this.Att = Att;
// this.MP = MP;


}
