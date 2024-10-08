package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.Lqe  reason: case insensitive filesystem */
public final class C65285Lqe implements C66486MTp {
    public final Context A00;
    public final UserSession A01;
    public final 1us A02;
    public final String A03;

    public C65285Lqe(Context context, UserSession userSession, 1us r4, String str) {
        0qQ.A0B(str, 3);
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = r4;
    }

    public final void AIz(AnonymousClass3Q2 r4) {
        1ua.A0G.A01(this.A00, this.A01).A0G(r4, this.A02, ShareType.REEL_SHARE);
    }

    public final String BbR() {
        return this.A03;
    }
}
