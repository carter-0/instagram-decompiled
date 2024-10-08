package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;

/* renamed from: X.9jN  reason: invalid class name and case insensitive filesystem */
public final class C385689jN extends C228042kh {
    public final Context A00;
    public final UserSession A01;

    public C385689jN(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        QuickSnapRepository A002 = C359048bt.A00(userSession, 1ua.A0G.A01(this.A00, userSession));
        0qQ.A0B(userSession, 0);
        Class<L50> cls = L50.class;
        return new AnonymousClass36N(userSession, C359088bz.A00(userSession), (L50) userSession.A01(cls, new MJ1(userSession, 9)), A002);
    }
}
