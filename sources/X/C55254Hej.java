package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hej  reason: case insensitive filesystem */
public abstract class C55254Hej {
    public static final void A00(Activity activity, GIY giy, String str, C62320sa r9, boolean z) {
        String str2;
        String A01;
        long j;
        C52236GKd gKd;
        Long A10;
        boolean A1X = DbW.A1X(giy);
        UserSession userSession = giy.A03;
        C51979GAc gAc = giy.A01;
        if (gAc != null) {
            1Xj r3 = giy.A00;
            if (r3 != null) {
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(gAc, userSession), "instagram_clips_viewer_cta_impression");
                if (A0e.isSampled()) {
                    C51979GAc.A01(A0e, gAc);
                    String A30 = r3.A30();
                    if (A30 == null || (A10 = AnonymousClass7TE.A10(A30)) == null) {
                        j = 0;
                    } else {
                        j = A10.longValue();
                    }
                    C51974G9v.A0l(A0e, A1X ? 1 : 0, j);
                    if (z) {
                        gKd = C52236GKd.A1O;
                    } else {
                        gKd = C52236GKd.A1P;
                    }
                    C51965G9l.A19(gKd, A0e);
                    C51965G9l.A1C(AnonymousClass5OC.TRANSLATE_PREVIEW, A0e);
                    C51965G9l.A1H(A0e, C51974G9v.A0U(r3));
                    A0e.Cgf();
                }
                C358248ab A0X = DbS.A0X(activity);
                int i = 2131955280;
                if (z) {
                    i = 2131955276;
                }
                A0X.A09(i);
                int i2 = 2131955279;
                if (z) {
                    i2 = 2131955277;
                }
                if (str.length() == 0) {
                    A01 = C51967G9n.A0p(activity, 2131971895);
                } else {
                    A01 = AnonymousClass3WS.A01(str);
                }
                DbY.A0w(activity, A0X, A01, i2);
                int i3 = 2131955278;
                if (z) {
                    i3 = 2131955274;
                }
                A0X.A0L(C56719I8z.A00(r9, 48), i3);
                A0X.A0H(new FIG(5, giy, z), 2131955265);
                DbT.A1V(A0X);
                return;
            }
            str2 = "media";
        } else {
            str2 = "analyticsModule";
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }
}
