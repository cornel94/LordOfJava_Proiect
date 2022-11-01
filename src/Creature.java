public abstract class Creature implements ICreature, Comparable<Creature> {

    private Abilities abilities;
    private String nickname;
    private long score;

    public Creature(double stamina, double speed, int agility, String nickname, long score) {
        this.abilities = new Abilities(stamina,speed,agility);
        this.nickname = nickname;
        this.score = score;
    }

    @Override
    public String getNickname() {
        return this.nickname;
    }

    @Override
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void updateScore(long amount) throws NumberFormatException {
        /*while (amount < 0) {
            System.out.println("Expecting positive bonus value, got: " + amount);
            updateScore(amount);
        }*/
        if (amount <= 0){
            throw new NumberFormatException("Expecting positive bonus value, got: " + amount);
        }
        this.score += amount;
    }

    public void powerUp(double stamina, double speed, int agility){
        this.abilities.update(stamina,speed,agility);
    }

    @Override
    public int compareTo(Creature other){
        return this.abilities.compareTo(other.abilities);
    }

    @Override
    public String toString(){
        return "\t Nickname: " + this.nickname + "\n\t Score: " +
                this.score + "\n\t Abilities:" + this.abilities ;
    }


}

