public class OctalToDecimal {
  public static void main(String[] args) {
    
  }
    public int convertToDecimal(String octal) {
            int conversion = 1;
            int result = 0;
            for (int i = 1; i <= octal.length(); i++) {
              if (octal.charAt(octal.length() - i) == '1')
                result += conversion;
              conversion *= 8;
            }
        return 999;
    }
}
