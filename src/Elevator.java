import Math;

class Elevator {
    private static int currentFloor;
    private boolean DoorsOpen;
    private int TotalFloors;
    private List<int> floorRequests;
    public String BuildingName;

    public Elevator (String BuildingName, int TotalFloors) {
        this.BuildingName = BuildingName;
        this.TotalFloors = TotalFloors;
        this.currentFloor = 0;
        DoorsOpen = false;
        floorRequests = new ArrayList<int>();
    }

    public void addFloorRequest(int Floor) {
        if (Floor > TotalFloors || Floor < 0) {
            throw new IllegalArgumentException("Floor exceeds total floors");
        }
        else floorRequests.add(Floor);
        // REMOVE LATER
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
            // REMOVE LATER
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
        // REMOVE LATER
        System.out.println("Doors are now open.");
    }

    public void closeDoors() {
        DoorsOpen = false;
        // REMOVE LATER
        System.out.println("Doors are now closed.");
    }

    public void removeFloorRequest(int floor) {
        if floorRequests.contains(floor) {
            floorRequests.remove(Integer.valueOf(floor));
            //REMOVE LATER
            System.out.println("Floor " + floor + " removed from requests.");
        }
        else {
            throw new IllegalArgumentException("Floor not in requests");

        }
    }

    public void moveToNextRequestedFloor(int newFloor) {
        System.out.println("Moving from floor " + currentFloor + " to floor " + newFloor);

        Thread.sleep(Math.abs(newFloor - currentFloor) * 1000 + 3000);

        setCurrentFloor(newFloor);

        System.out.println("Arrived at floor " + newFloor);

        removeFloorRequest(newFloor);

    }
 }