package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6aS  reason: invalid class name and case insensitive filesystem */
public final class C310116aS {
    public final C310106aR A00;
    public final int A01;
    public final 1P2 A02;
    public final UserSession A03;
    public final boolean A04;
    public final boolean A05;

    public C310116aS(UserSession userSession, C310106aR r6) {
        0qQ.A0B(userSession, 1);
        this.A00 = r6;
        this.A02 = 1P1.A00(userSession);
        0Tu r3 = 0Tu.A05;
        this.A01 = (int) 182.A01(r3, userSession, 36595475004000405L);
        this.A04 = 182.A06(r3, userSession, 36314000027355498L);
        this.A05 = 182.A06(r3, userSession, 36314000027421035L);
        this.A03 = userSession;
    }

    public final void A00(boolean z) {
        C310106aR r2;
        if (this.A04) {
            UserSession userSession = this.A03;
            long j = AnonymousClass1B0.A02;
            boolean A002 = AnonymousClass1B1.A00(userSession).A00(1B2.A0g);
            if (!this.A05 || A002) {
                return;
            }
        }
        if (z) {
            if (182.A06(0Tu.A05, this.A03, 36314000027486572L)) {
                r2 = this.A00;
                r2.A00();
            }
        }
        r2 = this.A00;
        if (r2.A00.A0C.A03.size() < this.A01) {
            return;
        }
        r2.A00();
    }
}
