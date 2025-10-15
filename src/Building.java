import java.util.HashMap;

class Building {
    private int numFloors;
    private int numElevators;
    public String buildingName;
    private HashMap<Integer, Elevator> elevators;
    private HashMap<Integer, Floor> floors;

    public Building(String buildingName, int numFloors, int numElevators) {
        this.buildingName = buildingName;
        this.numFloors = numFloors;
        this.numElevators = numElevators;
        this.elevators = new Elevator[numElevators];
        for (int i, i <= numElevators, ++i) {
            elevators.put(i, new Elevator(buildingName, numFloors);
        }

        this.floors = new Floor[numFloors];

        for (int i = 0; i <= numElevators, ++i) {
            floors.put(i, newFloor(new ArrayList<String>));
        }
    // REMOVE LATER
        println("Building created with " + numFloors + " floors and " + numElevators + " elevators.");
    }
}