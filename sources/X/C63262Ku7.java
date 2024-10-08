package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: X.Ku7  reason: case insensitive filesystem */
public abstract class C63262Ku7 {
    public static final Set A00(String... strArr) {
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        0qQ.A0B(copyOf, 0);
        List A0I = 03t.A0I(copyOf);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A0I) {
            if (((String) next).length() > 0) {
                A1C.add(next);
            }
        }
        return 00k.A0k(A1C);
    }
}
