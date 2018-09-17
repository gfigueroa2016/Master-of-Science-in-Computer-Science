public class RecordModel implements Comparable {

    private String fileNumber;
    private String lastName;
    private String firstName;
    private Date startDate;
    private String subject;

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public String getFileNumber() {
        return fileNumber;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Record Number : " + fileNumber + "\n" + "Last Name : " + lastName + "\n" + "First Name : " + firstName
                + "\n" + "Start Date : " + startDate + "\n" + "Subject = : " + subject + "\n";
    }

    @Override
    public int compareTo(Object r) {
        return (((Records) r).getFileNumber()).compareTo(this.getFileNumber());
    }

}