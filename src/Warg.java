public class Warg extends Creature implements IBite{

    private double bitePower;

    public Warg(double stamina, double speed, int agility, String nickname, long score, double bitePower){
        super(stamina,speed,agility,nickname,score);
        this.bitePower = bitePower;
    }

    public double getBitePower(){
        return this.bitePower;
    }

    @Override
    public void powerUp(double stamina, double speed, int agility){
        double staminaNew = stamina / 2;
        double speedNew = speed * 4;
        /*this.powerUp(staminaNew,speedNew,agility);*/
        super.powerUp(staminaNew,speedNew,agility);
    }

    @Override
    public String toString(){
        return super.toString() + "\n\t Bite power: " + this.bitePower;
    }

}
