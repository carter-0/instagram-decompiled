package X;

import com.instagram.common.session.UserSession;

public final class GB2 extends C230372pW {
    public final AnonymousClass07V A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final AnonymousClass0eM A03 = C58715IwO.A00(this, 0eO.A02, 36);

    public GB2(AnonymousClass07V r3, UserSession userSession, AnonymousClass4DU r5) {
        super(C51969G9p.A0i(1Bk.A03, userSession, "clips_viewer_halfcard"));
        this.A00 = r3;
        this.A01 = userSession;
        this.A02 = r5;
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C267324bN r7 = (C267324bN) obj;
        C52058GDe gDe = (C52058GDe) obj2;
        AnonymousClass7TF.A1H(r7, gDe);
        C58099ImL.A01(this, C71772f0.A00(this.A00), 32);
        UserSession userSession = this.A01;
        if (AnonymousClass7TF.A0R(0Tu.A06, userSession, 36330067499958708L).booleanValue()) {
            I3O.A00(userSession).A01(r7, (Long) null, gDe.A09());
        }
        C3728893a A0p = C51965G9l.A0p(this.A03);
        if (A0p != null) {
            C52058GDe.A06(r7, gDe, this.A02, A0p, false);
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C267324bN r4 = (C267324bN) obj;
        C52058GDe gDe = (C52058GDe) obj2;
        boolean A1Z = AnonymousClass7TG.A1Z(r4, gDe);
        C3728893a A0p = C51965G9l.A0p(this.A03);
        if (A0p != null) {
            C52058GDe.A06(r4, gDe, this.A02, A0p, A1Z);
        }
    }
}
