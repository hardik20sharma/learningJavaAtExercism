public class JedliksToyCar {

    private int distance = 0;
    private int batteryPercentage = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + Integer.toString(distance) + " meters";
    }

    public String batteryDisplay() {
        return batteryPercentage == 0 ? "Battery empty" : "Battery at " + Integer.toString(batteryPercentage) + "%";
    }

    public void drive() {
        if(batteryPercentage > 0) {
            distance += 20;
            batteryPercentage -= 1;
        }
    }
}
