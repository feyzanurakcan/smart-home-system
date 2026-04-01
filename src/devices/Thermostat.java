package devices;

public class Thermostat extends Device {

    @Override
    public void printStatus() {
        System.out.println("The degree is " + temperature + " celsius");
    }

    @Override
    public void operate() {
        System.out.println("-------------------------------");
        printStatus();
        System.out.println("Please input what temperature you want?");
        int inp = getInp();
        setValue(inp);
        System.out.println("-------------------------------");
    }

    public void setValue(double value) {
        if (value < 10 || value > 40) {
            System.out.println("temperature must be between 10 and 40");
            notifyObservers();
            return;
        }
        temperature = value;
    }

    public String getName(){
        return "Thermostat";
    }
    private double temperature = 20;
}
