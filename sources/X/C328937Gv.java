package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;

/* renamed from: X.7Gv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C328937Gv implements C62320sa {
    public final /* synthetic */ UserSession A00;

    public /* synthetic */ C328937Gv(UserSession userSession) {
        this.A00 = userSession;
    }

    public final Object invoke() {
        UserSession userSession = this.A00;
        return new C328927Gu(C60510iO.A00(userSession), userSession, C61410nE.A00, RealtimeClientManager.getInstance(userSession));
    }
}
