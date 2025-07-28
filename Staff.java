/**
 * The Staff class represents a staff member who is a subclass of Person.
 * It stores information such as the school they work for and their pay.
 */
public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * Constructs a Staff object with only name and address.
     *
     * @param name    the name of the staff member
     * @param address the address of the staff member
     */
    public Staff(String name, String address) {
        super(name, address);
    }

    /**
     * Constructs a Staff object with name, address, school, and pay.
     *
     * @param name    the name of the staff member
     * @param address the address of the staff member
     * @param school  the school the staff member works at
     * @param pay     the salary of the staff member
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * Returns the school the staff member works at.
     *
     * @return the school name
     */
    public String getSchool() {
        return school;
    }

    /**
     * Updates the school where the staff member works.
     *
     * @param school the new school name
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * Returns the salary of the staff member.
     *
     * @return the salary
     */
    public double getPay() {
        return pay;
    }

    /**
     * Updates the salary of the staff member.
     *
     * @param pay the new salary
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * Returns a string representation of the Staff object.
     *
     * @return a string including the staff's personal and job details
     */
    @Override
    public String toString() {
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
    }
}
