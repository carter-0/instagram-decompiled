package X;

import java.util.ArrayList;

/* renamed from: X.NqA  reason: case insensitive filesystem */
public abstract class C69688NqA {
    public static final O5S A00(String str) {
        boolean z;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= str.length()) {
                z = true;
                break;
            } else if (!Character.isDigit(str.charAt(i2))) {
                z = false;
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            return null;
        }
        char[] charArray = str.toCharArray();
        0qQ.A07(charArray);
        int length = charArray.length;
        ArrayList A0v = DbS.A0v(length);
        while (i < length) {
            char c = charArray[i];
            int digit = Character.digit(c, 10);
            if (digit >= 0) {
                A0v.add(String.valueOf(digit));
                i++;
            } else {
                throw AnonymousClass7TE.A0w(002.A0T("Char ", " is not a decimal digit", c));
            }
        }
        return new O5S(00k.A0P("", "", "", A0v, (0sP) null));
    }
}
