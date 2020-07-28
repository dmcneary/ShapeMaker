import java.util.Scanner;
/**
 *
 * @author mcneary.david
 */
public class ShapeMaker {
    static Shape[] shapesArray = new Shape[10];
    static String separator = "---------------";
    public static void main (String[] args) {
        System.out.println("Welcome to ShapeMaker!");
        menu();
        }
    
    public static void menu () {
        String select = "";
        Scanner input = new Scanner(System.in);
        
        System.out.println(separator);
        while (!select.equalsIgnoreCase("Q")) {
            select = "";
            System.out.println("What would you like to do?");
            System.out.println("[C]reate a new shape");
            System.out.println("[V]iew existing shapes");
            System.out.println("[Q]uit");
            System.out.println("(select using letter in brackets): ");
            select = input.next();
            //create a new shape
            if (select.equalsIgnoreCase("C")) {
                createShape();
            } else if (select.equalsIgnoreCase("V")) {
                listShapes();
            } else if (select.equalsIgnoreCase("Q")) {
                System.exit(0);
            } else {
                System.out.print("Invalid entry\n");
                menu();
            }
        }
    }
    
    public static void createShape () {
        String select = "";
        Scanner input = new Scanner(System.in);
        select = "";
        
        System.out.println(separator);
        System.out.println("Which shape would you like to make?");
        System.out.println("[C]ircle");
        System.out.println("[R]ectangle");
        System.out.println("[S]quare");
        System.out.println("[G]o back");
        System.out.println("(select using letter in brackets): ");
        select = input.next();
        if (select.equalsIgnoreCase("C")) {
            createCircle();
        }
        else if (select.equalsIgnoreCase("R")) {
            createRectangle();
        }
        else if (select.equalsIgnoreCase("S")) {
            createSquare();
        }
        else if (select.equalsIgnoreCase("G")) {
            menu();
        } else {
            System.out.println("Invalid entry...");
            createShape();
        }
    }
    
    public static void createCircle () {
        String select = "";
        Scanner input = new Scanner(System.in);
        double numInput = 0;
        int index;
    
        System.out.println(separator);
        System.out.println("Please enter a radius value:");
        numInput = input.nextDouble();
        Circle circle = new Circle(numInput);
        System.out.println("Created a new circle with radius " + numInput);
        System.out.println("Would you like to save this circle? (y/n): ");
        select = input.next();
        if (select.equalsIgnoreCase("Y")) {
            System.out.println("Please select a save slot (1-10): ");
            index = input.nextInt();
            shapesArray[index - 1] = circle;
            System.out.println("Circle saved to slot " + index);
            createShape();
        } else if (select.equalsIgnoreCase("N")) {
            System.out.println("Would you like to create a new circle? (y/n): ");
            select = input.next();
            if (select.equalsIgnoreCase("Y")) {  
                createCircle();
            } else if (select.equalsIgnoreCase("N")) {
                createShape();
            } else {
                System.out.println("Invalid entry, returning to main menu...");
                menu();
            }
        } else {
            System.out.println("Invalid entry, returning to main menu...");
            menu();
        }
    }
    
    public static void createRectangle () {
        String select = "";
        Scanner input = new Scanner(System.in);
        double numInput1 = 0;
        double numInput2 = 2;
        int index;
   
        System.out.println(separator);
        System.out.println("Please enter a length value:");
        numInput1 = input.nextDouble();
        System.out.println("Please enter a width value:");
        numInput2 = input.nextDouble();
        Rectangle rectangle = new Rectangle(numInput1, numInput2);
        System.out.println("Created a new rectangle with dimensions "
                    + numInput1
                    + " x "
                    + numInput2);
        System.out.println("Would you like to save this rectangle? (y/n): ");
        select = input.next();
        if (select.equalsIgnoreCase("Y")) {
            System.out.println("Please select a save slot (1-10): ");
            index = input.nextInt();
            shapesArray[index - 1] = rectangle;
            System.out.println("Rectangle saved to slot " + index);
            createShape();
        } else if (select.equalsIgnoreCase("N")) {
            System.out.println("Would you like to create a new rectangle? (y/n): ");
            select = input.next();
            if (select.equalsIgnoreCase("Y")) {
                createRectangle();
            } else if (select.equalsIgnoreCase("N")) {
                createShape();
            } else {
                System.out.println("Invalid entry, returning to main menu...");
                menu();
            }
        } else {
            System.out.println("Invalid entry, returning to main menu...");
            menu();
        }
    }
    
    public static void createSquare () {
        String select = "";
        Scanner input = new Scanner(System.in);
        double numInput = 0;
        int index;
    
        System.out.println(separator);
        System.out.println("Please enter a side value:");
        numInput = input.nextDouble();
        Square square = new Square(numInput);
        System.out.println("Created a new square with dimensions "
                + numInput
                + " x " 
                + numInput);
        System.out.println("Would you like to save this square? (y/n): ");
        select = input.next();
        if (select.equalsIgnoreCase("Y")) {
            System.out.println("Please select a save slot (1-10): ");
            index = input.nextInt();
            shapesArray[index - 1] = square;
            System.out.println("Square saved to slot " + index);
            createShape();
        } else if (select.equalsIgnoreCase("N")) {
            System.out.println("Would you like to create a new square? (y/n): ");
            select = input.next();
            if (select.equalsIgnoreCase("Y")) {
                createCircle();
            } else if (select.equalsIgnoreCase("N")) {
                createShape();
            } else {
                System.out.println("Invalid entry, returning to main menu...");
                menu();
            }
        } else {
            System.out.println("Invalid entry, returning to main menu...");
            menu();
        }
    }
    
    public static void listShapes () {
        for (int i = 0; i < shapesArray.length; i++) {
            if (shapesArray[i] != null) {
                System.out.println(separator);
                System.out.println("Slot "
                        + (i + 1)
                        + ": " 
                        + shapesArray[i].getClass().getName()
                );
                System.out.println("Area: " + shapesArray[i].getArea());
                System.out.println(separator);
            }
        }
    }
}
