/* Jeff Litterst
September 3, 2014
CSE2 Cylcometer Lab
This lab involves a man riding a bicycle.  The purpose of this lab is to 
record the time elapsed as well as the number of rotations of his tires 
during 2 given bike rides.
*/

// Create a class
public class Cyclometer {

    // Create main method
    public static void main (String [] args) {

        // Create variables for time elapsed and tire rotations for each bike ride
        int secsTrip1=480; // Time elapsed, in seconds, during the first trip
        int secsTrip2=3220; // Time elapsed, in seconds, during the second trip
        int rotationsTrip1=1561; // Number of tire rotations during the first trip
        int rotationsTrip2=9037; // Number of tire rotations during the second trip
        
        // Create constant variables that allow for calculation of the distance of the trips
        double wheelDiameter=27.0, // 
        PI=3.14159, //
        feetPerMile=5280, //
        inchesPerFoot=12, //
        secondsPerMinute=60; //
        double distanceTrip1, distanceTrip2, totalDistance; //
        
        // Print out the time, in minutes, elapsed in each trip and the number of rotations of the tires in each trip.
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+rotationsTrip1+" rotations. ");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+rotationsTrip2+" rotations. ");
        
        // Calculate the distance of each trip
        distanceTrip1=rotationsTrip1*wheelDiameter*PI; // Trip 1 distance in inches
        distanceTrip1/=inchesPerFoot*feetPerMile; // Trip 1 distance in miles
        distanceTrip2=rotationsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; // Trip 2 distance in miles
        totalDistance=distanceTrip1+distanceTrip2;
        // Print out the calculated distances
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    }
}