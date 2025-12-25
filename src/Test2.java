public class Test2 {
    public static void main(String[] args) {
        // create treatment queue.
        TreatmentQueue queue = new TreatmentQueue(10);


        // add treatment requests.
        queue.enqueue(new TreatmentRequest(1));
        queue.enqueue(new TreatmentRequest(2));
        queue.enqueue(new TreatmentRequest(3));
        queue.enqueue(new TreatmentRequest(4));
        queue.enqueue(new TreatmentRequest(5));
        queue.enqueue(new TreatmentRequest(6));
        queue.enqueue(new TreatmentRequest(7));
        queue.enqueue(new TreatmentRequest(8));


        // remove first three requests.
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        //print final queue.
        queue.printQueue();


    }
}
