    public class PatientList {

        // first node of the list
        Node root;


        public void addPatient(Patient p) {
            Node newNode = new Node(p);
            if (root == null) {
                root = newNode;
                return;

            }
            Node current = root;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }


        public void removePatient(int id) {
            if (root == null) {
                System.out.println("List is empty");
                return;
            }
            if (root.data.id == id) {
                root = root.next;
                return;
            }
            Node temp = root;
            while (temp.next != null && temp.next.data.id == id) {
                temp = temp.next;
            }
            if  (temp.next == null) {
                temp.next = temp.next.next;
            }
        }


        public Patient findPatient(int id) {
            if (root == null) {
                System.out.println("This list is empty");
                return null;

            }

            Node temp = root;
            while (temp != null) {
                if (temp.data.id==id) {
                    System.out.println("Patient found: " + temp.data);
                    return temp.data;
                }

                temp = temp.next;

            }
            System.out.println("Patient not found.");
            return null;


        }

        public void printList() {
            Node temp = root;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;

            }

        }
    }
