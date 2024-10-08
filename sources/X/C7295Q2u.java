package X;

import java.util.List;

/* renamed from: X.Q2u  reason: case insensitive filesystem */
public abstract class C7295Q2u {
    public static final Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        int i;
        int i2 = 0;
        Object A03 = r7.A03(0);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A03;
        List list = r7.A00;
        if (list.size() >= 2) {
            Object obj = list.get(1);
            0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.Number");
            i = ((Number) obj).intValue();
        } else {
            i = 0;
        }
        List list2 = r6.A0D;
        if (list2 != null) {
            i2 = list2.size();
        }
        if (i <= i2) {
            String A00 = C7285Q2k.A00(AnonymousClass05K.A01, str, list2, i);
            Object obj2 = C7285Q2k.A01(r6).get(A00);
            AnonymousClass6SD r0 = r6.A05;
            if (r0 != null) {
                r0.A7d(A00);
            }
            return obj2;
        }
        throw new IllegalArgumentException("Depth supplied should never exceed the size of the key path.");
    }
}
