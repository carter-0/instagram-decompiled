package X;

import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.upsell.data.CLNoticeRepository;

/* renamed from: X.Jh6  reason: case insensitive filesystem */
public final class C60187Jh6 extends 2YL {
    public boolean A00;
    public final 2Fk A01;
    public final C368378sW A02;
    public final CLNoticeRepository A03;
    public final 05G A04;
    public final AnonymousClass0Ud A05;
    public final UserSession A06;

    public C60187Jh6(UserSession userSession, C368378sW r8, CLNoticeRepository cLNoticeRepository, String str) {
        Object obj;
        AnonymousClass7TF.A1C(userSession, 1, r8);
        this.A06 = userSession;
        this.A03 = cLNoticeRepository;
        this.A02 = r8;
        02z A012 = 106.A01(KP5.A00);
        this.A04 = A012;
        this.A05 = A012;
        C61860pz A1I = JTO.A1I(new C66162MFz(1, (AnonymousClass4D7) null), A012);
        19B r3 = 19B.A00;
        this.A01 = C226292g8.A00(r3, A1I);
        if (LTW.A06(userSession)) {
            obj = KP6.A00;
        } else if (2R8.A06(AnonymousClass7TF.A0Q(userSession)) && 0qQ.A0K(str, "original") && AnonymousClass7TE.A0q(userSession).getInt(AnonymousClass000.A00(2798), 0) < 1 && AnonymousClass8IK.A02(userSession)) {
            obj = KP4.A00;
        } else if (cLNoticeRepository != null) {
            MH9.A03(this, r3, C318116oQ.A00(this), 49);
            1Eo.A05(r3, new MG4(cLNoticeRepository, (AnonymousClass4D7) null, 33), cLNoticeRepository.A01);
            return;
        } else {
            return;
        }
        if (!(obj instanceof KP5)) {
            if (!this.A00) {
                this.A00 = true;
            } else {
                return;
            }
        }
        do {
        } while (!JTP.A1b(obj, this.A04));
    }
}
