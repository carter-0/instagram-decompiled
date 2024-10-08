package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.GFd  reason: case insensitive filesystem */
public final class C52109GFd implements JQN {
    public long A00 = 2000;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A00(0eO.A02, C58705IwE.A01(this, 3));
    public final C267324bN A03;
    public final C52058GDe A04;
    public final AnonymousClass3W1 A05;

    public C52109GFd(C267324bN r6, C52058GDe gDe, UserSession userSession, AnonymousClass3W1 r9) {
        this.A01 = userSession;
        this.A03 = r6;
        this.A04 = gDe;
        this.A05 = r9;
        long j = 2000;
        this.A00 = (r9.A0n() || r9.A1q || 182.A06(0Tu.A05, userSession, 36323169782737870L)) ? 0 : j;
    }

    public final void EJV(GL1 gl1, GYL gyl) {
        boolean A1U = AnonymousClass7TF.A1U(0, gl1, gyl);
        if (!gl1.A02) {
            int intValue = gl1.A01.intValue();
            if (intValue == 0) {
                UserSession userSession = this.A01;
                C267324bN r1 = this.A03;
                AnonymousClass3W1 r3 = this.A05;
                long j = this.A00;
                ((C55938Hq2) this.A02.getValue()).A00(r1, userSession, r3, j);
                gyl.A00(C52206GIx.A02, gl1.A04, j);
                return;
            } else if (intValue == A1U) {
                ((C55938Hq2) this.A02.getValue()).A00(this.A03, this.A01, this.A05, 0);
            } else if (intValue != 2) {
                throw AnonymousClass7TE.A1K();
            }
        }
        gyl.A01(gl1.A04);
    }

    public final void Clh() {
    }

    public final void reset() {
        AnonymousClass3W1 r2 = this.A04.A0E;
        if (r2 != null) {
            C51966G9m.A1N(r2.A3R, r2, false);
            C55938Hq2 hq2 = (C55938Hq2) this.A02.getValue();
            int hashCode = r2.hashCode();
            Map map = hq2.A01;
            Integer valueOf = Integer.valueOf(hashCode);
            Runnable runnable = (Runnable) map.get(valueOf);
            if (runnable != null) {
                hq2.A00.removeCallbacks(runnable);
                map.remove(valueOf);
            }
        }
    }
}
