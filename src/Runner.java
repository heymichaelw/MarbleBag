import java.util.ArrayList;

public class Runner {
    public Runner() {
        Marble redMarble = new Marble("red");
        Marble greenMarble = new Marble("green");
        Marble blueMarble = new Marble("blue");
        ArrayList<Marble> marbleList = new ArrayList<Marble>();
        marbleList.add(redMarble);
        marbleList.add(redMarble);
        marbleList.add(redMarble);
        marbleList.add(blueMarble);
        marbleList.add(blueMarble);
        marbleList.add(greenMarble);

        MarbleBag marbleBag = new MarbleBag(marbleList);

        marbleBag.printInfo();

        marbleBag.addMarble(blueMarble);
        marbleBag.addMarble(blueMarble);
        marbleBag.addMarble(blueMarble);

        if (marbleBag.getTotalNumberOfMarbles() == 9) {
            System.out.println("Total is 9, as expected");
        } else {
            System.out.println("PANIC!!!");
            throw new AssertionError(); //Crashes the program
        }

        marbleBag.removeAllGreenMarbles();

        if (marbleBag.getTotalNumberOfMarbles() == 8) {
            System.out.println("Total is 8, as expected");
        } else {
            System.out.println("Panic even more!!!");
            throw new AssertionError();
        }
    }
}
