package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HrY  reason: case insensitive filesystem */
public final class C56026HrY {
    public final 1Av A00;
    public final UserSession A01;

    public final void A00(C362088hK r5, boolean z) {
        1Av r3;
        0s0 r2;
        AnonymousClass0YZ[] r1;
        int i;
        int A02 = DbU.A02(r5, 0);
        if (A02 == 0) {
            r3 = this.A00;
            r2 = r3.A1g;
            r1 = 1Av.A8a;
            i = 462;
        } else if (A02 == 1) {
            r3 = this.A00;
            r2 = r3.A1i;
            r1 = 1Av.A8a;
            i = 464;
        } else if (A02 == 2) {
            r3 = this.A00;
            r2 = r3.A1h;
            r1 = 1Av.A8a;
            i = 463;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        AnonymousClass7TF.A1J(r3, r2, r1, i, z);
    }

    public final boolean A01(C362088hK r5) {
        1Av r3;
        0s0 r2;
        AnonymousClass0YZ[] r1;
        int i;
        if (!r5.A06) {
            return true;
        }
        int ordinal = r5.ordinal();
        if (ordinal == 0) {
            r3 = this.A00;
            r2 = r3.A1g;
            r1 = 1Av.A8a;
            i = 462;
        } else if (ordinal == 1) {
            r3 = this.A00;
            r2 = r3.A1i;
            r1 = 1Av.A8a;
            i = 464;
        } else if (ordinal == 2) {
            r3 = this.A00;
            r2 = r3.A1h;
            r1 = 1Av.A8a;
            i = 463;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return AnonymousClass7TG.A1a(r3, r2, r1, i);
    }

    public C56026HrY(1Av r1, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, r1);
        this.A01 = userSession;
        this.A00 = r1;
    }
}
