package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GEu  reason: case insensitive filesystem */
public final class C52100GEu implements JQS {
    public GKI A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final AnonymousClass93U A03;

    public final void DVm(C52087GEh gEh, C267324bN r15, int i) {
        0qQ.A0B(gEh, 1);
        AnonymousClass0iw r4 = this.A01;
        UserSession userSession = this.A02;
        AnonymousClass93U r6 = this.A03;
        long j = gEh.A01;
        C52236GKd gKd = C52236GKd.A10;
        C52086GEg.A05(AnonymousClass5OC.ATTRIBUTE_PILLS, gKd, (GJB) gEh.A03, r4, userSession, r6, 2, (Long) gEh.A02, (Long) gEh.A04, i, j);
    }

    public final void DVl(C52088GEi gEi, C267324bN r19, C52058GDe gDe, int i, int i2, boolean z) {
        GKI gki;
        C267324bN r1 = r19;
        C52058GDe gDe2 = gDe;
        AnonymousClass7TG.A1N(r1, gDe2);
        C52088GEi gEi2 = gEi;
        0qQ.A0B(gEi2, 2);
        1Xj r0 = r1.A02;
        if (r0 != null) {
            AnonymousClass0iw r7 = this.A01;
            UserSession userSession = this.A02;
            AnonymousClass93U r9 = this.A03;
            long j = gEi2.A01;
            String str = gEi2.A04;
            C52236GKd gKd = C52236GKd.A10;
            int i3 = i;
            C52086GEg.A07(AnonymousClass5OC.ATTRIBUTE_PILLS, gKd, r7, userSession, r9, 2, (Long) gEi2.A02, (Long) gEi2.A03, str, i3, j);
            if (z && (gki = this.A00) != null) {
                1Xj r6 = r0;
                C52058GDe gDe3 = gDe2;
                C267324bN r4 = r1;
                gki.A00.A01(r4, gDe3, r6, i3, !r1.CcK());
            }
        }
    }

    public /* synthetic */ C52100GEu(AnonymousClass0iw r3, UserSession userSession) {
        AnonymousClass93T A002 = AnonymousClass93S.A00(userSession);
        0qQ.A0B(A002, 3);
        this.A02 = userSession;
        this.A01 = r3;
        this.A03 = A002;
    }

    public final void Eba(GKI gki) {
        this.A00 = gki;
    }
}
