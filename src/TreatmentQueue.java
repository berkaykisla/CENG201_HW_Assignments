import java.util.concurrent.TransferQueue;

public class TreatmentQueue {
    Node2 front;
    Node2 rear;
    int cnt;
    int size;

    public TreatmentQueue(int size) {
        this.size = size;
        cnt = 0;
        front = null;
        rear = null;
    }

    public void enqueue (TreatmentRequest request) { // Add a new treatment request to the queue.

        if (isFull()) {
            System.out.println("Queue is full.");
        } else {
            Node2 element =  new Node2(request);
            if (isEmpty()) {
                front = element;
                rear = element;
                System.out.println("First request added: " + request.patientID);
            } else {
                rear.next = element;
                rear = element;
            }
            cnt++;
        }

    }

    public void dequeue() { //Remove and return the first treatment request.
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {

            System.out.println("Removed request: " + front.data.patientID);
            front = front.next;
            cnt--;
        }
    }

    private boolean isEmpty() { //It returns that the queue structure is empty.

        return cnt == 0;
    }

    private boolean isFull() {  //It returns that the queue structure is full.

        return cnt == size;
    }

    int size() { //Returns the size of the queue structure.

        return cnt;
    }


    public void printQueue() { //Print all requests in the queue.


        if (isEmpty()) {
            System.out.println("Queue is empty.");

        } else {

            Node2 current = front;
            System.out.print("Front <- ");
            while (current != null) {

                System.out.print(current.data.patientID + " <- ");
                current = current.next;
            }
            System.out.println("Rear");
        }
    }



}
