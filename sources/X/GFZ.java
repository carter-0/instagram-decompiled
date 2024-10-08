package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;

public final class GFZ implements JQN {
    public final C267324bN A00;
    public final JRO A01;
    public final UserSession A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final C52058GDe A05;
    public final AnonymousClass5FA A06 = AnonymousClass5F9.A00();
    public final AnonymousClass3W1 A07;
    public final Runnable A08;
    public final Runnable A09;

    public GFZ(C267324bN r3, C52058GDe gDe, JRO jro, UserSession userSession, AnonymousClass3W1 r7, C52054GDa gDa) {
        1Xj r0;
        DbW.A1N(userSession, 2, jro);
        this.A02 = userSession;
        this.A00 = r3;
        this.A05 = gDe;
        this.A01 = jro;
        this.A07 = r7;
        0eO r1 = 0eO.A02;
        this.A03 = AnonymousClass0eN.A00(r1, C58705IwE.A01(this, 7));
        this.A04 = AnonymousClass0eN.A00(r1, GJ9.A00);
        this.A09 = new C52106GFa(this);
        this.A08 = new C52107GFb(this);
        if (gDe.A0A == null || (r0 = r3.A02) == null || r0.A1W() == null) {
            ((GFV) gDa.A05.getValue()).A00(GJU.SHOW_AND_HIDE_PREVIEW_COMMENT);
        }
    }

    public final void EJV(GL1 gl1, GYL gyl) {
        boolean A1U = AnonymousClass7TF.A1U(0, gl1, gyl);
        UserSession userSession = this.A02;
        0Tu r4 = 0Tu.A05;
        long A012 = 182.A01(r4, userSession, 36606332681393539L);
        long A013 = 182.A01(r4, userSession, 36606332681328002L);
        if (!gl1.A02) {
            int intValue = gl1.A01.intValue();
            if (intValue == 0) {
                A00(A013, A012);
                gyl.A00(C52206GIx.A02, gl1.A04, A012 + A013);
                return;
            } else if (intValue == A1U) {
                A00(A013, 0);
                gyl.A00(C52206GIx.A02, gl1.A04, A013);
                return;
            } else if (intValue != 2) {
                throw AnonymousClass7TE.A1K();
            }
        }
        gyl.A01(gl1.A04);
    }

    private final void A00(long j, long j2) {
        AnonymousClass3W1 r3 = this.A07;
        if (!r3.A2B || !r3.A29) {
            ((C293435kj) this.A03.getValue()).A01(r3, 0);
            this.A06.A01(r3, 0);
        }
        AnonymousClass0eM r32 = this.A04;
        Runnable runnable = this.A09;
        ((Handler) r32.getValue()).removeCallbacks(runnable);
        Runnable runnable2 = this.A08;
        ((Handler) r32.getValue()).removeCallbacks(runnable2);
        ((Handler) r32.getValue()).postDelayed(runnable, j2);
        ((Handler) r32.getValue()).postDelayed(runnable2, j2 + j);
    }

    public final void Clh() {
        this.A01.ESN(this.A00, false);
    }

    public final void reset() {
        this.A01.ESN(this.A00, false);
        AnonymousClass0eM r2 = this.A04;
        ((Handler) r2.getValue()).removeCallbacks(this.A09);
        ((Handler) r2.getValue()).removeCallbacks(this.A08);
        AnonymousClass3W1 r1 = this.A07;
        ((C293435kj) this.A03.getValue()).A00(r1);
        this.A06.A00(r1);
    }
}
