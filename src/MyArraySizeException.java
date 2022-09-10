public class MyArraySizeException extends Throwable {

    public static void checkArray(String[][] myArray) throws MyArraySizeException {
        int arrLenght = 4;

        if (myArray.length != arrLenght) {
            System.out.println("Incorrect Array Size");
            throw new MyArraySizeException();
        }

        for (String[] insideArr : myArray) {
            if (insideArr.length != arrLenght) {
                System.out.println("Incorrect Array of Array Size");
                throw new MyArraySizeException();
            }
        }
    }
}
