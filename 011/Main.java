public class Main {
    public static void main(String[] args) {

        char[] c = { 'a', 'b', 'c', 'd' };
        String s = new String(c);
        System.out.println(s);

        String s2 = new String(s);
        System.out.println(s2);

        String s3 = "Damodar";
        System.out.println(s3);

        System.out.println(s3.length());
        // next, nextInt, nextDouble, nextInt, nextLong, (byte) nextInt(), nextLine
        System.out.println(s3.charAt(3));

        System.out.println(s2.equals(s));

        String s4 = "ABCd";
        System.out.println(s4.equals(s) + " " + s4.equalsIgnoreCase(s));

        System.out.println(s4.compareTo(s));

        System.out.println(s3.substring(0, 3));

        String s5 = s3.replace('a', 'b');
        System.out.println(s5);

        StringBuilder sb = new StringBuilder(s5);
        sb.setCharAt(2, 'A');
        System.out.println(sb.length() + "" + sb.charAt(2) + "" + sb.substring(2, 5));
        String s6 = sb.toString();
        System.out.println(s6);
    }
}