import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ValidParenthese {
    public static void main(String[] args) {
        String s="()[]{}";
        System.out.println(isValid(s));

    }
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();


//        if(s==null) return true;
//        String[] bracket=s.split("");
//        Queue<String> que=new LinkedList <>();
//        if(bracket[0]==")" || bracket[0]=="}" ||bracket[0]=="]"){
//            return false;
//        }else{
//            que.add(bracket[0]);
//        }
//        boolean flag=false;
//        for(int i=1;i<bracket.length;i++){
//            if(bracket[i].equals("(")||bracket[i].equals("{")||bracket[i].equals("[")){
//                que.add(bracket[i]);
//            }else{
//                String back=que.poll();
//                System.out.println(back);
//
//                if((bracket[i].equals(")")&&back.equals("(")||
//                bracket[i].equals("]")&& back.equals("[") ||
//                bracket[i].equals("}")&& back.equals("{"))){
//
//                    flag=true;
//                }else{
//                    return false;
//                }
//            }
//
//        }
//
//        return flag;

    }
}
