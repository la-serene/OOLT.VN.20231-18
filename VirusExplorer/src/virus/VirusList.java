package virus;

import java.util.ArrayList;

public class VirusList {
    public ArrayList<Virus> listOfVirus = new ArrayList<>();

    public void addVirus(Virus virus) {
        if (listOfVirus.contains(virus)) {
            System.out.println("Virus existed.");
        } else {
            listOfVirus.add(virus);
            System.out.println("Virus added!");
        }
    }
}
