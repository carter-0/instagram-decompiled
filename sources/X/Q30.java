package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class Q30 implements C635613g {
    public static final Set A00;
    public static final Set A01;

    static {
        String[] strArr = AnonymousClass0Dw.A02;
        HashSet A1F = AnonymousClass7TE.A1F();
        boolean z = false;
        for (int i = 0; i < 44; i++) {
            String str = strArr[i];
            if (!"en".equals(str)) {
                A1F.add(str);
            } else {
                z = true;
            }
        }
        A00 = Collections.unmodifiableSet(A1F);
        HashSet A12 = C66580MXl.A12(A1F);
        if (z) {
            A12.add("en");
        }
        A01 = Collections.unmodifiableSet(A12);
    }

    public final Set AXM() {
        return A01;
    }
}
