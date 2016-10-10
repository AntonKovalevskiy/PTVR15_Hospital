package classes;

import java.util.List;

public class Department {

    private String name;
    private List<Doktor> doctors;
    private List<Nurse> nurses;
    private List<Pacient> pacients;
    private List<Sanitar> sanitars;
    private List<Palata> palats;

    public Department() {
    }

    public Department(String name, List<Doktor> doctors, List<Nurse> nurses, List<Pacient> pacients, List<Sanitar> sanitars, List<Palata> palats) {
        this.name = name;
        this.doctors = doctors;
        this.nurses = nurses;
        this.pacients = pacients;
        this.sanitars = sanitars;
        this.palats = palats;
    }

    
    
    public void untitledMethod() {
    }

    public void untitledMethod1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Doktor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doktor> doctors) {
        this.doctors = doctors;
    }

    public List<Nurse> getNurses() {
        return nurses;
    }

    public void setNurses(List<Nurse> nurses) {
        this.nurses = nurses;
    }

    public List<Pacient> getPacients() {
        return pacients;
    }

    public void setPacients(List<Pacient> pacients) {
        this.pacients = pacients;
    }

    public List<Sanitar> getSanitars() {
        return sanitars;
    }

    public void setSanitars(List<Sanitar> sanitars) {
        this.sanitars = sanitars;
    }

    public List<Palata> getPalats() {
        return palats;
    }

    public void setPalats(List<Palata> palats) {
        this.palats = palats;
    }
}
