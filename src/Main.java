import devices.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Device lights = new Light();
        Device thermostats = new Thermostat();
        Device alarms = new Alarm();

        FaultDetector faultDetector = new FaultDetector();

        List<Device> devices = new ArrayList<>();
        devices.add(lights);
        devices.add(thermostats);
        devices.add(alarms);

        for (Device device : devices)
            device.registerObserver(faultDetector);

        Random alarmSimulator = new Random();

        while (true){
            System.out.println("which system would you like to operate");
            System.out.println("0: lights");
            System.out.println("1: thermostats");
            System.out.println("2: alarms");
            System.out.println("3: exit");
            Scanner reader = new Scanner(System.in);
            int inp = reader.nextInt();
            if (inp == 3) break;
            devices.get(inp).operate();
            boolean alarmOccured = alarmSimulator.nextInt(3) == 2;// simulates alarm
            if (alarmOccured) {
                System.out.println("something went wrong triggering alarm");
                alarms.notifyObservers();
            }
        }

    }
}