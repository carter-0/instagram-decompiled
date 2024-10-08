package X;

import android.app.Activity;
import java.util.List;
import java.util.Set;

/* renamed from: X.DiM  reason: case insensitive filesystem */
public final class C46641DiM extends 0wY {
    public static final C46641DiM A00;
    public static final C49456Evx A01 = new C49456Evx();

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.DiM, X.0lT] */
    static {
        ? obj = new Object();
        A00 = obj;
        0lU.A07(obj);
    }

    public static final void A00(C61074JwC jwC) {
        C49456Evx evx = A01;
        Object obj = evx.A01.get(jwC.A02);
        if (obj != null) {
            ((Set) obj).add(jwC);
            Object obj2 = evx.A00.get(AnonymousClass7TE.A1L(jwC.A01, jwC.A03));
            if (obj2 != null) {
                ((Set) obj2).add(jwC);
                return;
            }
            throw AnonymousClass7TE.A0w("Required value was null.");
        }
        throw AnonymousClass7TE.A0w("Required value was null.");
    }

    public static final void A01(C48080EUy eUy) {
        for (EV8 ev8 : (List) C49850F9p.A01.getValue()) {
            C49456Evx evx = A01;
            0qQ.A0B(ev8, 1);
            Object obj = evx.A00.get(new 0eP(eUy, ev8));
            if (obj != null) {
                AnonymousClass11O.A03(19E.A03(C49850F9p.A00(ev8), (C262224Cq) C49850F9p.A00.getValue()), 11M.A01(C49850F9p.A00(ev8), new MC9(new 0ic(obj, 1), 21)));
            } else {
                throw DbU.A0h();
            }
        }
    }

    public final void Cth(Activity activity) {
        A01(C48080EUy.ON_APP_BACKGROUNDED);
    }

    public final void Ctm(Activity activity) {
        A01(C48080EUy.ON_APP_FOREGROUNDED);
    }
}
