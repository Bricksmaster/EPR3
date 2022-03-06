package Hausuebung;

public class PolymorphismESportsGames {
    class ESportsGame{
        String name;

        public void statement(){

        }
    }

    class Shooter extends ESportsGame{
    }
    class MOBA extends ESportsGame{
    }

    class LeagueofLegends extends MOBA{
        @Override
        public void statement() {
            System.out.println("League of Legends is a MOBA Game by Riot Games");
        }
    }
    class Dota2 extends MOBA{
        @Override
        public void statement() {
            System.out.println("Dota2 is a MOBA Game by Valve");
        }
    }

    class CSGO extends Shooter{
        @Override
        public void statement() {
            System.out.println("Cs:Go is a Shooter Game by Valve");
        }
    }
    class Valorant extends Shooter{
        @Override
        public void statement() {
            System.out.println("Valorant is a Shooter Game by Riot Games");
        }
    }

    public void print(){
        ESportsGame eSportsGame = new Valorant();
        eSportsGame.statement();

        ESportsGame eSportsGame1 = new CSGO();
        eSportsGame1.statement();

        ESportsGame eSportsGame2 = new LeagueofLegends();
        eSportsGame2.statement();

        ESportsGame eSportsGame3 = new Dota2();
        eSportsGame3.statement();
    }

    public static void main(String[] args) {
        new PolymorphismESportsGames().print();
    }
}
