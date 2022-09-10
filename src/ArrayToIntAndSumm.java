public class ArrayToIntAndSumm {

    public static void checkArray(String[][] myArray) {

        try {
            MyArraySizeException.checkArray(myArray);
        } catch (MyArraySizeException e) {
            throw new RuntimeException(e);
        }

        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                try {
                    sum = sum + Integer.parseInt(myArray[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        System.out.println("Sum of the Array: " + sum);
    }
}
