package test_1;
import java.util.*;

public class Unique_Email {
    public static void main(String[] args) {
        Unique_Email a = new Unique_Email();
        String[] emails = {
                "test.email+james@coding.com",
                "test.e.mail+toto.jane@cod.ing.com",
                "testemail+tom@cod.ing.com"};

        System.out.println(a.solve_1(emails));
        System.out.println(a.solve_split(emails));

    }

    public int solve_1(String[] emails) {
        //1
        Set<String> set = new HashSet<>(); //중복x

        //2
        for(String email : emails) {
            String localName = makeLocalName(email);
            String dName = makeDName(email);

            set.add(localName+'@'+dName);
        }

        return set.size();

    }
    //2. split
    public int solve_split(String[] emails) {
        //"test.e.mail+toto.jane@cod.ing.com",
        Set<String> set = new HashSet<>();

        for(String email : emails) {
            String[] parts = email.split("@");
            String[] localName = parts[0].split("\\+");
            set.add(localName[0].replace(".","")+ "@" + parts[1]);
        }
        return set.size();
    }

    private String makeLocalName(String email) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<email.length(); i++) {

            if(email.charAt(i) == '.') {
                continue;
            }
            if(email.charAt(i) == '+' || email.charAt(i) == '@') {
                break;
            }
            sb.append(email.charAt(i));
        }
        return sb.toString();
    }

    private String makeDName(String email) {

        return email.substring(email.indexOf('@')+1);
    }






}
