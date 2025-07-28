/**
 * The Student class represents a student who is a subclass of Person.
 * It stores additional information specific to students such as program, year, and fee.
 */
public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * Constructs a Student object with the specified details.
     *
     * @param name    the name of the student
     * @param address the address of the student
     * @param program the academic program the student is enrolled in
     * @param year    the current year of study
     * @param fee     the tuition fee
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * Returns the program the student is enrolled in.
     *
     * @return the academic program
     */
    public String getProgram() {
        return program;
    }

    /**
     * Returns the year of study.
     *
     * @return the year of study
     */
    public int getYear() {
        return year;
    }

    /**
     * Returns the tuition fee.
     *
     * @return the tuition fee
     */
    public double getFee() {
        return fee;
    }

    /**
     * Updates the student's academic program.
     *
     * @param program the new academic program
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * Updates the student's year of study.
     *
     * @param year the new year of study
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Updates the student's tuition fee.
     *
     * @param fee the new tuition fee
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * Returns a string representation of the Student object.
     *
     * @return a string representation of the student, including name, address, program, year, and fee
     */
    @Override
    public String toString() {
        return "Student[" + super.toString() + ",program=" + program + ",year=" + year
                + ",fee=" + fee + "]";
    }
}
