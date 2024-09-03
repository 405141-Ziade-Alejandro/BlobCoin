package inHouse;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Data
public class Blob {
    private boolean cheater;
    private List<Boolean> record;
    private String name;
    private int wins=0;

    private Random rand = new Random();

    public Blob() {
        if (rand.nextInt(10)+1>2){
            cheater = false;
        } else {
            cheater = true;
        }
        record = new ArrayList<Boolean>();
    }

    public void fiveGames(){
        Printer.printLn("Blob "+name+"'s will play 5 games"+"\n");
        for (int i = 0; i < 5; i++) {
            throwCoin();
        }
        //Printer.printLn("\n");

    }

    public void throwCoin(){
        int rando = rand.nextInt(100)+1;
        boolean result;
        if (cheater) {
            if (rando <= 75) {
                result = true;
            } else {
                result = false;
            }
            record.add(result);
        } else {
            if (rando <= 50) {
                result = true;
            } else {
                result = false;
            }
            record.add(result);
        }
        if (result){
            Printer.printLn("Heads, i win");
        } else {
            Printer.printLn("Tails, i loose");
        }

    }

    public String showRecords(){
        StringBuilder list = new StringBuilder("Blob " + name + "'s records:\n");

        for (int i = 0; i < record.size(); i++) {
            if (record.get(i)) {
                wins+=1;
                list.append(" - Gano ");
            } else {
                list.append(" - Perdio ");
            }
        }



        return list.toString();
    }
}
