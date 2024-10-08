package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.9HW  reason: invalid class name */
public final class AnonymousClass9HW {
    public final UserSession A00;
    public final 2Dm A01;
    public final Map A02;

    public AnonymousClass9HW(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        Map A002 = AnonymousClass9HX.A00();
        2Dm A003 = 1bJ.A00(userSession);
        0qQ.A0B(A002, 2);
        0qQ.A0B(A003, 3);
        this.A00 = userSession;
        this.A02 = A002;
        this.A01 = A003;
    }

    public final boolean A00(C254783t2 r6, int i) {
        AnonymousClass9HZ r4;
        2HR r0;
        if (r6 == null || (r4 = (AnonymousClass9HZ) this.A02.get(Integer.valueOf(i))) == null) {
            return false;
        }
        C254773t1 A022 = AnonymousClass6W3.A02(r6);
        if (A022 == null) {
            UserSession userSession = this.A00;
            if (r4 instanceof C376209Hb) {
                return ((C376209Hb) r4).A00;
            }
            if (r4 instanceof C376269Hh) {
                AnonymousClass2HN A002 = 2HM.A00(userSession);
                return ((Boolean) A002.A0g.get()).booleanValue() || ((Boolean) A002.A0U.get()).booleanValue();
            }
            if (r4 instanceof C376279Hi) {
                r0 = 2HM.A00(userSession).A0W;
            } else if (r4 instanceof C376229Hd) {
                r0 = 2HM.A00(userSession).A0m;
            } else if (r4 instanceof C376249Hf) {
                return 182.A06(0Tu.A06, userSession, 36317066633941778L);
            } else {
                return !(r4 instanceof C376329Hn) && !(r4 instanceof C376309Hl) && !(r4 instanceof C376289Hj);
            }
            return ((Boolean) r0.get()).booleanValue();
        }
        AnonymousClass3U9 B33 = this.A01.B33(AnonymousClass6W4.A01(A022));
        if (B33 != null) {
            return AnonymousClass9HX.A01(this.A00, B33, r4);
        }
        return false;
    }
}
