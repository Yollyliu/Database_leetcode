import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {
    public int numUniqueEmailsOne(String[] emails) {
        Set<String> seen = new HashSet();
        for (String email: emails) {
            int i = email.indexOf('@');
            String local = email.substring(0, i);
            String rest = email.substring(i);
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf('+'));
            }
            local = local.replaceAll(".", "");
            seen.add(local + rest);
        }

        return seen.size();
    }

    public int numUniqueEmailsTwo(String[] emails) {
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < emails.length; i++) {
            set.add(emailParsing(emails[i]));
        }
        return set.size();
    }
    public String emailParsing(String email) {
        String[] strs = email.split("@");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            if (strs[0].charAt(i) == '.') {
                continue;
            } else if (strs[0].charAt(i) == '+') {
                break;
            } else {
                sb.append(strs[0].charAt(i));
            }
        }
        sb.append("@");
        sb.append(strs[1]);
        return sb.toString();
    }
}
