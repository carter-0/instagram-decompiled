package X;

import java.util.HashMap;

/* renamed from: X.K8i  reason: case insensitive filesystem */
public final class C61454K8i extends L3Q {
    public C61454K8i() {
        int i;
        String str;
        this.A00 = 2131965906;
        HashMap A1E = AnonymousClass7TE.A1E();
        for (Integer num : AnonymousClass05K.A00(2)) {
            if (1 - num.intValue() != 0) {
                i = 2131965906;
            } else {
                i = 2131965907;
            }
            Integer valueOf = Integer.valueOf(i);
            if (1 - num.intValue() != 0) {
                str = "ELIGIBLE";
            } else {
                str = "NOT_ELIGIBLE";
            }
            A1E.put(valueOf, str);
        }
        this.A01 = A1E;
    }
}
