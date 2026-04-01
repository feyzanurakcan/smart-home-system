package devices;

public class Light extends Device {

    public void open() {
        if (status == Status.OPEN) {
            notifyObservers();
            return;
        }
        status = Status.OPEN;
        System.out.println("Lights opened.");
    }

    public void close() {
        if (status == Status.CLOSE) {
            notifyObservers();
            return;
        }
        status = Status.CLOSE;
        System.out.println("Lights closed");
    }

    @Override
    public void printStatus() {
        System.out.println("The Lights Status: " + status);
    }

    @Override
    public void operate() {
        System.out.println("-------------------------------");
        printStatus();
        System.out.println("What do you want to operate?");
        System.out.println("Close Lights: 1");
        System.out.println("open Lights: 2");
        System.out.println("exit: 3");
        int inp = getInp();
        if (inp == 1) close();
        else if (inp == 2) open();
        else if (inp == 3) System.out.println("exiting light screen");
        else System.out.println("Invalid input");
        System.out.println("-------------------------------");
    }

    @Override
    public String getName() {
        return "lights";
    }

    private Status status = Status.CLOSE;


}
