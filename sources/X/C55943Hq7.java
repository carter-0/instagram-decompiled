package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hq7  reason: case insensitive filesystem */
public final class C55943Hq7 {
    public final 2el A00;
    public final HFJ A01;

    public C55943Hq7(UserSession userSession, 2el r5, AnonymousClass4DU r6) {
        HFJ hfj;
        0qQ.A0B(userSession, 1);
        this.A00 = r5;
        if (182.A06(0Tu.A05, userSession, 36315155374214187L)) {
            hfj = new HFJ(userSession, r6);
        } else {
            hfj = null;
        }
        this.A01 = hfj;
    }

    public final void A00(View view, C18490Vsl vsl) {
        HFJ hfj = this.A01;
        if (hfj != null) {
            hfj.A00.put(vsl, view);
            this.A00.A05(view, DbU.A0a(hfj, AnonymousClass30Y.A00(vsl, C60340gF.A00, vsl.A02)));
        }
    }
}
