package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;

/* renamed from: X.85I  reason: invalid class name */
public final class AnonymousClass85I implements AnonymousClass85J {
    public long A00 = 17629206;
    public C279284yO A01;
    public boolean A02;
    public final 29E A03;
    public final UserSession A04;

    public final void D0P(String str) {
        if (this.A02) {
            this.A00 = this.A03.A06(CancelReason.USER_CANCELLED, str, 17629206, this.A00);
            this.A02 = false;
        }
    }

    public final void DEK(C279284yO r13, int i) {
        0qQ.A0B(r13, 1);
        if (this.A02) {
            29E r0 = this.A03;
            long j = this.A00;
            String valueOf = String.valueOf(i);
            r0.A0B(j, "failure_code", valueOf, false);
            r0.A07(valueOf, "", 17629206, this.A00);
            this.A02 = false;
        }
    }

    public /* synthetic */ AnonymousClass85I(UserSession userSession) {
        29E r0 = new 29E(userSession);
        this.A04 = userSession;
        this.A03 = r0;
    }
}
