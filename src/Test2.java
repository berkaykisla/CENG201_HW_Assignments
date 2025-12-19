public class Test2 {
    public static void main(String[] args) {
        TreatmentQueue queue = new TreatmentQueue(10);

        queue.enqueue(new TreatmentRequest(1));
        queue.enqueue(new TreatmentRequest(2));
        queue.enqueue(new TreatmentRequest(3));
        queue.enqueue(new TreatmentRequest(4));
        queue.enqueue(new TreatmentRequest(5));
        queue.enqueue(new TreatmentRequest(6));
        queue.enqueue(new TreatmentRequest(7));
        queue.enqueue(new TreatmentRequest(8));

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.printQueue();


    }
}
