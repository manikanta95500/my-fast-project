package Abstraction;

public interface Abstraction {


    interface Player1 {

        //attributes, by default it is static
        public final int id=10;
        //methods are by default abstract
        int move();

    }
    public class Player implements Player1{

        @Override
        public int move() {
            return 2000;
        }
        public static void main(String args[]){

            Player p=new Player();
            System.out.println(p.move());
            //id=20;
            System.out.println(id);

        }
    }





}
