package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.WRj  reason: case insensitive filesystem */
public final class C19250WRj implements C61110lV {
    public final UserSession A00;
    public final C19196WPc A01;

    public C19250WRj(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new C19196WPc(userSession);
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(-1657644420);
        this.A01.A08 = false;
        AnonymousClass0fD.A0A(-2090598837, A03);
    }

    public final void onAppForegrounded() {
        long j;
        int A03 = AnonymousClass0fD.A03(-198544638);
        C19196WPc wPc = this.A01;
        UserSession userSession = wPc.A03.A00;
        0Tu r4 = 0Tu.A05;
        if (182.A06(r4, userSession, 36324209164693384L)) {
            2SP r7 = wPc.A06;
            if (1CI.A00(userSession)) {
                j = 36605684141528363L;
            } else {
                j = 36605684141593900L;
            }
            if (r7.A05((int) 182.A01(r4, userSession, j)) == 0) {
                wPc.A08 = true;
                if (182.A01(r4, userSession, 36605684141331753L) > 0 && 182.A01(r4, userSession, 36605684141462826L) > 0) {
                    1ES.A04(new C20367Wq7(wPc), 1635172738, 3, (int) TimeUnit.SECONDS.toMillis(182.A01(r4, userSession, 36605684141331753L)), false, true);
                }
            }
        }
        AnonymousClass0fD.A0A(-1302619164, A03);
    }
}
