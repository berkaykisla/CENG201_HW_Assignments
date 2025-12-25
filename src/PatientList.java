public class PatientList {
    Node head; //first node of the list.

    public void addPatient(Patient p) { //add a patient end of the list.
        Node nNode = new Node(p);
        if (head == null) {
            head = nNode;
            return;

        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = nNode;
    }

    public void removePatient(int id) { //remove patient from the list by id.
        if (head == null) {
            System.out.println("This list is empty");
            return;
        }
        if (head.data.id == id) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data.id == id) {
            temp = temp.next;
        }
        if  (temp.next == null) {
            temp.next = temp.next.next;
        }
    }

    public Patient findPatient(int id) { //find and return patient's id.
        if (head == null) {
            System.out.println("This list is empty");
            return null;

        }

        Node temp = head;
        while (temp != null) {
            if (temp.data.id==id) {
                System.out.println("Patient found: " + temp.data);
                return temp.data;
            }

            temp = temp.next;

        }
        System.out.println("The patient ID number could not be found for this patient.");
        return null;


    }

    public void printList() { //print the list.
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;

        }

    }
}
