package sample;

public class JogadaUtils {

    public static int[] IntegerArrayToInt(Integer[] IntegerArray) {
        int[] intArray = new int[IntegerArray.length];
        for (int i = 0; i < intArray.length; i++) {
            Integer integerNumber = IntegerArray[i];
            if (integerNumber != null) {
                intArray[i] = integerNumber;
            } else {
                intArray[i] = -99;
            }
        }
        return intArray;
    }

    public static Integer[] IntArrayToInteger(int[] intArray) {
        Integer[] integerArray = new Integer[intArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            int intNumber = intArray[i];
            if (intNumber != -99) {
                integerArray[i] = intNumber;
            } else {
                integerArray[i] = null;
            }
        }
        return integerArray;
    }

    public static int IntegerToInt(Integer integerNumber) {
        if (integerNumber != null) {
            return integerNumber;
        } else {
            return -99;
        }
    }

    public static Integer IntToInteger(int intNumber) {
        if (intNumber != -99) {
            return intNumber;
        } else {
            return null;
        }
    }
}
