package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

public final class LDK {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02;

    public LDK(AnonymousClass4DH r8, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = r8;
        this.A01 = userSession;
        C66298MMh A012 = C66298MMh.A01(this, 22);
        AnonymousClass0eM A002 = C66298MMh.A00(C66298MMh.A01(r8, 19), 0eO.A02, 20);
        C227862kA A0I = DbS.A0I(C66298MMh.A01(A002, 21), A012, new MJ6(2, (Object) null, A002), DbS.A0z(C60197JhG.class));
        this.A02 = A0I;
        DbZ.A1C(r8, MHB.A01(this, (AnonymousClass4D7) null, 13), ((C60197JhG) A0I.getValue()).A06);
    }

    public final void A00(UpcomingEvent upcomingEvent, boolean z, boolean z2) {
        0qQ.A0B(upcomingEvent, 0);
        2YL A0H = DbS.A0H(this.A02);
        AnonymousClass7TE.A1Z(new MGK(A0H, upcomingEvent, (AnonymousClass4D7) null, 8, z2, z), C318116oQ.A00(A0H));
    }
}
