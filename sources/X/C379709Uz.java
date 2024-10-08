package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9Uz  reason: invalid class name and case insensitive filesystem */
public final class C379709Uz extends AnonymousClass588 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final UserSession A03;

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        long j;
        boolean z = AnonymousClass1B0.A05;
        UserSession userSession = this.A03;
        boolean A002 = AnonymousClass1B1.A00(userSession).A00(1B2.A0C);
        0Tu r2 = 0Tu.A06;
        if (A002) {
            j = 36594405557470925L;
        } else {
            j = 36594405557405388L;
        }
        return (int) 182.A01(r2, userSession, j);
    }

    public final int A02() {
        return 18;
    }

    public final int A03() {
        return this.A01;
    }

    public final int A04() {
        return this.A02;
    }

    public C379709Uz(UserSession userSession) {
        this.A03 = userSession;
        0Tu r3 = 0Tu.A06;
        this.A02 = (int) 182.A01(r3, userSession, 36594405557339851L);
        this.A01 = (int) 182.A01(r3, userSession, 36594405557274314L);
        this.A00 = (int) 182.A01(r3, userSession, 36594405557536462L);
    }
}
