package X;

import android.content.Context;

/* renamed from: X.MlD  reason: case insensitive filesystem */
public final class C67278MlD implements 1wn {
    public final /* synthetic */ C66633Ma2 A00;

    public C67278MlD(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(371990479);
        AY5 ay5 = (AY5) obj;
        int A032 = AnonymousClass0fD.A03(-484733865);
        0qQ.A0B(ay5, 0);
        C66633Ma2 ma2 = this.A00;
        if (!DcS.A01(ma2.A0p(), false)) {
            i = 305611264;
        } else {
            String str = ay5.A00;
            C370818x7 r2 = new C370818x7(ma2.A0p());
            Context context = ma2.A1J.getContext();
            if (!r2.A05(str)) {
                C70554OBc oBc = new C70554OBc(ma2, str);
                C66736Mbh A0U = C66581MXm.A0U(ma2);
                NP6 np6 = new NP6(oBc, str);
                C67141Miz miz = A0U.A0E;
                NP6 np62 = miz.A04;
                if (np62 == null || !np6.equals(np62)) {
                    miz.A04 = np6;
                    C66736Mbh.A04(A0U);
                }
            } else if (context == null) {
                i = -1543205960;
            } else {
                r2.A02(context, str, true);
            }
            i = -2003857282;
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(2011581338, A03);
    }
}
