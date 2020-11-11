import java.util.ArrayList;

public class Patient {
    private MedicalRecord medicalRecord;
    private boolean permission;
    private ArrayList<Sickness> sicknesses;

    public boolean isPermission() {
        return permission;
    }

    public void setPermission(boolean permission) {
        this.permission = permission;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public ArrayList<Sickness> getSicknesses() {
        return sicknesses;
    }

    public void addSickness(Sickness sickness) {
        sicknesses.add(sickness);
    }
}
