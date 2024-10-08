package X;

/* renamed from: X.O0m  reason: case insensitive filesystem */
public abstract class C70282O0m {
    public static final String A00(String str) {
        0qQ.A0B(str, 0);
        int length = str.length();
        if (length > 28) {
            str = C51967G9n.A0q(str, 0, length - 28);
        }
        char[] charArray = str.toCharArray();
        0qQ.A07(charArray);
        long j = 0;
        for (char A04 : charArray) {
            j = (j * 64) + ((long) 00l.A04("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", A04, 0));
        }
        return String.valueOf(j);
    }
}
