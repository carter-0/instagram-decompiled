package X;

import com.instagram.common.session.UserSession;

public final class PDW implements C74410PuQ {
    public final /* synthetic */ OGB A00;

    public final String AUf(UserSession userSession) {
        return "thread setting - messages muted";
    }

    public PDW(OGB ogb) {
        this.A00 = ogb;
    }

    public final /* bridge */ /* synthetic */ boolean ASy(UserSession userSession, Object obj) {
        C68161N3b n3b = (C68161N3b) obj;
        boolean A1Z = AnonymousClass7TG.A1Z(n3b, userSession);
        2Eq r0 = n3b.A01;
        if (r0 == null) {
            r0 = (2Eq) this.A00.A03.invoke(userSession, n3b.A0A);
        }
        boolean z = false;
        if (r0 != null && r0.isMuted() == A1Z) {
            z = true;
        }
        return !z;
    }
}
