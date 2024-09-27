public class Airconditioning implements HomeService{

    @Override
    public void turnOff() {
        System.out.println("The Aircon is Off");
    }

    @Override
    public void turnOn() {
        System.out.println("The Aircon if On");
    }

}