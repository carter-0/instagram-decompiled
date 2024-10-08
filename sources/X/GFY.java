package X;

import com.instagram.common.session.UserSession;

public final class GFY implements JQN {
    public final AnonymousClass5FA A00;
    public final AnonymousClass3W1 A01;
    public final AnonymousClass0eM A02;
    public final long A03;
    public final C52058GDe A04;

    public GFY(C267324bN r7, C52058GDe gDe, UserSession userSession, AnonymousClass4DU r10, AnonymousClass3W1 r11, C52054GDa gDa) {
        0qQ.A0B(userSession, 2);
        this.A04 = gDe;
        this.A01 = r11;
        AnonymousClass71K r2 = GJ7.A00;
        long A0D = r2.A0D(r7, gDe, userSession) - r2.A0C(r7, gDe, userSession);
        this.A03 = A0D;
        if (!AnonymousClass71K.A02(AnonymousClass5M0.A01(r10), gDe, userSession) && A0D <= 0) {
            GFX.A00(((GFV) gDa.A05.getValue()).A00(GJU.HIGHLIGHT_CTA), gDa);
        }
        this.A02 = AnonymousClass0eN.A01(C58705IwE.A01(userSession, 5));
        this.A00 = AnonymousClass5F9.A00();
    }

    public final void EJV(GL1 gl1, GYL gyl) {
        long j;
        boolean A1U = AnonymousClass7TF.A1U(0, gl1, gyl);
        if (!gl1.A02) {
            int intValue = gl1.A01.intValue();
            if (intValue == 0) {
                j = this.A03;
            } else if (intValue == A1U) {
                j = 0;
            } else if (intValue != 2) {
                throw AnonymousClass7TE.A1K();
            }
            AnonymousClass3W1 r3 = this.A01;
            if (!r3.A2B) {
                ((C293435kj) this.A02.getValue()).A01(r3, j);
            }
            this.A00.A01(r3, j);
            gyl.A00(C52206GIx.A02, gl1.A04, j);
            return;
        }
        gyl.A01(gl1.A04);
    }

    public final void Clh() {
        AnonymousClass3W1 r1 = this.A04.A0E;
        if (r1 != null && r1.A29) {
            r1.A2I = true;
        }
    }

    public final void reset() {
        AnonymousClass3W1 r1 = this.A04.A0E;
        if (r1 != null) {
            ((C293435kj) this.A02.getValue()).A00(r1);
            this.A00.A00(r1);
        }
    }
}
