class Building {
    private int numFloors;
    private int numElevators;
    public String buildingName;
    private Elevator[] elevators;
    private Floor[] floors;

    public Building(String buildingName, int numFloors, int numElevators) {
        this.buildingName = buildingName;
        this.numFloors = numFloors;
        this.numElevators = numElevators;
        this.elevators = new Elevator[numElevators];
        this.floors = new Floor[numFloors];
    // REMOVE LATER
        println("Building created with " + numFloors + " floors and " + numElevators + " elevators.");
    }
}