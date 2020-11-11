import java.util.ArrayList;

public class Doctor {
    private boolean access;
    private ArrayList<Sickness> sicknesses;

    public boolean isAccess() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }

    public ArrayList<Sickness> getSicknesses() {
        return sicknesses;
    }

    public void setSicknesses(ArrayList<Sickness> sicknesses) {
        this.sicknesses = sicknesses;
    }

    public void referToAnother() {

    }
}
