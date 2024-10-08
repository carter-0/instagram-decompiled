package X;

import java.util.List;

/* renamed from: X.Q2i  reason: case insensitive filesystem */
public abstract class C7283Q2i {
    public static String A00(Integer num, List list) {
        char c = '|';
        if (num == AnonymousClass05K.A00) {
            c = '/';
        }
        StringBuilder sb = new StringBuilder();
        for (Object next : list) {
            sb.append(c);
            sb.append(next);
        }
        return sb.toString();
    }

    public static String A01(String str, String str2) {
        if (str2 == null || str2.equals("")) {
            return str;
        }
        return 002.A0g(str, "#", str2);
    }
}
