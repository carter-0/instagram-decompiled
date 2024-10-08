package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

public final class EK9 extends AnonymousClass799 {
    public final UserSession A00;
    public final AnonymousClass7JT A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EK9(UserSession userSession, AnonymousClass7JT r3) {
        super(2131970921);
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final boolean A00() {
        AnonymousClass4kA A002 = AnonymousClass4k9.A00(this.A00);
        if (DbY.A03(A002, A002.A0W, AnonymousClass4kA.A0c, 34) > 3) {
            return true;
        }
        return false;
    }

    public final boolean A01() {
        if (this.A01 == AnonymousClass7JT.WRITE_WITH_AI) {
            UserSession userSession = this.A00;
            AnonymousClass4kA A002 = AnonymousClass4k9.A00(userSession);
            0s0 r1 = A002.A0W;
            AnonymousClass0YZ[] r3 = AnonymousClass4kA.A0c;
            if (DbY.A03(A002, r1, r3, 34) <= 3) {
                AnonymousClass4kA A003 = AnonymousClass4k9.A00(userSession);
                long A0R = AnonymousClass7TE.A0R(A003.A0X.CDM(A003, r3[35]));
                if ((A0R == 0 || System.currentTimeMillis() - A0R >= TimeUnit.DAYS.toMillis(1)) && 182.A06(0Tu.A05, userSession, 36323513380646109L)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void DsH(AnonymousClass5Gv r7) {
        UserSession userSession = this.A00;
        AnonymousClass4kA A002 = AnonymousClass4k9.A00(userSession);
        0s0 r2 = A002.A0W;
        AnonymousClass0YZ[] r1 = AnonymousClass4kA.A0c;
        DbZ.A1b(A002, r2, r1, 34);
        AnonymousClass4kA A003 = AnonymousClass4k9.A00(userSession);
        long currentTimeMillis = System.currentTimeMillis();
        A003.A0X.Epx(A003, Long.valueOf(currentTimeMillis), r1[35]);
    }
}
