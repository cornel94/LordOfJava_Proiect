public class Main {

    public static void main(String[] args) {
        Dragon drago = new Dragon(100,100,100,"Cornel",10,20,50);
        Dragon drago2 = new Dragon(100,100,100,"Gigi",10,20,50);
        Warg wargo = new Warg(110,90,90,"Cristina",10,40);
        Warg wargo2 = new Warg(110,90,90,"Cricri",10,40);
        Mumakil mumakilo = new Mumakil(80,80,80,"Giant",10);

        LordOfJava game = new LordOfJava("Windows",
                "/Users/Devmind/Applications/The Lord of Java.app",
                "df56df76sdf689889dfs79sfd8fsd98.md5sum",5);

        game.addCreature(drago,"1");
        game.addCreature(drago2,"2");
        game.addCreature(wargo,"1");
        game.addCreature(wargo2,"2");
        game.addCreature(mumakilo,"1");

        System.out.println(game.battleDragonsWargs());

        System.out.println(game.toString());
    }
}
