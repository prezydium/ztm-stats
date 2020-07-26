package com.sda.kristoff.ztmstats.core;

import java.time.LocalTime;
import java.util.Map;
import java.util.Scanner;

public class UIThread extends Thread {

    private DataStorage dataStorage;

    public UIThread(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    @Override
    public synchronized void start() {
        System.out.println(getName() + " has started at " + LocalTime.now());
        super.start();
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        int chosenOption;
        do {
            System.out.println("Please choose an option:");
            System.out.println("1 - print all vehicles");
            System.out.println("2 - print avg speed for all Gdansk vehicles");
            System.out.println("3 - print avg speed for all Gdansk vehicles grouped by line");
            System.out.println("4 - print avg speed for given line");
            System.out.println("0 - quit");
            chosenOption = sc.nextInt();
            sc.nextLine();
            if (chosenOption == 1) {
                System.out.println(dataStorage.getVehicles());
            } else if (chosenOption == 2) {
                Double avgSpeedForAllVehicles = Calculator.avgSpeed(dataStorage.getVehicles());
                System.out.println(avgSpeedForAllVehicles);
            } else if (chosenOption == 3) {
                Map<String, Double> avgSpeedByLine = Calculator.avgSpeedByAllLines(dataStorage.getVehicles());
                System.out.println(avgSpeedByLine);
            } else if (chosenOption == 4) {
                System.out.println("Enter line number");
                String lineNumber = sc.nextLine();
                Calculator.avgSpeedForGivenLine(lineNumber, dataStorage.getVehicles());
            }
        } while (chosenOption != 0);
    }
}
