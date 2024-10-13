import java.util.Scanner;

class FlightBooking {
  public String flightId = "OOP24";
  private static int initialSeatCount = 180; // Stores initial seat count
  private static int seatAvailable = initialSeatCount; // Tracks current seat count

  public static void bookTicket(int userId) {
    if (seatAvailable > 0) {
      seatAvailable--;
      System.out.println("[Seat Available: " + seatAvailable + "]");
    } else {
      System.out.println("No seat available.");
    }
  }

  public static void confirmBooking(int userId) {
    System.out.println("--User " + userId + " Confirmed--[Seat Available: " + seatAvailable + "]");
  }

  public static void cancelBooking(int userId) {
    seatAvailable++;
    System.out.println("[Seat Available: " + seatAvailable + "]");
  }

  // Method to reset seatAvailable to initial count
  public static void resetSeats() {
    seatAvailable = initialSeatCount;
  }
}

public class Lab02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine(); // Consume newline character

    while (t-- > 0) {
      FlightBooking.resetSeats();

      String[] actions = sc.nextLine().split("\\s+");
      for (int i = 0; i < actions.length - 1; i += 2) {
        int userId = Integer.parseInt(actions[i]);
        String task = actions[i + 1];
        switch (task) {
          case "Booking":
            FlightBooking.bookTicket(userId);
            break;
          case "Confirmed":
            FlightBooking.confirmBooking(userId);
            break;
          case "Cancel":
            FlightBooking.cancelBooking(userId);
            break;
          default:
            System.out.println("Invalid task: " + task);
        }
      }
      System.out.println();
      // Reset seatAvailable after each test case
    }
    sc.close();
  }
}
