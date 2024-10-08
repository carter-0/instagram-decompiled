package X;

import java.util.Arrays;

public abstract class KsD {
    public static final int A00(C14122TqH tqH) {
        String format = String.format("%x", Arrays.copyOf(new Object[]{Integer.valueOf(tqH.A05)}, 1));
        0qQ.A07(format);
        String substring = format.substring(2);
        0qQ.A07(substring);
        String A0q = C51967G9n.A0q(substring, 0, 2);
        String A0q2 = C51967G9n.A0q(substring, 2, 4);
        String substring2 = substring.substring(4);
        0qQ.A07(substring2);
        int parseInt = Integer.parseInt(A0q, 16);
        int parseInt2 = Integer.parseInt(A0q2, 16);
        int parseInt3 = Integer.parseInt(substring2, 16);
        int min = Math.min(parseInt, Math.min(parseInt2, parseInt3));
        int max = Math.max(parseInt, Math.max(parseInt2, parseInt3));
        return ((max + min) * (max - min)) / max;
    }
}
