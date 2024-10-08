package X;

import com.instagram.user.model.User;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.PZL  reason: case insensitive filesystem */
public final class C73241PZL implements Runnable {
    public final /* synthetic */ 2Dr A00;
    public final /* synthetic */ 27U A01;

    public C73241PZL(2Dr r1, 27U r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        2Eo r8;
        2Dr r5 = this.A00;
        27U r6 = this.A01;
        synchronized (r5) {
            List A1I = AnonymousClass7TE.A1I(AnonymousClass43I.A00);
            C2611948q r0 = C2611948q.ALL;
            r8 = 2Eo.A04;
            Iterator it = r5.A0Q(r8, r0, (Comparator) null, A1I).iterator();
            while (it.hasNext()) {
                AnonymousClass3U9 r3 = (AnonymousClass3U9) it.next();
                User BIt = r3.BIt();
                if (BIt != null && C66582MXn.A1T(r6.A00, BIt)) {
                    r5.EEl(r3.BJz(), true, false);
                    2ED r2 = r5.A0C;
                    r2.A0I(1);
                    if (r3.Cdv(r5.A0A)) {
                        r2.A0N(AnonymousClass4iZ.A00, 1, r3.CcG());
                    }
                }
            }
        }
        for (AnonymousClass3U9 r22 : r5.By2(r8)) {
            User BIt2 = r22.BIt();
            if (BIt2 != null && C66582MXn.A1T(r6.A00, BIt2)) {
                r5.EEl(r22.BJz(), false, false);
                r5.A0C.A0J(1);
            }
        }
    }
}
