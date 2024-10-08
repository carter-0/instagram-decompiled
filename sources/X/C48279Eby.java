package X;

import com.facebook.dsp.core.ColorData;
import kotlin.enums.EnumEntries;

/* renamed from: X.Eby  reason: case insensitive filesystem */
public abstract class C48279Eby {
    public static final Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        C46626Di6 di6;
        C276544tV A0O = DbY.A0O(r7);
        String A0H = A0O.A0H();
        if (A0H != null) {
            EnumEntries enumEntries = C46626Di6.A03;
            di6 = C46624Di4.A00(A0H);
        } else {
            di6 = null;
        }
        ColorData A02 = C46628Di8.A02(A0O.A07(35));
        C307786Rm r0 = r6.A03;
        if (r0 != null) {
            G9A g9a = (G9A) C46604Dhk.A01(r0.A00);
            if (g9a == null) {
                throw AnonymousClass7TE.A0z("Cannot update bottom sheet without an existing bottom sheet.");
            } else if (g9a.BTV() != C46626Di6.FULL_SCREEN) {
                g9a.FJn(A02, di6);
            } else {
                throw AnonymousClass7TE.A0z("Cannot update a full screen using the UpdateBottomSheet action.");
            }
        }
        return null;
    }
}
