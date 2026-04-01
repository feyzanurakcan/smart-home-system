package devices;

public class Alarm extends Device{

    @Override
    public void printStatus() {
        System.out.println("-------------------------------");
        System.out.println("Alarm status: " + status);
        System.out.println("-------------------------------");
    }

    @Override
    public void operate() {
        System.out.println("-------------------------------");
        System.out.println("Alarm is ringing");
        System.out.println("What do you want to do?");
        System.out.println("1: Close the the alarm");
        System.out.println("2: call the cops");
        System.out.println("3: exit");
        int inp = getInp();
        if (inp == 1) status = Status.CLOSE;
        else if (inp == 2) System.out.println("calling the cops");
        else if (inp == 3) System.out.println("exiting");
        else System.out.println("invalid input");;
        System.out.println("-------------------------------");
    }

    @Override
    public String getName() {
        return "Alarm";
    }

    private Status status = Status.CLOSE;

}
