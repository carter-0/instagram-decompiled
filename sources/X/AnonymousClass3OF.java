package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3OF  reason: invalid class name */
public final class AnonymousClass3OF implements AnonymousClass0lh {
    public 0TS A00 = 0TS.A01;
    public boolean A01;
    public long A02;
    public AnonymousClass0TQ A03;
    public boolean A04;
    public final UserSession A05;
    public final boolean A06;

    public final boolean A00() {
        UserSession userSession = this.A05;
        if (182.A06(0Tu.A05, userSession, 36317165418189631L) || this.A06 || this.A01) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.A02 > 500) {
            this.A04 = !C238173Av.A00(userSession);
            this.A02 = currentTimeMillis;
        }
        return this.A04;
    }

    public final void onSessionWillEnd() {
        19e A012;
        AnonymousClass0TQ r2 = this.A03;
        if (r2 != null && (A012 = 19e.A01()) != null) {
            0qQ.A0C(r2, "null cannot be cast to non-null type com.instagram.video.common.VideoAutoplayChecker.MemoryRedDisableAutoplay");
            A012.EDs(r2);
        }
    }

    public AnonymousClass3OF(UserSession userSession) {
        boolean z;
        int A042;
        this.A05 = userSession;
        0Tu r4 = 0Tu.A05;
        if (182.A06(r4, userSession, 36329161261858653L) || !((A042 = 0qg.A01().A04()) == 1 || A042 == 2)) {
            z = false;
        } else {
            z = true;
        }
        this.A06 = z;
        19e A012 = 19e.A01();
        if (A012 == null || !182.A06(r4, userSession, 36311654975144641L)) {
            this.A01 = false;
            return;
        }
        C2807453t r0 = new C2807453t(this);
        this.A03 = r0;
        A012.A8y(r0);
    }
}
