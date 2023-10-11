import java.util.Scanner;
public class Main{
    public static void main (String [] args) {
/// The Vehicle blueprints
        Chevy traxBase = new Chevy(2023, 15.0, 25.0, 20000.0, "Trax", "White", false, false, false);
        Chevy traxLux = new Chevy(2023, 175.0, 25.0, 20000.0, "Trax", "White", true, true, false);
        Chevy corvetteClassic = new Chevy(1963, 123500, 13.5, 61500.0, "Corvette (Classic)", "Fire Red", true, false, false );
        Chevy corvetteSport = new Chevy(2020, 1500, 18.5, 58900.0, "Corvette (Sport)", "Fire Red", true, false, true);
        Chevy moonTesla = new Chevy(2021, 2000, 0, 69420.0, "Not a Chevy", "Silver", true, true, true);
        Chevy silverado = new Chevy(1990, 15000, 16.5, 37850.0, "Silverado", "Blue", true, true, false);
/// Intro
        System.out.println("Hello, Welcome to the Chevorlet Dealership\n\n" + "\tHere are some of our cars:");
/// Car Display
        traxBase.calcPrice();
        traxLux.calcPrice();
        corvetteClassic.calcPrice();
        corvetteSport.calcPrice();
        moonTesla.calcPrice();
        silverado.calcPrice();

        System.out.println(corvetteSport.toString());
        System.out.println(corvetteClassic.toString());
        System.out.println(moonTesla.toString());
        System.out.println(silverado.toString());
        System.out.println(traxBase.toString());
        System.out.println(traxLux.toString());
/// Compare program
        System.out.println("\t\t*** Compare By MIleage***");
        System.out.println("\t\t\tCorvette Classic vs. Corvette Sport");
        System.out.print("\t\t\tWhich car has the least miles\n");
        System.out.print("\t");
        int result = corvetteClassic.compareTo(corvetteSport);
        if (result < 0) {
            System.out.println("The Chevorlet Corvette (Classic) has lower mileage than The Chevorlet Corvette (Sport).\n");
        }
        else if (result > 0) {
            System.out.println("The Chevorlet Corvette (Classic) has higher mileage than The Chevorlet Corvette (Sport).\n");
        }
        else {
            System.out.println("The Chevorlet Corvette (Classic) and Chevorlet Corvette (Sport) have the same mileage.\n");
        }
/// equal program
        System.out.println("\t\t*** Check Equality ***");
        System.out.println("\t\t\tBase Trax vs. Luxury Trax");
        System.out.print("\t\t\tStatus:  ");
        boolean kaige = traxLux.equals(traxBase);
        if (kaige) {
            System.out.println("Same car");
        }
        else
        {
            System.out.println("Not Same Car");
        }
///Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("What car are you interested in?");
        String car = scanner.nextLine();
        System.out.println("What color is the car?");
        String color = scanner.nextLine();
        System.out.println("What year is the car?");
        int year = scanner.nextInt();
        System.out.println("What it's mileage?");
        int miles = scanner.nextInt();
        System.out.println("What is the price of it?");
        double price = scanner.nextDouble();
        System.out.println("Does it have Sport package?");
        boolean sportPackage = scanner.nextBoolean();
        System.out.println("Does it have 4WD?");
        boolean fourWhDrPackage = scanner.nextBoolean();
        System.out.println("Does it have a Luxury package?");
        boolean luxuryPackage = scanner.nextBoolean();
        Chevy userCar = new Chevy(year, miles, 0.0, price,
                car, color, luxuryPackage, fourWhDrPackage, sportPackage);
        System.out.println(userCar.toString());
    }
}
