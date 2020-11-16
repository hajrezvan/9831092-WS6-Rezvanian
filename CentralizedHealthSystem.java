import java.util.ArrayList;

public class CentralizedHealthSystem {
    private ArrayList<MedicalRecord> medicalRecords;
    private ArrayList<Patient> patients;

    public void sendToUniversity() {

    }

    public void addToList(MedicalRecord record) {
        medicalRecords.add(record);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showOne(Patient patient) {

    }

    public void showAll() {

    }
}