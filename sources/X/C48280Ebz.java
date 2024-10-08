package X;

import com.facebook.dsp.core.ColorData;

/* renamed from: X.Ebz  reason: case insensitive filesystem */
public abstract class C48280Ebz {
    public static final Object A00(C307896Rx r4, AnonymousClass6Tm r5) {
        C276544tV A0O = DbY.A0O(r5);
        ColorData A01 = C46628Di8.A01(A0O.A07(36));
        float A02 = A0O.A02(35, 0.0f);
        C307786Rm r0 = r4.A03;
        if (r0 != null) {
            G9A g9a = (G9A) C46604Dhk.A01(r0.A00);
            if (g9a != null) {
                g9a.FKq(A01, A02);
                return null;
            }
            throw AnonymousClass7TE.A0z("Cannot update modal container without an existing bottom sheet.");
        }
        throw AnonymousClass7TE.A0y();
    }
}
