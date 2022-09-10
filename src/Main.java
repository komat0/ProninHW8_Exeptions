public class Main {

    /**
     *     1 Write a method that takes a two-dimensional 4x4 string array as input. At
     *     serving an array of a different size must throw a MyArraySizeException.
     *     2 Next, the method must go through all the elements of the array, convert to int and
     *     sum up. If the conversion fails in some element of the array (for example, in cell contains a
     *     character or text instead of a number), an exception should be thrown
     *     MyArrayDataException detailing which cell contains invalid data.
     *     3 In the main() method, call the received method, handle possible exceptions
     *     MyArraySizeException and MyArrayDataException and display the result of the calculation.
     */

    public static void main(String[] args) {

        ArrayToIntAndSumm.checkArray(Array.myArray);

    }
}