public class Salesperson {
    private int salespersonId;
    private String name;
    private String phoneNumber;
    private String email;
    // constructors
    public Salesperson(int salespersonId, String name, String phoneNumber, String email) {
    this.salespersonId = salespersonId;
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.email = email;
    }

    // getters and setters
    public int getSalespersonId() {
        return salespersonId;
    }

    public void setSalespersonId(int salespersonId) {
        this.salespersonId = salespersonId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
