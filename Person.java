/**
 * The Person class represents a general person with a name and address.
 * This class serves as a base class for more specific types such as Student or Staff.
 */
public class Person {
    private String name;
    private String address;

    /**
     * Constructs a Person object with the given name and address.
     *
     * @param name    the person's name
     * @param address the person's address
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Returns the name of the person.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Updates the person's name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the address of the person.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Updates the person's address.
     *
     * @param address the new address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns a string representation of the Person object.
     *
     * @return a string in the format Person[name=...,address=...]
     */
    @Override
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}
