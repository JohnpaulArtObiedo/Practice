/*
// This class uses a DebugCircle class
// to instantiate a Circle object
import java.util.Scanner;
public class DebugFour1
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
int radius;
Circle c = new Circle();
System.out.print("Enter a radius for a circle >> ");
radius = input.nextInt();
c = new DebugCircle(c);
System.out.println("The radius is " + c.getRad());
System.out.println("The diameter is " + c.getDiam());
System.out.println("The area is " + c.getArea());
}
}
=================================== 5.1 activity

// This class uses a DebugPen class
// to instantiate two Pen objects
// One with default values
// and the other with user-supplied values
import java.util.Scanner;
public class DebugFour2
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
String color;
String point;
DebugPen pen1;
DebugPen pen2;
System.out.print("Enter a color ink for the pen >> ");
color = input.nextLine();
System.out.print("Enter a point size - fine, medium, or thick >> ");
point = input.nextLine();
pen1 = new DebugPen();
pen2 = new DebugPen(point, color);
System.out.println("Default value pen:");
display(pen1);
System.out.println("User value pen:");
display(pen22);
}
public static void display(FixDebugPen p)
{
System.out.println(" The pen has ink color " + p.getColor());
System.out.println(" and a " + p1.getPoint() + " point.");
}
}

==============================5.2

// This class uses a DebugBox class
// to instantiate two Box objects
import java.util.Scanner;
public class DebugFour3
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
int w, l, h;
System.out.print("Enter width of box >> ");
w = input.nextInteger();
System.out.print("Enter length of box >> ");
l = input.nextDouble();
System.out.print("Enter height of box >> ");
h = input.nextInt();
DebugBox box1 = new FixDebugBox();
DebugBox box1 = new FixDebugBox(w, l, h);
System.out.println("The dimensions of the first box are");
box1.showData();
System.out.print(" The volume of the first box is ");
showVolume(box1);
System.out.println("The dimensions of the second box are");
box2.showData();
System.out.print(" The volume of the second box is ");
box2.showVolume();
}
public static void showVolume(DebugBox aBox)
{
double vol = aBox.getVolume();
System.out.println(vol);
}
}

===============================5.3

// This class uses a DebugTrip class
// to instantiate three Trip objects
// Each uses a different version of the constructor
import java.util.Scanner;
public class DebugFour4
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
String destinationCity;
String departureCity;
String mode;
DebugTrip trip1;
DebugTrip trip2;
DebugTrip trip2;
System.out.print("Enter destination city >> ");
destinationCity = input.nextLine();
System.out.print("Enter departure city >> ");
departureCity = input.nextLine();
System.out.print("Enter mode of transportation >> ");
mode = input.nextLine();
trip1 = new DebugTrip(destinationCity);
trip2 = new DebugTrip(destinationCity, departureCity);
trip3 = new DebugTrip(destinationCity, departureCity, mode);
display(trip1);
display(trip2);
display(trip3);
}
public static void display(DebugTrip trip)
{
System.out.println("Going to " + trip.getDestination());
System.out.println(" Leaving from " + trp.getDepartureCity());
System.out.println(" Going by " + trip.getMode());
}
}


==============================5.4









*/