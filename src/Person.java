public class Person {

  private String name;
  private String permanentAddress;
  private String contact;
  private String email;

  public Person(String name, String permanentAddress, String contact, String email) {
    this.name = name;
    this.permanentAddress = permanentAddress;
    this.contact = contact;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPermanentAddress() {
    return permanentAddress;
  }

  public void setPermanentAddress(String permanentAddress) {
    this.permanentAddress = permanentAddress;
  }

  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  
}
