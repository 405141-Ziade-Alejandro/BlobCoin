package inHouse;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Blob[] blobs = new Blob[10];
        for (int i = 0; i < blobs.length; i++) {
            blobs[i] = new Blob();

            blobs[i].setName(String.valueOf(i+1));
        }

        int cheaterCounter = 0;
        for(Blob blob : blobs){
            if(blob.isCheater()){
                cheaterCounter++;
            }
            blob.fiveGames();
            Printer.printLn(blob.showRecords());
            Printer.printLn("Total amount of wins: "+ blob.getWins());
            Printer.printLn("\n");
        }
        Printer.printLn("Total amount of cheaters: "+ cheaterCounter);

    }
}