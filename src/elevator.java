 class Elevator {
    private int currentFloor;
    private boolean DoorsOpen;
    private int TotalFloors;
    private List<int> floorRequests;
    public String BuildingName;

    public void addFloorRequest(int Floor) {
        if (Floor > TotalFloors || Floor < 0) {
            throw new IllegalArgumentException("Floor exceeds total floors");
        }
        else floorRequests.add(Floor);
        / REMOVE LATER
        System.out.println("Floor " + Floor + " added to requests.");
    }

    public int getFloorRequest(int Floor) {
        return currentFloor
    }

    public void setCurrentFloor(int Floor) {
        if (Floor > TotalFloors || Floor < 0) {
            throw new IllegalArgumentException("Floor exceeds total floors");
        }
        else {
            currentFloor = Floor;
            / REMOVE LATER
            System.out.println("Current floor set to " + Floor);
        }
    }

    public void printFloorRequests() {
        for (int floor : floorRequests) {
            System.out.println("Requested Floor: " + floor);
        }
    }

    public void openDoors() {
        DoorsOpen = true;
        / REMOVE LATER
        System.out.println("Doors are now open.");
    }

    public void closeDoors() {
        DoorsOpen = false;
        / REMOVE LATER
        System.out.println("Doors are now closed.");
    }
 }