public class DischargeRecord {
    int patientID; //ID of the discharged patient.
    long dischargeTime; //Timestamp of discharge.

    public DischargeRecord(int patientID) {
        this.patientID = patientID;
        this.dischargeTime = System.currentTimeMillis();

    }

    public String toString() {
        return patientID + " " + dischargeTime;
    }

}
