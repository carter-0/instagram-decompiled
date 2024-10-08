package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PDa  reason: case insensitive filesystem */
public final class C72621PDa implements C74410PuQ {
    public final /* synthetic */ OFL A00;

    public final String AUf(UserSession userSession) {
        return "message sent time is not after thread store subscribed at time";
    }

    public C72621PDa(OFL ofl) {
        this.A00 = ofl;
    }

    public final /* bridge */ /* synthetic */ boolean ASy(UserSession userSession, Object obj) {
        C68161N3b n3b = (C68161N3b) obj;
        AnonymousClass7TG.A1N(n3b, userSession);
        Number number = (Number) this.A00.A03.invoke(userSession);
        if (number != null) {
            long j = n3b.A00;
            if (j == 0 || j > number.longValue()) {
                return true;
            }
            return false;
        }
        return true;
    }
}
