public class DischargeStack {
    Node3 top;
    int cnt;
    int size;

    public DischargeStack(int size) {
        this.size = size;
        cnt=0;
        top = null;
    }

    void push(DischargeRecord record) { //Add a discharge record.

        if (isFull()) {

            System.out.println("Stack is full.");
        } else {

            Node3 element = new Node3(record);

            element.next = top;
            top = element;
            cnt++;

            System.out.println("Added: " + record.patientID);
        }
    }

    public void pop() { // Remove and return the top record.

        if (isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println(top.data.patientID + " popped");
            top = top.next;
            cnt--;
        }
    }

    void peek() { //View the most recent discharge without removing it.

        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element: " + top.data.patientID);
        }
    }

    private boolean isEmpty() { //It returns that the stack structure is empty.
        return cnt == 0;
    }

    private boolean isFull() {  //It returns that the stack structure is full.
        return cnt == size;
    }

    public void printStack() { // Print all discharge records.

        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            Node3 current = top;
            System.out.println("Top");
            while (current != null) {
                System.out.println(current.data.patientID);
                current = current.next;
            }
            System.out.println("Bottom");
        }
    }





}
