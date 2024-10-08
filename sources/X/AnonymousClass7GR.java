package X;

import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7GR  reason: invalid class name */
public final class AnonymousClass7GR {
    public String A00;
    public final UserSession A01;
    public final AnonymousClass7GS A02;

    public AnonymousClass7GR(UserSession userSession) {
        AnonymousClass7GS r0 = new AnonymousClass7GS(userSession);
        this.A01 = userSession;
        this.A02 = r0;
    }

    public final String A00() {
        UserSession userSession = this.A02.A00;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36320322219221287L) || 182.A06(r2, userSession, 36319579191188986L)) {
            return AnonymousClass4KL.A01.A00(this.A00);
        }
        return this.A00;
    }

    public final void A01(String str) {
        UserSession userSession = this.A02.A00;
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36320322219155750L) && !182.A06(r2, userSession, 36319579191123449L)) {
            str = null;
        }
        this.A00 = str;
    }

    public /* synthetic */ AnonymousClass7GR(UserSession userSession, AnonymousClass7GS r4, DefaultConstructorMarker defaultConstructorMarker, int i) {
        AnonymousClass7GS r1 = new AnonymousClass7GS(userSession);
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = r1;
    }
}
