package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.83f  reason: invalid class name and case insensitive filesystem */
public final class C3500983f {
    public final 29E A00;
    public final UserSession A01;

    public final long A00() {
        long A04;
        29E r2 = this.A00;
        synchronized (r2) {
            A04 = r2.A04((Integer) null, (String) null, 17640443, 10000);
        }
        return A04;
    }

    public /* synthetic */ C3500983f(UserSession userSession) {
        29E r0 = new 29E(userSession);
        this.A01 = userSession;
        this.A00 = r0;
    }

    public final void A01(long j) {
        29E r1 = this.A00;
        synchronized (r1) {
            r1.A02(17640443, j);
        }
    }

    public final void A02(long j, String str) {
        29E r1 = this.A00;
        synchronized (r1) {
            r1.A07(str, "", 17640443, j);
        }
    }

    public final void A03(long j, String str) {
        29E r1 = this.A00;
        synchronized (r1) {
            r1.A0D(str, j, (String) null, (String) null, (String) null, (String) null);
        }
    }
}
