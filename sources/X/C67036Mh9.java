package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.EnumSet;

/* renamed from: X.Mh9  reason: case insensitive filesystem */
public final class C67036Mh9 implements 1aV {
    public final /* synthetic */ C66633Ma2 A00;

    public C67036Mh9(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C2611948q r3;
        C66633Ma2 ma2 = this.A00;
        if (ma2.A0b != null) {
            Integer num = AnonymousClass05K.A01;
            int A04 = DbS.A04(0Tu.A05, ma2.A0p(), 36592318203429307L);
            C14293TtR.A01(ma2.A0p(), (C229132mt) ma2.A1e.getValue(), (C231272rL) ma2.A1c.getValue(), num, A04);
            C67488Moi moi = ma2.A0b;
            if (moi == null || (r3 = moi.A00.A01) == null) {
                r3 = C2611948q.ALL;
            }
            2EM A0s = ma2.A0s();
            Context context = ma2.A1J.getContext();
            if (!(context == null || A0s == null)) {
                if (C66633Ma2.A0i(ma2)) {
                    ((C67197Mjt) ma2.A1s.getValue()).A02(A0s, r3, "CHANGE_FILTER");
                }
                C66736Mbh A0U = C66581MXm.A0U(ma2);
                0qQ.A0B(r3, 1);
                A0U.A0C.A02(context, A0s, r3);
                C67141Miz miz = A0U.A0E;
                miz.A0Q = false;
                miz.A0G = r3;
                miz.A0E = A0s;
                C66736Mbh.A03(A0U);
            }
            C67304Mle mle = null;
            ma2.A16((Integer) null);
            if (!AnonymousClass7TE.A1b(C66581MXm.A0U(ma2).A0E.A0O) && r3 != C2611948q.ALL) {
                UserSession A0p = ma2.A0p();
                String str = r3.A00;
                Dba.A0j(1, A0p, str);
                0Aj A0H = C66583MXo.A0H(A0p);
                DbS.A1J(A0H, "inbox_null_state");
                A0H.AAJ("selected_filter", str);
                A0H.Cgf();
            }
            C67488Moi moi2 = ma2.A0b;
            if (moi2 != null) {
                mle = moi2.A00;
            }
            if (mle == C67304Mle.A08) {
                2bu A0g = C66581MXm.A0g(ma2);
                EnumSet of = EnumSet.of(Trigger.A0j);
                0qQ.A07(of);
                A0g.AVg(of);
            }
        }
    }
}
