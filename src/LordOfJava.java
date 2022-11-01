public class LordOfJava {

    private Parameters parameters;
    private Cohort<Dragon> dragons = new Cohort<>();
    private Cohort<Warg> wargs = new Cohort<>();
    private Cohort<Mumakil> mumakils = new Cohort<>();

    public LordOfJava(String OS, String gamePath, String credentials, int noLives){
        this.parameters = new Parameters(OS,gamePath,credentials,noLives);
    }

    public void addCreature(Creature c, String address) throws IllegalArgumentException{
        if (c instanceof Dragon){
            dragons.addNewCitizen(address,(Dragon) c);
        } else if (c instanceof Warg){
            wargs.addNewCitizen(address,(Warg) c);
        } else if (c instanceof Mumakil){
            mumakils.addNewCitizen(address,(Mumakil) c);
        } else {
            throw new IllegalArgumentException("Object type unknown: " + c.getClass().getName());
        }
    }

    public int battleDragonsWargs(){
        int score = 0;
        if (dragons.size() > wargs.size()){
            return 1;
        } else if (dragons.size() < wargs.size()){
            return -1;
        } else if (dragons.size() == wargs.size()){
            for (int i = 0; i < dragons.size(); i++){
                int result = dragons.getAllCitizenToFight().get(i).compareTo(wargs.getAllCitizenToFight().get(i));
                score = score + result;
            }
        }
        return score;
    }

    @Override
    public String toString(){
        return parameters.toString() + "\n" + "\n" + dragons + "\n" + wargs + "\n" + mumakils;
    }
}
