package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class OLH {
    public final Context A00;
    public final OAR A01;
    public final 1P0 A02 = new NMI((Object) this, 31);
    public final UserSession A03;

    public OLH(Context context, AnonymousClass0iw r4, UserSession userSession) {
        this.A03 = userSession;
        this.A00 = context;
        this.A01 = new OAR(r4, userSession);
    }

    public final void A00() {
        long A0I = AnonymousClass7TG.A0I();
        long j = 172800 + A0I;
        UserSession userSession = this.A03;
        Long valueOf = Long.valueOf(j);
        Long valueOf2 = Long.valueOf(A0I);
        1P0 r6 = this.A02;
        0qQ.A0B(r6, 6);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("users/set_limited_interactions_settings/");
        A0a.A0Q(NHQ.class, ORP.class);
        A0a.A9m("is_enabled", "true");
        if (valueOf != null) {
            A0a.A0C("reminder_date", (int) j);
        }
        if (valueOf2 != null) {
            A0a.A0C("start_date", (int) A0I);
        }
        1OC A0M = A0a.A0M();
        A0M.A00 = r6;
        1ES.A03(A0M);
    }
}
