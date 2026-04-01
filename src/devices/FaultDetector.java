package devices;

public class FaultDetector implements Observer{

    @Override
    public void update(Device device) {
        System.out.println("fault from device: " + device.getName());
        System.out.println("how would you like to handle it");
        device.operate();
    }
}
