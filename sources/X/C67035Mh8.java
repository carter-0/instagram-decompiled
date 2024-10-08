package X;

import android.content.Context;

/* renamed from: X.Mh8  reason: case insensitive filesystem */
public final class C67035Mh8 implements 1aV {
    public final /* synthetic */ C66633Ma2 A00;

    public C67035Mh8(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C66633Ma2 ma2 = this.A00;
        2EM A0s = ma2.A0s();
        if (A0s != null) {
            Integer num = AnonymousClass05K.A01;
            int A04 = DbS.A04(0Tu.A05, ma2.A0p(), 36592318203429307L);
            C14293TtR.A01(ma2.A0p(), (C229132mt) ma2.A1e.getValue(), (C231272rL) ma2.A1c.getValue(), num, A04);
            Context context = ma2.A1J.getContext();
            if (context != null) {
                C2611948q A05 = C66633Ma2.A05(ma2);
                C66736Mbh A0U = C66581MXm.A0U(ma2);
                0qQ.A0B(A05, 1);
                A0U.A0C.A02(context, A0s, A05);
                C67141Miz miz = A0U.A0E;
                miz.A0Q = false;
                miz.A0G = A05;
                miz.A0E = A0s;
                C66736Mbh.A03(A0U);
                C3265677h.A0o(ma2.A0p(), A05.ordinal());
                C66633Ma2.A0G(ma2);
            }
        }
    }
}
