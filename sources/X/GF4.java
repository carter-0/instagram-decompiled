package X;

import com.instagram.common.session.UserSession;

public final class GF4 implements C59602JPw {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final AnonymousClass93U A02;

    public final void CIx(C52088GEi gEi, int i, boolean z, boolean z2) {
        C52236GKd gKd;
        0qQ.A0B(gEi, 1);
        if (!z) {
            gKd = C52236GKd.A0I;
        } else if (z2) {
            gKd = C52236GKd.A0G;
        } else {
            gKd = C52236GKd.A0H;
        }
        AnonymousClass0iw r2 = this.A00;
        UserSession userSession = this.A01;
        AnonymousClass93U r4 = this.A02;
        long j = gEi.A01;
        String str = gEi.A04;
        C52086GEg.A07(AnonymousClass5OC.PAUSE_STATE_WITH_AUDIO_CONTROL, gKd, r2, userSession, r4, (Integer) null, (Long) gEi.A02, (Long) gEi.A03, str, i, j);
    }

    public /* synthetic */ GF4(AnonymousClass0iw r3, UserSession userSession) {
        AnonymousClass93T A002 = AnonymousClass93S.A00(userSession);
        0qQ.A0B(A002, 3);
        this.A01 = userSession;
        this.A00 = r3;
        this.A02 = A002;
    }

    public final void Cjc(C52087GEh gEh, Integer num, int i, boolean z, boolean z2) {
        C52236GKd gKd;
        AnonymousClass7TG.A1O(gEh, num);
        if (num == AnonymousClass05K.A0C) {
            gKd = C52236GKd.A0u;
        } else if (!z) {
            gKd = C52236GKd.A0I;
        } else if (z2) {
            gKd = C52236GKd.A0G;
        } else {
            gKd = C52236GKd.A0H;
        }
        AnonymousClass0iw r3 = this.A00;
        UserSession userSession = this.A01;
        AnonymousClass93U r5 = this.A02;
        long j = gEh.A01;
        C52086GEg.A05(AnonymousClass5OC.PAUSE_STATE_WITH_AUDIO_CONTROL, gKd, (GJB) gEh.A03, r3, userSession, r5, (Integer) null, (Long) gEh.A02, (Long) gEh.A04, i, j);
    }
}
