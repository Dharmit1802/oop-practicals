public class practical_23 {
    public static <T extends Comparable<T>> T findMinimum(T[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            throw new IllegalArgumentException("Invalid array");
        }

        T minElement = array[0][0];

        for (T[] row : array) {
            for (T element : row) {
                if (element.compareTo(minElement) < 0) {
                    minElement = element;
                }
            }
        }

        return minElement;
    }

    public static void main(String[] args) {
        Integer[][] intArray = {{5, 2, 9}, {1, 7, 3}, {4, 6, 8}};
        Integer minInteger = findMinimum(intArray);
        System.out.println("Minimum Integer: " + minInteger);

        Double[][] doubleArray = {{5.7, 2.1, 9.3}, {1.2, 7.8, 3.4}, {4.6, 6.9, 8.0}};
        Double minDouble = findMinimum(doubleArray);
        System.out.println("Minimum Double: " + minDouble);
    }
}

