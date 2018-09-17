import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/**
 *
 * @author gabrielfigueroa
 */
public class RecordImpl {

    public static void main(String[] args) {

        Collections.sort(getRecordsList(), Collections.reverseOrder());
        System.out.println(getRecordsList());

    }

    public static ArrayList<Records> getRecordsList() {

        Date date = new Date();
        ArrayList<Records> recordsList = new ArrayList<>();
        Records record1 = new Records();
        Records record2 = new Records();
        Records record3 = new Records();
        Records record4 = new Records();
        Records record5 = new Records();
        record1.setFileNumber("12345");
        record2.setFileNumber("12346");
        record3.setFileNumber("12347");
        record4.setFileNumber("12348");
        record5.setFileNumber("12349");
        record1.setFirstName("Charles");
        record2.setFirstName("Aisha");
        record3.setFirstName("John");
        record4.setFirstName("Isabelle");
        record5.setFirstName("Alexander");
        record1.setLastName("Doe");
        record2.setLastName("Doe");
        record3.setLastName("Doe");
        record4.setLastName("Doe");
        record5.setLastName("Doe");
        record1.setStartDate(date);
        record2.setStartDate(date);
        record3.setStartDate(date);
        record4.setStartDate(date);
        record5.setStartDate(date);
        record1.setSubject("Not all too long ago...");
        record2.setSubject("Not all too long ago...");
        record3.setSubject("Not all too long ago...");
        record4.setSubject("Not all too long ago...");
        record5.setSubject("Not all too long ago...");
        recordsList.add(record1);
        recordsList.add(record2);
        recordsList.add(record3);
        recordsList.add(record4);
        recordsList.add(record5);

        return recordsList;

    }
}
