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
public class Truck extends Vehicle {
    /**
    * The license plate of the vehicle.
    */
    private static String licensePlate;

    public Truck(final String startColour, final int startMaxSpeed, final String startLicensePlate) {
        super(startColour, startMaxSpeed);
        licensePlate = startLicensePlate;
    }

    /**
    * Gets the licensePlate.
    *
    * @return returns the gotten license Plate
    */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
    * Sets the licensePlate.
    */
    public void setLicensePlate(final String newLicensePlate) {
        licensePlate = newLicensePlate;
    }

    /**
    * Applies the air brakes.
    *
    * @param amountOfAir this is the amount to which the brake has
    * been applied
    */
    public void provideAir(final int amountOfAir) {
        if (amountOfAir * 2 > super.getSpeed()) {
            System.out.println("Cannot use air brake that amount."
                               + " It is more than the speed");
        } else {
            super.speed = (super.getSpeed() - amountOfAir * 2);
        }
    }
}
