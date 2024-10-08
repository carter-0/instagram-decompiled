package X;

import java.util.List;

/* renamed from: X.DhY  reason: case insensitive filesystem */
public abstract class C46592DhY {
    /* JADX WARNING: type inference failed for: r5v0, types: [X.4tU, X.4tV] */
    public static final C276534tU A00(C307896Rx r8, AnonymousClass6Tm r9) {
        int A04 = DbW.A04(r9.A01(), "null cannot be cast to non-null type kotlin.Int");
        List list = r9.A00;
        ? r5 = new C276544tV(r8.A0D, A04, list.size() / 2);
        2HZ A0B = C229632nm.A0B(C229632nm.A0C(1, list.size()), 2);
        int i = A0B.A00;
        int i2 = A0B.A01;
        int i3 = A0B.A02;
        if (i3 <= 0 ? !(i3 >= 0 || i2 > i) : i <= i2) {
            while (true) {
                Object A03 = r9.A03(i);
                0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.Int");
                r5.A0P(((Number) A03).intValue(), list.get(i + 1));
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        r5.A0O();
        return r5;
    }
}
