package X;

import java.io.Writer;

public abstract class RD7 extends Writer {
    public static String A00(int i) {
        String str;
        StringBuilder A1A;
        String str2;
        if (i > 1114111) {
            A1A = AnonymousClass7TF.A0n("Illegal character point (0x");
            A1A.append(Integer.toHexString(i));
            str = ") to output; max is 0x10FFFF as per RFC 4627";
        } else {
            str = ")";
            A1A = AnonymousClass7TE.A1A();
            if (i <= 56319) {
                str2 = "Unmatched first part of surrogate pair (0x";
            } else {
                str2 = "Unmatched second part of surrogate pair (0x";
            }
            A1A.append(str2);
            A1A.append(Integer.toHexString(i));
        }
        return AnonymousClass7TF.A0l(str, A1A);
    }
}
