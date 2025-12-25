public class Patient { //patient informations
    int id;
    String name;
    int severity;
    int age;

    public Patient(int id, String name, int severity, int age) { //consturactor for Patient
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.age = age;



    }

    public String toString() { //prints the patient's information
        return id + " " + name + " " + severity + " " + age;

    }



}
