package X;

import java.util.HashMap;

public abstract class S9J {
    public static String A00(long j) {
        return Pxf.A0m("%.3f", new Object[]{Double.valueOf(((double) j) / 1000.0d)});
    }

    public static HashMap A01(String... strArr) {
        int length = strArr.length;
        if (length % 2 == 0) {
            HashMap A1E = AnonymousClass7TE.A1E();
            for (int i = 0; i < length; i += 2) {
                String str = strArr[i];
                if (str == null) {
                    str = "";
                }
                String str2 = strArr[i + 1];
                if (str2 == null) {
                    str2 = "";
                }
                A1E.put(str, str2);
            }
            return A1E;
        }
        throw AnonymousClass7TE.A0w("Map must have an even (or zero) number of parameters");
    }
}
