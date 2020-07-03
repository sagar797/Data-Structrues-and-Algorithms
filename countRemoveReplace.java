import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        hitcnt(str, 0);
        hitrem(str, new StringBuilder());
        hitbye(str, new StringBuilder());
    }
    public static void hitcnt(String str, int nfx) {
        if (str.length() == 0) {
            System.out.println(nfx);
            return;
        }
        if (str.length() != 1) {
            if (str.charAt(0) != 'h' || str.charAt(1) != 'i') {
                String ros = str.substring(1);
                hitcnt(ros, nfx);
            } else {
                if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
                    if (str.length() != 2) {
                        if (str.charAt(2) != 't') {
                            String ros = str.substring(1);
                            hitcnt(ros, nfx + 1);
                        } else {
                            String ros = str.substring(1);
                            hitcnt(ros, nfx);
                        }
                    } else {
                        String ros = str.substring(1);
                        hitcnt(ros, nfx + 1);
                    }
                } else {
                    String ros = str.substring(1);
                    hitcnt(ros, nfx);
                }
            }
        } else {
            String ros = str.substring(1);
            hitcnt(ros, nfx);
        }
    }
    public static void hitrem(String str, StringBuilder sb) {
        if (str.length() == 0) {
            System.out.println(sb);
            return;
        }
        char ch = str.charAt(0);
        if (str.length() != 1) {
            if (str.charAt(0) != 'h' || str.charAt(1) != 'i') {
                sb.append(ch);
                String ros = str.substring(1);
                hitrem(ros, sb);
            } else {
                if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
                    if (str.length() != 2) {
                        if (str.charAt(2) != 't') {
                            String ros = str.substring(2);
                            hitrem(ros, sb);
                        } else {
                            sb.append(ch);
                            String ros = str.substring(1);
                            hitrem(ros, sb);
                        }
                    } else {
                        String ros = str.substring(2);
                        hitrem(ros, sb);
                    }
                } else {
                    sb.append(ch);
                    String ros = str.substring(1);
                    hitrem(ros, sb);
                }
            }
        } else {
            sb.append(ch);
            String ros = str.substring(1);
            hitrem(ros, sb);
        }
    }
    public static void hitbye(String str, StringBuilder sb) {
        if (str.length() == 0) {
            System.out.println(sb);
            return;
        }
        char ch = str.charAt(0);
        if (str.length() != 1) {
            if (str.charAt(0) != 'h' || str.charAt(1) != 'i') {
                sb.append(ch);
                String ros = str.substring(1);
                hitbye(ros, sb);
            } else {
                if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
                    if (str.length() != 2) {
                        if (str.charAt(2) != 't') {
                            sb.append("bye");
                            String ros = str.substring(2);
                            hitbye(ros, sb);
                        } else {
                            sb.append(ch);
                            String ros = str.substring(1);
                            hitbye(ros, sb);
                        }
                    } else {
                        sb.append("bye");
                        String ros = str.substring(2);
                        hitbye(ros, sb);
                    }
                } else {
                    sb.append(ch);
                    String ros = str.substring(1);
                    hitbye(ros, sb);
                }
            }
        } else {
            sb.append(ch);
            String ros = str.substring(1);
            hitrem(ros, sb);
        }
    }
}