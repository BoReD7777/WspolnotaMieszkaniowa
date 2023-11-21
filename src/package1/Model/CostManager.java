package package1.Model;

import java.util.Scanner;

public class CostManager {

    private double maintenanceCost;
    private double waterCost;
    private double electricityCost;
    private double gasCost;
    private double internetCost;

    public double getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public double getWaterCost() {
        return waterCost;
    }

    public void setWaterCost(double waterCost) {
        this.waterCost = waterCost;
    }

    public double getElectricityCost() {
        return electricityCost;
    }

    public void setElectricityCost(double electricityCost) {
        this.electricityCost = electricityCost;
    }

    public double getGasCost() {
        return gasCost;
    }

    public void setGasCost(double gasCost) {
        this.gasCost = gasCost;
    }

    public double getInternetCost() {
        return internetCost;
    }

    public void setInternetCost(double internetCost) {
        this.internetCost = internetCost;
    }


    private static final double WATER_COST_RATE = 4.27;
    private static final double ELECTRICITY_COST_RATE = 1.41;
    private static final double GAS_COST_RATE = 1.24;
    private static final double INTERNET_COST_RATE = 5.99;


    public CostManager(double maintenanceCost, double waterCost, double electricityCost, double gasCost, double internetCost) {
        this.maintenanceCost = maintenanceCost;
        this.waterCost = waterCost;
        this.electricityCost = electricityCost;
        this.gasCost = gasCost;
        this.internetCost = internetCost;
    }


    public double calculateTotalCost(){
        return maintenanceCost + waterCost + electricityCost + gasCost + internetCost;
    }

    public void updateWaterUsage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter water usage in cubic meters: ");
        double waterUsage = scanner.nextDouble();
        this.waterCost = waterUsage * WATER_COST_RATE;
    }

    public void updateElectricityUsage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter electricity usage in kilowatt-hours: ");
        double electricityUsage = scanner.nextDouble();
        this.electricityCost = electricityUsage * ELECTRICITY_COST_RATE;
    }

    public void updateGasUsage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter gas usage in cubic meters: ");
        double gasUsage = scanner.nextDouble();
        this.gasCost = gasUsage * GAS_COST_RATE;
    }

    public void updateInternetUsage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter internet usage in giga bytes: ");
        double internetUsage = scanner.nextDouble();
        this.internetCost = internetUsage * INTERNET_COST_RATE;
    }


}
