public class Test1 {
    public static void main(String[] args) {

        //create patient list
        PatientList list = new PatientList();

        //add patients to the list
        list.addPatient(new Patient(1, "Ferit", 3, 21));
        list.addPatient(new Patient(2, "Yağız", 5, 19));
        list.addPatient(new Patient(3, "Recep", 9, 78));
        list.addPatient(new Patient(4, "Fatma", 6, 32));
        list.addPatient(new Patient(5, "Ayşe", 1,9 ));

        //remove patient with id 2.
        list.removePatient(2);

        //search patient with id 4
        list.findPatient(4);

        //print the final list.
        System.out.println();
        System.out.println("Final list: ");
        list.printList();

    }
}