package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.PresenceSubscriptionIDStore;

/* renamed from: X.4Bw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C262034Bw implements C62320sa {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    public /* synthetic */ C262034Bw(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }

    public final Object invoke() {
        UserSession userSession = this.A01;
        Context context = this.A00;
        27P A002 = 27P.A00(userSession);
        return new C2597743a(context, new 1a8((C269794fh) null), userSession, 27Z.A00(userSession), A002, PresenceSubscriptionIDStore.getInstance(userSession));
    }
}
