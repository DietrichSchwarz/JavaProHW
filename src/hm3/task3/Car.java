package hm3.task3;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }
    private void startElectricity() {
        System.out.println("Electriciti is ON");
    }

    private void startCommand() {
        System.out.println("Start button is ON");
    }

    private void startFuelSystem() {
        System.out.println("FuelSystem is ON");
    }
}



