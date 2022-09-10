public class MyArrayDataException extends NumberFormatException  {

    MyArrayDataException(int i, int j) {

        System.out.println("The symbol in coordinates i[" + i + "] j[" + j + "] can't converted to INT");

    }
}
