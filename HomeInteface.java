public class HomeInteface {
    private Light light;
    private Tv tv;
    private Airconditioning airconditioning;

   HomeInteface(){
    this.light = new Light();
    this.tv = new Tv();
    this.airconditioning = new Airconditioning();
   } 

   public void turnOffAll(){
    light.turnOff(); 
    tv.turnOff();
    airconditioning.turnOff();
   }

   public void turnOnAll(){
    light.turnOn(); 
    tv.turnOn();
    airconditioning.turnOn();

   }
}
