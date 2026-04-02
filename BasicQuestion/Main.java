package BasicQuestion;

class Main {
    public static void main(String[] args) {
        
        String input = "jashwant123@gmail.com";
        
        char[] letters = new char[input.length()];
        char[] digits = new char[input.length()];
        char[] specialChars = new char[input.length()];
        
        int letterIndex = -1;
        int digitIndex = -1;
        int specialIndex = -1;
       
        for(int i = 0; i < input.length(); i++) {
            
            char ch = input.charAt(i);
            
            if(Character.isLetter(ch)) {
                letters[++letterIndex] = ch;
                
            } else if(Character.isDigit(ch)) {
                digits[++digitIndex] = ch;
                
            } else {
                specialChars[++specialIndex] = ch;
            }
        }
        
        // Print Letters
        System.out.print("Letters: ");
        for(int i = 0; i <= letterIndex; i++) {
            System.out.print(letters[i]);
        }
        
        System.out.println();
        System.out.println("---------------------------");
        
        // Print Special Characters
        System.out.print("Special Characters: ");
        for(int i = 0; i <= specialIndex; i++) {
            System.out.print(specialChars[i]);
        }
        
        System.out.println();
        System.out.println("---------------------------");
        
        // Print Digits
        System.out.print("Digits: ");
        for(int i = 0; i <= digitIndex; i++) {
            System.out.print(digits[i]);
        }
    }
}
