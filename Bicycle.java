/*
* This is the class file
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2021-12-15
*/

/**
* This is the class that contains many functions.
*/
public class Bicycle extends Vehicle {
    /**
    * The license plate of the vehicle.
    */
    private static int cadence;

    /**
    * Calls the constructor of Airplane, Jet's superclass.
    */
    public Bicycle(final String startColour, final int startMaxSpeed) {
        super(startColour, startMaxSpeed);
        cadence = 0;
    }

    /**
    * Gets the cadence.
    */
    public int getCadence() {
        return cadence;
    }

    /**
    * Sets the cadence.
    */
    public void setCadence(final int newCadence) {
        cadence = newCadence;
    }

    /**
    * Rings the bell of the bike.
    */
    public void ringBell() {
        System.out.println("Ring!");
    }

}
