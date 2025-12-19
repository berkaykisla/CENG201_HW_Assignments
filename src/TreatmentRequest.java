public class TreatmentRequest {
    int patientID; // ID of the patient requesting treatment.
    long arrivalTime; // Timestamp of the request (System.currentTimeMillis()).

    public TreatmentRequest(int patientID) {
        this.patientID = patientID;
        this.arrivalTime = System.currentTimeMillis();


    }

    public String toString() {
        return patientID + " " + arrivalTime;


    }


}
