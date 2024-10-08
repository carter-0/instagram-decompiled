package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

public final class EK8 extends AnonymousClass799 {
    public final UserSession A00;
    public final AnonymousClass793 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EK8(UserSession userSession, AnonymousClass793 r5) {
        super(0qQ.A0K(182.A04(DbS.A0J(userSession, 1), userSession, 36887738939409162L), "A") ? 2131970912 : 2131970911);
        this.A00 = userSession;
        this.A01 = r5;
    }

    public final boolean A00() {
        AnonymousClass4kA A002 = AnonymousClass4k9.A00(this.A00);
        if (DbY.A03(A002, A002.A01, AnonymousClass4kA.A0c, 32) > 3) {
            return true;
        }
        return false;
    }

    public final boolean A01() {
        if (this.A01.A01) {
            UserSession userSession = this.A00;
            AnonymousClass4kA A002 = AnonymousClass4k9.A00(userSession);
            0s0 r1 = A002.A01;
            AnonymousClass0YZ[] r3 = AnonymousClass4kA.A0c;
            if (DbY.A03(A002, r1, r3, 32) <= 3) {
                AnonymousClass4kA A003 = AnonymousClass4k9.A00(userSession);
                long A0R = AnonymousClass7TE.A0R(A003.A02.CDM(A003, r3[33]));
                if (A0R == 0 || System.currentTimeMillis() - A0R >= TimeUnit.DAYS.toMillis(1)) {
                    0Tu r4 = 0Tu.A05;
                    if (0qQ.A0K(182.A04(r4, userSession, 36887738939409162L), "A") || 0qQ.A0K(182.A04(r4, userSession, 36887738939409162L), "B")) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    public final void DsH(AnonymousClass5Gv r7) {
        UserSession userSession = this.A00;
        AnonymousClass4kA A002 = AnonymousClass4k9.A00(userSession);
        0s0 r2 = A002.A01;
        AnonymousClass0YZ[] r1 = AnonymousClass4kA.A0c;
        DbZ.A1b(A002, r2, r1, 32);
        AnonymousClass4kA A003 = AnonymousClass4k9.A00(userSession);
        long currentTimeMillis = System.currentTimeMillis();
        A003.A02.Epx(A003, Long.valueOf(currentTimeMillis), r1[33]);
    }
}
