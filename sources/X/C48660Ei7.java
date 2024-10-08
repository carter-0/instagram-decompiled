package X;

import android.widget.FrameLayout;
import com.instagram.bloks.hosting.IgBloksScreenConfig;

/* renamed from: X.Ei7  reason: case insensitive filesystem */
public abstract class C48660Ei7 {
    public static Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        int A02;
        C276544tV r5 = (C276544tV) r8.A03(0);
        AnonymousClass3M3 A0H = DbU.A0H(r7);
        if (!(A0H instanceof AnonymousClass3M3)) {
            return null;
        }
        AnonymousClass3M3 r3 = A0H;
        if (r3.A09 == null) {
            return null;
        }
        IgBloksScreenConfig igBloksScreenConfig = r3.A0A;
        Integer num = igBloksScreenConfig.A0J;
        if (num != null) {
            C46636DiG.A00(igBloksScreenConfig.A0B).A03(num.intValue());
        }
        igBloksScreenConfig.A06 = C3034368u.A00(r7, r5);
        AnonymousClass6NS r0 = r3.A0C;
        if (r0 != null) {
            r0.A03();
            r3.A0C = null;
        }
        if (r3.A08 == null) {
            r3.A02 = new FrameLayout(r3.requireContext());
            C273694n2 r1 = new C273694n2(r3.requireContext());
            r3.A08 = r1;
            r3.A02.addView(r1);
            r3.A08.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
            C273694n2 r2 = r3.A08;
            if (r3.A0I) {
                A02 = 0;
            } else {
                A02 = DbZ.A02(r3);
            }
            DbT.A0K(r3.A03).ETi(r2, A02, 0, false);
        }
        AnonymousClass6NS r02 = r3.A0C;
        if (r02 != null) {
            r02.A03();
        }
        AnonymousClass6NS A00 = AnonymousClass6NS.A00(r3.requireContext(), C3034368u.A04(r5), r3.A09).A00();
        r3.A0C = A00;
        A00.A07(r3.A08);
        return null;
    }
}
