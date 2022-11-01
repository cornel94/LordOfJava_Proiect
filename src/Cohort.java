import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Cohort<C extends Creature> {

    /*private String address;
    private Creature being;*/
    private HashMap<String,C> hoarda = new HashMap<>();

    public int size(){
        return hoarda.size();
    }

    public Creature getCitizen(String address){
        return hoarda.get(address);
    }

    public boolean isEmpty(){
        return hoarda.isEmpty();
    }

    public void addNewCitizen(String address, C creature){
        hoarda.put(address,creature);
    }

    public ArrayList<C> getAllCitizenToFight(){
        ArrayList<C> list = new ArrayList<>();
        for (C creature : hoarda.values()){
            list.add(creature);
        }
        Collections.sort(list);
        return list;
    }

    public String toString(){
        /*ArrayList<C> list = getAllCitizenToFight();
        return list.toString();*/
        ArrayList<C> citizensAligned = getAllCitizenToFight();
        String ret = "";
        for (C creature: citizensAligned) {
            ret += creature + "\n" + "\n";
        }
        return ret;
    }
}
