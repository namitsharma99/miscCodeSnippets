class RecursionBasedStringReversal {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        String str = "abcd";
        
        System.out.println(str.substring(0));
        System.out.println(printRev(str) );
        
    }
    
    private static String  printRev(String s) {
        if (1 > s.length()) {
            return "";
        }
        return  printRev(s.substring(1)) + s.charAt(0);
    }
}
