class AddSubractStringParser {
    public static void main(String[] args) {
        
        String s = "11-100";
        String temp = "";
        int sum = 0;
        
        boolean isNegative = false;
        
        for (char c: s.toCharArray()) {
            
            System.out.print("c --> " + c + " | " + " temp --> " + temp + " | ");
            
            if (c == '+') {
                if (isNegative) {
                    sum -=  temp.isBlank() ? 0 : Integer.valueOf(temp);
                } else {
                    sum += temp.isBlank() ? 0 : Integer.valueOf(temp);
                }
                isNegative = false;
                System.out.print("sum --> " + sum + "\n");
                temp = "";
                continue;
            } else if (c == '-') {
                if (isNegative) {
                    sum -=  temp.isBlank() ? 0 : Integer.valueOf(temp);
                } else {
                    sum += temp.isBlank() ? 0 : Integer.valueOf(temp);
                }
                isNegative = true;
                System.out.print("sum --> " + sum + "\n");
                temp = "";
                continue;
            }
            temp += String.valueOf(c - '0');
            
            System.out.print("sum --> " + sum + "\n");
            
        }
        
        if (!temp.isBlank()) {
            sum = isNegative ? sum - Integer.valueOf(temp)
                            : sum + Integer.valueOf(temp);
        }
        
        System.out.println("Sum = " + sum);
        
        
    }
}
