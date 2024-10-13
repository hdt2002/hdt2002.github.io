import java.text.DecimalFormat;
import java.util.Scanner;

class Car {
    static double maxSalePrice = 0;
    double price;
    int year;

    Car(double price, int year) {
        this.price = price;
        this.year = year;
    }

    void calculateSalePrice() {}

    String toStringFormat() {
        DecimalFormat formatter = new DecimalFormat("#,###,###.00");
        return String.format("Price: %s VND | Year: %d", formatter.format(price), year);
    }
}

class SportCar extends Car {
    SportCar(double price, int year) {
        super(price, year);
    }

    @Override
    void calculateSalePrice() {
        if (year > 2018)
            price *= 0.8;
        else if (2018 > year && year > 2010)
            price *= 0.5;
        else
            price *= 0.1;


        // Update maxSalePrice if necessary
        if (price > maxSalePrice)
            maxSalePrice = price;
    }
}

class ClassicCar extends Car {
    ClassicCar(double price, int year) {
        super(price, year);
    }

    @Override
    void calculateSalePrice() {
        price *= 1.12; // Add 12% tax in Hanoi
        price += 20000000; // Registration fee

        // Update maxSalePrice if necessary
        if (price > maxSalePrice)
            maxSalePrice = price;
    }
}

public class AbtractClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        for (int i = 0; i < testCases; i++) {
            String[] carData = scanner.nextLine().split(" ");
            String carType = carData[0];
            double price = Double.parseDouble(carData[1]);
            int year = Integer.parseInt(carData[2]);

            Car car;
            if (carType.equals("SC")) {
                car = new SportCar(price, year);
            } else {
                car = new ClassicCar(price, year);
            }

            car.calculateSalePrice();
            System.out.println(car.toStringFormat());
        }

        // Output the most expensive car
        DecimalFormat formatter = new DecimalFormat("#,###,###.00");
        System.out.printf("Most Expensive: %s VND\n", formatter.format(Car.maxSalePrice));
        scanner.close();
    }
}