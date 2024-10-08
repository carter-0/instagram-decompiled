package X;

import android.view.View;

/* renamed from: X.Hxg  reason: case insensitive filesystem */
public abstract class C56387Hxg {
    public static final IG7 A00 = new IG7(0);

    public static final void A00(View view, AnonymousClass5R6 r5) {
        long CgY = r5.A0W.A06.CgY(0);
        int round = Math.round(C289295dM.A01(CgY));
        int round2 = Math.round(C289295dM.A02(CgY));
        view.layout(round, round2, view.getMeasuredWidth() + round, view.getMeasuredHeight() + round2);
    }
}
