class NeedForSpeed {

    private int distance = 0;
    private int battery = 100;
    
    private int speed;
    private int batteryDrain;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {

        if(batteryDrained())
            return;

        battery -= batteryDrain;
        distance += speed;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

    int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        
        if(car.distanceDriven() >= distance)
            return true;

        if(car.batteryDrained())
            return false;

        car.drive();
        
        return canFinishRace(car);
    }
}
