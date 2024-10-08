package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ReQ  reason: case insensitive filesystem */
public abstract class C9646ReQ {
    public static final String A00(String str, String... strArr) {
        List A0I = 03t.A0I(strArr);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A0I) {
            if (((String) next).length() != 0) {
                A1C.add(next);
            }
        }
        return C66581MXm.A0w(str, A1C);
    }
}
