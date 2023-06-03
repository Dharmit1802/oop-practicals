import java.util.PriorityQueue;

public class practical_24<E> extends PriorityQueue<E> implements Cloneable {
    @Override
    public practical_24<E> clone() {
        practical_24<E> clonedQueue = new practical_24<>();
        clonedQueue.addAll(this);
        return clonedQueue;
    }

    public static void main(String[] args) {
        practical_24<Integer> originalQueue = new practical_24<>();
        originalQueue.add(5);
        originalQueue.add(2);
        originalQueue.add(8);

        practical_24<Integer> clonedQueue = originalQueue.clone();

        System.out.println("Original Queue: " + originalQueue);
        System.out.println("Cloned Queue: " + clonedQueue);
    }
}
