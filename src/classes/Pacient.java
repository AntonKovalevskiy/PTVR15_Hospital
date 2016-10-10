package classes;

public class Pacient extends Person {

    private String diagnos;
    private String department;
    private Date timeArrival;
    private Date timeOfDeparture;

    public Pacient(String firstname, String lastname, String code) {
        super(firstname, lastname, code);
    }

    public Pacient(String diagnos, String department, Date timeArrival, Date timeOfDeparture, String firstname, String lastname, String code) {
        super(firstname, lastname, code);
        this.diagnos = diagnos;
        this.department = department;
        this.timeArrival = timeArrival;
        this.timeOfDeparture = timeOfDeparture;
    }
    
    
}
