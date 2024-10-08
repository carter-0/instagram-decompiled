package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LbY  reason: case insensitive filesystem */
public final class C64417LbY implements AnonymousClass94T {
    public C12159SoA A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A00(0eO.A04, new C13350TVx(this, 13));
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;

    public C64417LbY(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        0eO r2 = 0eO.A02;
        this.A04 = AnonymousClass0eN.A00(r2, new C13350TVx(this, 15));
        this.A03 = AnonymousClass0eN.A00(r2, new C13350TVx(this, 14));
    }

    public final void cleanup() {
        this.A00 = null;
    }

    public final void CN8() {
        C60400gq r2;
        AnonymousClass0eM r7 = this.A04;
        if (((C71741Oq1) r7.getValue()).CZg()) {
            UserSession userSession = this.A01;
            C258993zy r5 = new C258993zy(C51965G9l.A0l(), 1028142044);
            r5.A00();
            AnonymousClass40G A012 = new SGd(userSession).A01(r5, (C71741Oq1) r7.getValue(), (C258743zZ) this.A03.getValue());
            boolean z = A012.A02;
            if (z) {
                Object obj = A012.A00;
                if (obj != null) {
                    this.A00 = (C12159SoA) obj;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            C60400gq r22 = ((C71741Oq1) r7.getValue()).A00;
            if ((r22 != null && r22.Agw(2342166844717215288L)) || ((r2 = ((C71741Oq1) r7.getValue()).A00) != null && r2.Agw(36323835503455799L))) {
                ((C64416LbX) this.A02.getValue()).CN8();
            }
            r5.A04(z, A012.A01);
        }
    }
}
