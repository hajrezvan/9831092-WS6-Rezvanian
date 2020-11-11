public class Drugstore {
    private MedicalRecord medicalRecord;

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public Medicine givingMedicine() {
        return new Medicine();
    }
}