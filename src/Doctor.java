public class Doctor {
    static int id = 0;
    String email;
    String name;
    String speciality;

    public Doctor() {
        System.out.println("Building Doctor Object");
    }
    public Doctor (String name, String speciality){
        id++;
        this.name = name;
        this.speciality = speciality;
        System.out.println("Doctor's Name is: " + name + "Speciality: " + speciality);
    }

    public void showName() {
        System.out.println(name);
    }
    public void showId() {
        System.out.println("Doctor's id: " + id);
    }
}
