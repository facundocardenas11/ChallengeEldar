# ChallengeEldar
Challenge para ELDAR


Ejercicio 5:


<pre>
    
 public static String concatenateAndConvertToLowerCase(String[] array) {
        StringBuilder sb = new StringBuilder();

        for (String word : array) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(word.toLowerCase());
        }

        return sb.toString();
    }
}

//posible main:

public static void main(String[] args) {
        String[] myArray = {"FirstWord", "SecondWord", "THIRDWORD"};
        String result = concatenateAndConvertToLowerCase(myArray);
        System.out.println(result);
    
</pre>


    
    
   
