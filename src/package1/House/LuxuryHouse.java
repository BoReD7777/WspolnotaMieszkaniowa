package package1.House;

import package1.ActivityAndExpenses.CostManager;

public class LuxuryHouse extends House{

    private static int numberOfRooms;
    private int houseSize;
    private int propertySize;
    private int cost;
    private boolean hasGarden;
    private boolean hasPool;
    private boolean isFurnished;
    private boolean hasSolarPanels;
    private double solarPanelUsage;
    private double electricityUsage;



    public LuxuryHouse(int houseNumber, boolean hasPool, int numberOfRooms,
                       int houseSize, int propertySize, boolean hasGarden, boolean hasSolarPanels,
                       int cost, String address, boolean isFurnished) {
        super(houseNumber, cost, address);
        this.hasPool = hasPool;
        this.numberOfRooms = numberOfRooms;
        this.houseSize = houseSize;
        this.propertySize = propertySize;
        this.hasGarden = hasGarden;
        this.hasSolarPanels = hasSolarPanels;
        this.isFurnished = isFurnished;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public static int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getHouseSize() {
        return houseSize;
    }

    public void setHouseSize(int houseSize) {
        this.houseSize = houseSize;
    }

    public int getPropertySize() {
        return propertySize;
    }

    public void setPropertySize(int propertySize) {
        this.propertySize = propertySize;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public boolean isHasSolarPanels() {
        return hasSolarPanels;
    }

    public void setHasSolarPanels(boolean hasSolarPanels) {
        this.hasSolarPanels = hasSolarPanels;
    }

    public double getSolarPanelUsage() {
        return solarPanelUsage;
    }

    public void setSolarPanelUsage(double solarPanelUsage) {
        this.solarPanelUsage = solarPanelUsage;
    }

    public double getElectricityUsage() {
        return electricityUsage;
    }

    public void setElectricityUsage(double electricityUsage) {
        this.electricityUsage = electricityUsage;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isFurnished() {
        return isFurnished;
    }

    public void setFurnished(boolean furnished) {
        isFurnished = furnished;
    }
}
