import java.util.HashMap;

public class HospitalSystem {
    // lets combine and move classes from other tasks.
    PatientList ptlist = new PatientList();
    TreatmentQueue tqueue1 = new TreatmentQueue(20);
    TreatmentQueue tqueue2= new TreatmentQueue(20);
    DischargeStack dstack= new DischargeStack(20);


    //  Using HashMap for searching
    HashMap<Integer, Patient> patientMap = new HashMap<>();

    public void addingPatient(Patient p){
        ptlist.addPatient(p);
        patientMap.put(p.id, p);
    }

    // add treatment request
    public void addingTreatmentRequest(TreatmentRequest tr, boolean neccesity) {
        if (neccesity) {
            tqueue1.enqueue(tr); // emergency queue
        }
        else{
            tqueue2.enqueue(tr); //normal queue
        }
    }


    // push discharge to stack
    public void addingDischargeRecord(DischargeRecord dr) {
        dstack.push(dr);
    }

    // process treatment request
    public void processTreatment() {

        if (tqueue1.size() > 0) {
            TreatmentRequest tr = tqueue1.front.data;
            tqueue1.dequeue();
            dstack.push(new DischargeRecord(tr.patientID));

        } else if (tqueue2.size() > 0) {
            TreatmentRequest tr = tqueue2.front.data;
            tqueue2.dequeue();
            dstack.push(new DischargeRecord(tr.patientID));

        } else {
            System.out.println("No treatment found.");
        }
    }

    // sort patients by severity value
    public void sortingPatients() {

        Patient[] arr = patientMap.values().toArray(new Patient[patientMap.size()]);

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].severity < arr[j + 1].severity) {
                    Patient temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // print sorted patients

        System.out.println("Sorted patients: ");
        for (Patient p : arr) {
            System.out.println(
                    "ID: " + p.id +
                            " Name: " + p.name +
                            " Severity: " + p.severity +
                            " Age: " + p.age
            );
        }

        // print all system state
    }
    public void printSystemState() {

        System.out.println("------ SYSTEM STATE ------");

        System.out.println("Patients in hospital:");
        ptlist.printList();

        System.out.println();
        System.out.println("Emergency requests:");
        tqueue1.printQueue();

        System.out.println();
        System.out.println("Waiting normal patients:");
        tqueue2.printQueue();

        System.out.println();
        System.out.println("Discharged patients info:");
        dstack.printStack();

        System.out.println("--------------------------");
    }



}
