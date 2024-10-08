package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3vX  reason: invalid class name and case insensitive filesystem */
public final class C256293vX implements C61110lV, AnonymousClass0lh {
    public final C256303vY A00;
    public final 1wS A01;
    public final UserSession A02;
    public final C61410nE A03;

    public C256293vX(UserSession userSession, C61410nE r3, C256303vY r4, 1wS r5) {
        0qQ.A0B(r3, 3);
        0qQ.A0B(userSession, 5);
        this.A00 = r4;
        this.A01 = r5;
        this.A03 = r3;
        this.A02 = userSession;
        14i.A03(15Y.A03, this);
    }

    public final void A00(AnonymousClass3WR r8) {
        C256303vY r5 = this.A00;
        String str = r8.A0G;
        long j = r8.A06;
        if (str != null && j > 0 && j != Long.MAX_VALUE) {
            1Uk r52 = r5.A00;
            if (r52.getLong(str, -1) < j) {
                1W3 AR0 = r52.AR0();
                AR0.A08(str, j);
                AR0.A03();
            }
        }
    }

    public final void onSessionWillEnd() {
        if (JVU.A01(this.A02, AnonymousClass05K.A03)) {
            14i.A06(this);
        }
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(823442479);
        0nY.A00().ATE(new RA5(this));
        AnonymousClass0fD.A0A(-77973253, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(1133894629, AnonymousClass0fD.A03(99174469));
    }
}
