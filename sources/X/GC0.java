package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class GC0 {
    public boolean A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final Context A03;
    public final C52023GBu playerManager;

    public GC0(Context context, AnonymousClass0iw r3, UserSession userSession) {
        AnonymousClass7TG.A1Q(userSession, r3);
        this.A03 = context;
        this.A02 = userSession;
        this.A01 = r3;
        this.playerManager = new C52023GBu(context, r3, userSession);
    }
}
