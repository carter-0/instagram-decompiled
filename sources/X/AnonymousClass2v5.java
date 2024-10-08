package X;

import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;

/* renamed from: X.2v5  reason: invalid class name */
public final class AnonymousClass2v5 implements C233102ux {
    public final UserSession A00;
    public final AnonymousClass2rI A01;
    public final C233102ux A02;

    public final void Cui(AFI_TYPE afi_type, 1Xj r8, AnonymousClass3W1 r9, Integer num, int i) {
        0qQ.A0B(r8, 0);
        0qQ.A0B(num, 3);
        this.A02.Cui(afi_type, r8, r9, num, i);
    }

    public final boolean EsX(AFI_TYPE afi_type, 1Xj r5, Integer num) {
        1UQ r1;
        0qQ.A0B(num, 1);
        if (r5 != null && r5.CcK()) {
            UserSession userSession = this.A00;
            AnonymousClass2rI r12 = this.A01;
            1Xg A04 = r12.A04(r12.BJU(C2817359g.A00(userSession, r5)) + 1);
            if (A04 == null || !((r1 = A04.A06) == 1UQ.A0T || r1 == 1UQ.A06 || r1 == 1UQ.A07 || r1 == 1UQ.A08)) {
                return this.A02.EsX(afi_type, r5, num);
            }
        }
        return false;
    }

    public final void EUa(AFI_TYPE afi_type, long j) {
        this.A02.EUa(afi_type, j);
    }

    public AnonymousClass2v5(UserSession userSession, AnonymousClass2rI r2, C233102ux r3) {
        this.A02 = r3;
        this.A00 = userSession;
        this.A01 = r2;
    }
}
