package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GFc  reason: case insensitive filesystem */
public final class C52108GFc implements JQN {
    public final C267324bN A00;
    public final UserSession A01;
    public final AnonymousClass5FA A02;
    public final GJW A03;
    public final AnonymousClass3W1 A04;
    public final AnonymousClass0eM A05;
    public final long A06;
    public final C52058GDe A07;

    public C52108GFc(C267324bN r7, C52058GDe gDe, UserSession userSession, AnonymousClass3W1 r10, C52054GDa gDa) {
        long j;
        C257913yA r0;
        Integer Aw5;
        0qQ.A0B(userSession, 2);
        this.A01 = userSession;
        this.A00 = r7;
        this.A04 = r10;
        this.A07 = gDe;
        if (!GDZ.A00(r7) || ((gDe.A0W && !182.A06(0Tu.A06, userSession, 36324501222469755L)) || (r0 = r7.A06().A0N) == null || (Aw5 = r0.Aw5()) == null)) {
            j = 0;
        } else {
            j = (long) Aw5.intValue();
        }
        this.A06 = j;
        this.A05 = AnonymousClass0eN.A01(C58705IwE.A01(this, 4));
        this.A02 = AnonymousClass5F9.A00();
        this.A03 = (GJW) GJW.A03.getValue();
        if (j > 0) {
            return;
        }
        if (!r7.A0A || !182.A06(0Tu.A06, userSession, 36319239890672704L)) {
            ((GFV) gDa.A05.getValue()).A00(GJU.MID_SCENE);
        }
    }

    public final void EJV(GL1 gl1, GYL gyl) {
        boolean A1U = AnonymousClass7TF.A1U(0, gl1, gyl);
        if (!gl1.A02) {
            int intValue = gl1.A01.intValue();
            long j = 0;
            if (intValue == 0) {
                j = this.A06;
            } else if (intValue != A1U) {
                if (intValue != 2) {
                    throw AnonymousClass7TE.A1K();
                }
            }
            AnonymousClass3W1 r4 = this.A04;
            if (!r4.A2B || !r4.A29) {
                r4.A0j(true);
                AnonymousClass0eM r1 = this.A05;
                ((C293435kj) r1.getValue()).A00(r4);
                AnonymousClass5FA r3 = this.A02;
                r3.A00(r4);
                this.A03.A01(r4);
                ((C293435kj) r1.getValue()).A01(r4, 0);
                r3.A01(r4, 0);
            }
            this.A03.A00(this.A00, this.A01, r4, j);
            gyl.A00(C52206GIx.A02, gl1.A04, j);
            return;
        }
        gyl.A01(gl1.A04);
    }

    public final void Clh() {
        AnonymousClass3W1 r1 = this.A04;
        if (r1.A0n()) {
            r1.A2J = true;
        }
    }

    public final void reset() {
        AnonymousClass3W1 r1 = this.A04;
        r1.A0j(r1.A0n());
        ((C293435kj) this.A05.getValue()).A00(r1);
        this.A02.A00(r1);
        this.A03.A01(r1);
    }
}
