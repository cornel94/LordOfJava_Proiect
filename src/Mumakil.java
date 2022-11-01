public class Mumakil extends Creature{

    public Mumakil(double stamina, double speed, int agility, String nickname, long score){
        super(stamina,speed,agility,nickname,score);
    }

    @Override
    public void powerUp(double stamina, double speed, int agility){
        double staminaNew = 0.75 * stamina;
        double speedNew = speed + 10;
        /*this.powerUp(staminaNew,speedNew,agility);*/
        super.powerUp(staminaNew,speedNew,agility);
    }

    @Override
    public String toString(){
        return super.toString() + "\n\t A creature of type Mumakil.";
    }
}
