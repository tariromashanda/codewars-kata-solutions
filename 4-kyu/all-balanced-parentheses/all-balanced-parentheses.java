import java.util.List;
import java.util.ArrayList;
​
 public class BalancedParens {
        public static List<String> balancedParens (int n) {
        
            List<String> result = new ArrayList<>();
​
            trackParan(n, 0, 0, "", result);
            return result;
​
        }
​
        public static void trackParan(int n, int openBrackets, int closedBrackets, String currentString, List<String> result){
​
            if(currentString.length() == 2*n){
                result.add(currentString);
                return;
            }
​
            if(openBrackets < n){
                trackParan(n, openBrackets+1, closedBrackets, currentString + "(", result);
            }
​
            if(closedBrackets < openBrackets){
                trackParan(n, openBrackets, closedBrackets+1, currentString +")", result);
            }
​
​
        }
    }