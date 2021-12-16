/*
* This program uses a custom class.
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2021-12-15
*/

/**
* This program uses a custom class.
*/
final class Main {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This is the main function.
    *
    * @param args this will not be used
    */
    public static void main(final String[] args) {

    }
}
