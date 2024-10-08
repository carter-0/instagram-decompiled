package X;

import com.instagram.common.session.UserSession;

public final class GFW implements JQN {
    public final UserSession A00;
    public final AnonymousClass0eM A01;
    public final long A02;
    public final C52058GDe A03;
    public final AnonymousClass3W1 A04;

    public GFW(C267324bN r6, C52058GDe gDe, UserSession userSession, AnonymousClass3W1 r9, C52054GDa gDa) {
        0qQ.A0B(userSession, 2);
        this.A00 = userSession;
        this.A03 = gDe;
        this.A04 = r9;
        long A0C = GJ7.A00.A0C(r6, gDe, userSession);
        this.A02 = A0C;
        if (A0C <= 0) {
            GFX.A00(((GFV) gDa.A05.getValue()).A00(GJU.SHOW_CTA), gDa);
        }
        this.A01 = AnonymousClass0eN.A01(C58705IwE.A01(this, 6));
    }

    public final void EJV(GL1 gl1, GYL gyl) {
        boolean A1U = AnonymousClass7TF.A1U(0, gl1, gyl);
        if (!gl1.A02) {
            int intValue = gl1.A01.intValue();
            if (intValue == 0) {
                AnonymousClass3W1 r0 = this.A04;
                long j = this.A02;
                ((C293435kj) this.A01.getValue()).A01(r0, j);
                gyl.A00(C52206GIx.A02, gl1.A04, j);
                return;
            } else if (intValue == A1U) {
                ((C293435kj) this.A01.getValue()).A01(this.A04, 0);
            } else if (intValue != 2) {
                throw AnonymousClass7TE.A1K();
            }
        }
        gyl.A01(gl1.A04);
    }

    public final void Clh() {
        AnonymousClass3W1 r1 = this.A03.A0E;
        if (r1 != null && r1.A2B) {
            r1.A2K = true;
        }
    }

    public final void reset() {
        AnonymousClass3W1 r1 = this.A03.A0E;
        if (r1 != null) {
            ((C293435kj) this.A01.getValue()).A00(r1);
        }
    }
}
