public class Dragon extends Creature implements IBurn{

    private double flamesPower;
    private int flySpeed;

    public Dragon (double stamina, double speed, int agility, String nickname, long score, double flamesPower, int flySpeed){
        super(stamina,speed,agility,nickname,score);
        this.flamesPower = flamesPower;
        this.flySpeed = flySpeed;
    }

    @Override
    public double getFlamesPower() {
        return flamesPower;
    }

    @Override
    public int getFlyingSpeed() {
        return flySpeed;
    }

    @Override
    public void powerUp(double stamina, double speed, int agility){
        double staminaNew = 2 * stamina;
        double speedNew = speed / 2;
        int agilityNew = agility * 3;
        /*this.powerUp(staminaNew,speedNew,agilityNew);*/
        super.powerUp(staminaNew,speedNew,agilityNew);
    }

    @Override
    public String toString(){
        return super.toString() + "\n\t Flames power: " + this.flamesPower + "\n\t Fly speed: " + this.flySpeed;
    }
}
