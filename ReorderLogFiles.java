import java.util.*;

public class ReorderLogFiles {

    public static void main(String[] args) {

    }
    public static String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (log1, log2) -> {
            String[] split1 = log1.split(" ", 2);
            String[] split2 = log2.split(" ", 2);
            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
            if (!isDigit1 && !isDigit2) {
                int cmp = split1[1].compareTo(split2[1]);
                if (cmp != 0) return cmp;
                return split1[0].compareTo(split2[0]);
            }
            return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
        });
        return logs;
    }

    public static String[] reorderLogFilesSecond(String[] logs) {
        List<String> digitLog = new ArrayList<>();
        Map<String, String> charLog = new TreeMap<>();
        String[] ans = new String[logs.length];
        for(String s : logs){
            if(isDigit(s)){
                digitLog.add(s);
            } else {
                String log = extractLog(s);
                charLog.put(log, s);
            }
        }
        int i = 0;
        for(String key : charLog.keySet()){
            ans[i++] = charLog.get(key);
        }
        for(String d : digitLog){
            ans[i++] = d;
        }
        return ans;
    }

    public static boolean isDigit(String s){
        int i = 0;
        while(s.charAt(i) != ' '){
            i++;
        }
        return Character.isDigit(s.charAt(i+1));
    }

    public static String extractLog(String s){
        int i = 0;
        while(s.charAt(i) != ' '){
            i++;
        }
        return s.substring(i+1);
    }



}
