package X;

import com.instagram.common.session.UserSession;

public final class GC6 extends C230372pW {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final C231002qi A02;
    public final AnonymousClass0eM A03 = C58715IwO.A00(this, 0eO.A02, 42);

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C267324bN r4 = (C267324bN) obj;
        C52058GDe gDe = (C52058GDe) obj2;
        AnonymousClass7TF.A1H(r4, gDe);
        if (r4.A01 == C295365o2.QPMIDCARD) {
            C267334bO r1 = r4.A0G;
            0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.clips.model.QPMidcardImpressionItem");
            this.A02.DbK(((C57029ILv) r1).A00);
            C3728893a A0p = C51965G9l.A0p(this.A03);
            if (A0p != null) {
                C52058GDe.A06(r4, gDe, this.A01, A0p, false);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C267324bN r4 = (C267324bN) obj;
        C52058GDe gDe = (C52058GDe) obj2;
        boolean A1Z = AnonymousClass7TG.A1Z(r4, gDe);
        C3728893a A0p = C51965G9l.A0p(this.A03);
        if (A0p != null) {
            C52058GDe.A06(r4, gDe, this.A01, A0p, A1Z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GC6(UserSession userSession, AnonymousClass4DU r5, C231002qi r6) {
        super(1Bk.A03.A01(new AnonymousClass2z0(userSession, "clips_viewer_qp")));
        AnonymousClass7TG.A1U(r6, r5, userSession);
        this.A02 = r6;
        this.A01 = r5;
        this.A00 = userSession;
    }
}
