package X;

import com.instagram.common.session.UserSession;

public final class WU8 implements C250603lj {
    public long A00 = -1;
    public final UserSession A01;

    public final void ATF(AnonymousClass30Y r7, C252093oY r8) {
        long j;
        boolean A1U = AnonymousClass7TF.A1U(0, r7, r8);
        if (((C17388VTp) r7.A03).A00.A01 == AnonymousClass05K.A04) {
            int A0A = C51968G9o.A0A(r7, r8);
            if (A0A != A1U) {
                if (A0A == 2) {
                    j = -1;
                    if (this.A00 == -1) {
                        return;
                    }
                } else if (A0A != 0) {
                    throw new RuntimeException();
                } else {
                    return;
                }
            } else if (r8.CFe(r7) >= 0.5f && this.A00 <= -1 && r8.CFe(r7) >= 0.5f) {
                j = r8.BlK();
            } else {
                return;
            }
            this.A00 = j;
        }
    }

    public WU8(UserSession userSession) {
        this.A01 = userSession;
    }
}
