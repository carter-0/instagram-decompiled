package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Hre  reason: case insensitive filesystem */
public final class C56032Hre {
    public final C54714HPt A00;
    public final String A01;
    public final 0sP A02;

    public final boolean A01(UserSession userSession) {
        Object invoke;
        0sP r0 = this.A02;
        if (r0 != null && C51971G9r.A1a(userSession, r0)) {
            return false;
        }
        1Av A002 = 1Au.A00(userSession);
        long A06 = DbW.A06(A002.A01, this.A01);
        C54714HPt hPt = this.A00;
        if (hPt instanceof HH6) {
            invoke = ((HH6) hPt).A00;
        } else {
            invoke = ((HH5) hPt).A00.invoke(userSession);
        }
        if (C51966G9m.A07(A06) >= TimeUnit.DAYS.toMillis(AnonymousClass7TE.A0R(invoke))) {
            return false;
        }
        return true;
    }

    public C56032Hre(C54714HPt hPt, String str, 0sP r3) {
        this.A01 = str;
        this.A00 = hPt;
        this.A02 = r3;
    }

    public final void A00(UserSession userSession) {
        1Av A002 = 1Au.A00(userSession);
        String str = this.A01;
        long currentTimeMillis = System.currentTimeMillis();
        0xY A0p = AnonymousClass7TE.A0p(A002);
        A0p.E5c(str, currentTimeMillis);
        A0p.apply();
    }
}
