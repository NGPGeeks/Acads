import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class balancedBrackets {
    /**
    * Problem set url: https://www.hackerrank.com/challenges/balanced-brackets
    *
    * @author ibtehaz.shawon@gmail.com
    *
    **/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = sc.nextInt();
        
        for(int testCases = 0; testCases < lineNumber; testCases++) {
            String braces = sc.next();
            boolean errorFlag = false; //in case error occurs like the stack went empty but there are more values in the input queue
            Stack<Character> stack = new Stack<Character>();
            //stack will only contain the opening part of the braces. if any close braces comes from input, the last value will come up from the stack to match
            
            for (int i = 0; i < braces.length();i++) {
                char val = braces.charAt(i);
        
                if (val == '[' || val == '{' || val == '('){
                    stack.push(val);
                } else {
                    if (stack.empty()) {
                        //System.out.println("NO " + " for " + braces);
                        System.out.println("NO");
                        errorFlag = true;
                        stack.clear();
                        //stack is empty and a closing came. errorFlag became true for later checks and stack is cleared (JUST IN CASE!). not necessary here actually!
                        break;
                    }
                    char poppedVal = stack.pop();
                    
                    if ((val == ']' && poppedVal != '[') 
                        || (val == '}' && poppedVal != '{')
                        || (val == ')' && poppedVal != '(')) {
                        //System.out.println("NO " + " for " + braces);                                                                       
                        System.out.println("NO");
                        errorFlag= true;
                        stack.clear();
                        
                        //popped value from stack does not match from the input value. popped value is opening brace of any kind. 
                        //stack is cleared for further/final checks. Necessary in this case.
                        //errorflag stands out TRUE in case stack has element at the end of the loop
                        break;
                    }
                }
            }
            
            if (stack.empty() && errorFlag == false) {
                //System.out.println("YES " + " for " + braces);
                //stack is empty and errorFlag is false. everything went well
                System.out.println("YES");
            } else if (!stack.empty() && errorFlag == false){
                //System.out.println("NO " + " for " + braces);
                //in case stack is not empty for testCase like {{[[(( (uneven close and open brace cases) but the errorFlag did not stand out true.
                System.out.println("NO");
            }
        }
    }
}
