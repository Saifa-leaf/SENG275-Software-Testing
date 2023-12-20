public class palindrome {

    public boolean palin(String a) {
        if (a == null || a.trim().isEmpty()) {
            return false;
        }

        StringBuffer b = new StringBuffer(a);

        b.reverse();
        String data = b.toString();
        if (a.equals(data)) {
            System.out.println("Palindrome");
            return true;
        } else {
            System.out.println("Not Palindrome");
            return false;
        }
    }
}
