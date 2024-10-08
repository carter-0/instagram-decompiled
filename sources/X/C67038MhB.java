package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.MhB  reason: case insensitive filesystem */
public final class C67038MhB implements 1aV {
    public final /* synthetic */ C66633Ma2 A00;

    public C67038MhB(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C61082JwK jwK = (C61082JwK) obj;
        0qQ.A0B(jwK, 0);
        if (!jwK.A01) {
            C66633Ma2 ma2 = this.A00;
            UserSession A0p = ma2.A0p();
            if (182.A06(DbS.A0J(A0p, 1), A0p, 36325579259458624L)) {
                C67095MiF miF = (C67095MiF) ma2.A1t.getValue();
                miF.A01 = null;
                miF.A00 = null;
                DirectThreadKey directThreadKey = (DirectThreadKey) jwK.A00;
                ((C74548Pwh) ma2.A2v.getValue()).EDg(directThreadKey.A00);
                AnonymousClass1aS r2 = ma2.A0v().A07;
                C61082JwK jwK2 = (C61082JwK) r2.A0X();
                if (jwK2 != null) {
                    r2.accept(new C61082JwK((DirectThreadKey) jwK2.A00, true));
                }
                C66633Ma2.A0W(ma2, directThreadKey);
            }
        }
    }
}
