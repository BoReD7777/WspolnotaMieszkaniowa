package package1.Model;

public class LuxuryHouse extends House {

    private boolean hasPool;
    private int numberOfRooms;
    private int houseSize;

    public LuxuryHouse(int houseNumber, CostManager costManager) {
        super(houseNumber, costManager);
    }
}
