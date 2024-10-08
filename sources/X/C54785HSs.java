package X;

import android.app.Activity;

/* renamed from: X.HSs  reason: case insensitive filesystem */
public abstract class C54785HSs {
    public static final void A00(Activity activity, C286575Wy r13, int i) {
        int i2;
        C286575Wy r4 = r13;
        r13.ExV(1116258367);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r13, activity) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(2091679072, "com.instagram.aistudio.editor.AiPublishInReviewLayout (AiPublishInReviewFragment.kt:55)");
            }
            boolean A1Z = C51967G9n.A1Z(r13, activity, -741149879);
            Object ECw = r13.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                ECw = G9w.A0r(r13, activity, 8);
            }
            C62320sa r9 = (C62320sa) ECw;
            C286565Wx r3 = (C286565Wx) r4;
            C286565Wx.A0L(r3, false);
            String A00 = C288035bG.A00(r13, 2131952785);
            String A002 = C288035bG.A00(r13, 2131952784);
            boolean A1Z2 = C51967G9n.A1Z(r13, activity, -741140055);
            Object ECw2 = r13.ECw();
            if (A1Z2 || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = G9w.A0r(r13, activity, 9);
            }
            C56632I5m.A03(r4, HXM.A00(r13, (Integer) null, C51965G9l.A0y(r3, ECw2, false), 2131952783, 14), (C53398GnV) null, A00, A002, r9, 0, 4080);
            if (0fL.A02()) {
                0fL.A00(-392922770);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, activity, i, 12);
        }
    }
}
