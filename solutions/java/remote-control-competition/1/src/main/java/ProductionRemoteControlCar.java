class ProductionRemoteControlCar  implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    int distance = 0;
    int victories;
    
    public void drive() {
        distance += 10;
    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.victories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        // Sorts descending: highest victories first
        return Integer.compare(other.getNumberOfVictories(), this.getNumberOfVictories());
    }
}
