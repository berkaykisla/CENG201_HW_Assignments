public class HospitalTest {

    public static void main(String[] args) {

        HospitalSystem hs = new HospitalSystem();

        // add 10 patients
        hs.addingPatient(new Patient(1, "Ferit", 5, 21));
        hs.addingPatient(new Patient(2, "İrfan", 7, 32));
        hs.addingPatient(new Patient(3, "Mehmet", 9, 60));
        hs.addingPatient(new Patient(4, "Zeynep", 7, 25));
        hs.addingPatient(new Patient(5, "Can", 4, 50));
        hs.addingPatient(new Patient(6, "Elif", 8, 35));
        hs.addingPatient(new Patient(7, "Ahmet", 6, 40));
        hs.addingPatient(new Patient(8, "Fatma", 2, 70));
        hs.addingPatient(new Patient(9, "Kerem", 10, 28));
        hs.addingPatient(new Patient(10, "Merve", 1, 33));

        // add 5 normal treatment requests
        hs.addingTreatmentRequest(new TreatmentRequest(1), false);
        hs.addingTreatmentRequest(new TreatmentRequest(3), false);
        hs.addingTreatmentRequest(new TreatmentRequest(4), false);
        hs.addingTreatmentRequest(new TreatmentRequest(7), false);
        hs.addingTreatmentRequest(new TreatmentRequest(8), false);

        // add 3 priority treatment requests
        hs.addingTreatmentRequest(new TreatmentRequest(2), true);
        hs.addingTreatmentRequest(new TreatmentRequest(4), true);
        hs.addingTreatmentRequest(new TreatmentRequest(5), true);

        // add 2 discharge records
        hs.addingDischargeRecord(new DischargeRecord(9));
        hs.addingDischargeRecord(new DischargeRecord(10));

        // process 4 treatment requests
        hs.processTreatment();
        hs.processTreatment();
        hs.processTreatment();
        hs.processTreatment();

        // print final system state
        hs.printSystemState();
    }
}
