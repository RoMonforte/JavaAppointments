public class Doctor {
    static int id = 0;
    String name;
    String speciality;

    Doctor() {
        System.out.println("Building Doctor Object");
        id++;
    }
    Doctor (String name){
        System.out.println("Doctor's Name is: " + name);
    }

    public void showName() {
        System.out.println(name);
    }
    public void showId() {
        System.out.println("Doctor's id: " + id);
    }
}
