import java.util.ArrayList;

public class MarbleBag {
    public ArrayList<Marble> marbleList = new ArrayList<Marble>();
    public int numRedMarbles;
    public int numGreenMarbles;
    public int numBlueMarbles;

    public MarbleBag(ArrayList<Marble> marbleList){
        this.marbleList = marbleList;
    }

    public MarbleBag(int numRedMarbles, int numGreenMarbles, int numBlueMarbles){
        this.numRedMarbles = numRedMarbles;
        this.numGreenMarbles = numGreenMarbles;
        this.numBlueMarbles = numBlueMarbles;
    }

    public void printInfo(){
        System.out.println("Red Marbles: " + this.numRedMarbles);
        System.out.println("Green Marbles: " + this.numGreenMarbles);
        System.out.println("Blue Marbles: " + this.numBlueMarbles);
    }

    public int getTotalNumberOfMarbles(){
        return this.marbleList.size();
    }

    public void removeAllRedMarbles() {
        removeAllColorMarbles("red");
    }

    public void removeAllGreenMarbles(){
        removeAllColorMarbles("green");
    }

    private void removeAllColorMarbles(String color) {
        ArrayList<Marble> tmpArray = new ArrayList<>();
        for (Marble marble : this.marbleList) {
            if (marble.color != color) {
                tmpArray.add(marble);
            }
        }
        this.marbleList = tmpArray;
    }

    public void addMarble(Marble marble){
        this.marbleList.add(marble);

    }
}
