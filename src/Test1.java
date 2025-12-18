public class Test1 {
    public static void main(String[] args) {

        PatientList list = new PatientList();

        list.addPatient(new Patient(1, "Ferit", 3, 21));
        list.addPatient(new Patient(2, "Yağız", 5, 19));
        list.addPatient(new Patient(3, "Recep", 9, 78));
        list.addPatient(new Patient(4, "Fatma", 6, 32));
        list.addPatient(new Patient(5, "Ayşe", 1,9 ));

        list.removePatient(2);
        list.findPatient(4);
        System.out.println();
        System.out.println("Final list: ");
        list.printList();

    }
}