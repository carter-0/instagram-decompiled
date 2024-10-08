package X;

import com.instagram.common.session.UserSession;

public final class GB5 extends C230372pW {
    public final UserSession A00;
    public final C232852uY A01;
    public final AnonymousClass4DU A02;
    public final AnonymousClass0eM A03 = C58715IwO.A00(this, 0eO.A02, 41);

    public GB5(UserSession userSession, AnonymousClass4DU r5) {
        super(1Bk.A03.A01(new AnonymousClass2z0(userSession, "clips_viewer_qp")));
        this.A02 = r5;
        this.A00 = userSession;
        this.A01 = new C232852uY(userSession, (C249763kK) null);
    }

    private final void A00(C267324bN r6) {
        String id;
        C67231sQ A0n;
        C270554gv BXd;
        1Xj r0 = r6.A02;
        if (r0 != null && (id = r0.getId()) != null && (A0n = C51966G9m.A0n(r0)) != null && (BXd = A0n.BXd()) != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this.A02, this.A00), "instagram_new_reels_impression");
            A0e.A9F("qp_id", Long.valueOf(BXd.BiS()));
            C51965G9l.A1I(A0e, id);
            A0e.Cgf();
        }
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        1Xj r9;
        AnonymousClass3W1 r11;
        C267324bN r4 = (C267324bN) obj;
        C52058GDe gDe = (C52058GDe) obj2;
        AnonymousClass7TF.A1H(r4, gDe);
        if (r4.A01 == C295365o2.QP && (r9 = r4.A02) != null && (r11 = gDe.A0E) != null) {
            UserSession userSession = this.A00;
            if (AnonymousClass7TF.A0R(0Tu.A06, userSession, 36330067499958708L).booleanValue()) {
                I3O.A00(userSession).A01(r4, (Long) null, gDe.A09());
            }
            int position = r11.getPosition();
            int i = r11.A03;
            AnonymousClass4DU r10 = this.A02;
            C254433sT.A01(userSession, this.A01, r9, r10, r11, (Boolean) null, (Boolean) null, (Boolean) null, position, i);
            A00(r4);
            C3728893a A0p = C51965G9l.A0p(this.A03);
            if (A0p != null) {
                C52058GDe.A06(r4, gDe, r10, A0p, false);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        1Xj r5;
        AnonymousClass3W1 r0;
        C267324bN r12 = (C267324bN) obj;
        C52058GDe gDe = (C52058GDe) obj2;
        boolean A1Z = AnonymousClass7TG.A1Z(r12, gDe);
        if (r12.A01 == C295365o2.QP && (r5 = r12.A02) != null && (r0 = gDe.A0E) != null) {
            UserSession userSession = this.A00;
            int position = r0.getPosition();
            int i = r0.A03;
            AnonymousClass4DU r6 = this.A02;
            C254433sT.A02(userSession, this.A01, r5, r6, (Boolean) null, (Boolean) null, position, i);
            A00(r12);
            C3728893a A0p = C51965G9l.A0p(this.A03);
            if (A0p != null) {
                C52058GDe.A06(r12, gDe, r6, A0p, A1Z);
            }
        }
    }
}
