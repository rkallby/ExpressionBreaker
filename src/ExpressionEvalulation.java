import java.util.*;


public class ExpressionEvalulation {
Scanner input       = new Scanner(System.in);
   static Stack<String> operatorStack = new Stack<>();
   static Stack<Integer> valueStack    = new Stack<>();
   
   public static void main(String[] args) {
        Scanner input       = new Scanner(System.in);
        String phrase,operatorTemp,lastValue,lastOperator;
        
        lastOperator = "";
        lastValue    = "";
        
        phrase = input.nextLine();
        
        
        StringTokenizer st1 = new StringTokenizer(phrase.replaceAll(" ",""));
        
        for (int i = 1; st1.hasMoreTokens(); i++) {
            operatorTemp = (st1.nextToken("+-*")); 
            if (!lastValue.equals(operatorTemp)) {
                valueStack.push(Integer.parseInt(operatorTemp));
                System.out.println("Token "+i+":"+ operatorTemp);
                lastValue = operatorTemp;
                
                } else {
                System.out.println("you used duplicates");
                System.exit(0);
            }
        }
        System.out.println(valueStack);
   }
}
    

