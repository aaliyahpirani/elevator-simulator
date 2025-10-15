public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of floors in the building:");
        int numFloors = scanner.nextInt();

        System.out.println("Enter the number of elevators in the building:");
        int numElevators = scanner.nextInt();

        Building building = new Building(numFloors, numElevators);

        System.out.println("Welcome to the elevator simulator!");
        boolean running = true;
        while (running) {
            System.out.println("You are currently on floor " + building.getCurrentFloor());
            System.out.println("Enter the floor you want to go to:");
            int requestedFloor = scanner.nextInt();

            if (requestedFloor == "q") {
             running = false;
            }

            else {
                moveToNextRequestedFloor( int requestedFloor, Building building,int elevatorNum);
            }
            // Needs implementation but building needs to be implemented first to initialize
            // elevators and floors in buidling contructor

        }

    }
}