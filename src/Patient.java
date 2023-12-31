import java.util.Date;

public class Patient {
    static int id = 0;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public Patient (String name, String email){
        id++;
        this.name = name;
        this.email = email;
        System.out.println("Patient's name: " + name + "email: " + email);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getWeight() {
        return this.weight + " Kg.";
    }
}
