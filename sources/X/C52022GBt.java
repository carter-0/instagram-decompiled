package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.GBt  reason: case insensitive filesystem */
public final class C52022GBt {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C52024GBv A04;
    public final Context A05;
    public final C52023GBu concurrentPlayerManager;

    public final void A00() {
        C14044Tol tol;
        this.A00 = false;
        if (this.A01) {
            C52024GBv gBv = this.A04;
            C57467IbB ibB = gBv.A03;
            if (!(ibB == null || (tol = ibB.A01) == null)) {
                tol.A0A("paused_for_replay");
            }
            C57467IbB ibB2 = gBv.A03;
            if (ibB2 != null) {
                ibB2.A01();
            }
            gBv.A03 = null;
            gBv.A02 = null;
            gBv.A04.clear();
            gBv.A00 = -1;
        } else {
            this.concurrentPlayerManager.A00();
        }
        C51971G9r.A1K(this.A03);
    }

    public C52022GBt(Context context, AnonymousClass0iw r3, UserSession userSession) {
        AnonymousClass7TG.A1Q(userSession, r3);
        this.A05 = context;
        this.A03 = userSession;
        this.A02 = r3;
        this.concurrentPlayerManager = new C52023GBu(context, r3, userSession);
        this.A04 = new C52024GBv(context, r3, userSession);
    }
}
