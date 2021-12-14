public class house {
    int height;
    String color;
    String brandname;
    double price;


    void sethouse(int hp){

        this.height = hp;
    }
    void sethouse(double price){

        this.price = price;
    }
    void sethouse(String color, String brandname){
        this.color = color;
        this.brandname = brandname;
    }


    void showMyhouse(){
        System.out.println("My car's brand is " + this.brandname);
        System.out.println("My car's horsepower is " + this.height);
        System.out.println("My car's color is " + this.color);
        System.out.println("My car's price is " + this.price);
    }




}
