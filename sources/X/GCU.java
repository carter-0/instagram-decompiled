package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.common.session.UserSession;

public final class GCU implements JR1 {
    public final 1wn A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final AnonymousClass93U A03;
    public final FragmentActivity A04;
    public final GCT A05;
    public final JR1 A06;

    public final void A00(AnonymousClass5OB r13, C267324bN r14, C52058GDe gDe) {
        C51973G9u.A1E(r14, gDe, r13);
        GCT gct = this.A05;
        FragmentActivity fragmentActivity = this.A04;
        Integer A052 = C52058GDe.A05(gDe);
        gct.A00(fragmentActivity, AnonymousClass5OB.COMMENT_BUTTON, r14, gDe, new C57373IZe(4, r14, this), A052, (String) null, false, false, false);
    }

    public final void A01(AnonymousClass5OB r18, C267324bN r19, C52058GDe gDe, String str, boolean z) {
        C267324bN r9 = r19;
        0qQ.A0B(r9, 0);
        AnonymousClass5OB r8 = r18;
        C52058GDe gDe2 = gDe;
        C51972G9s.A1B(gDe2, r8);
        if (r9.A01 != C295365o2.AD_PREVIEW) {
            UserSession userSession = this.A01;
            AnonymousClass1Nd.A00(userSession).A01(this.A00, AnonymousClass3KV.class);
            this.A05.A00(this.A04, r8, r9, gDe2, new FmB(2, r9, this, gDe2), C52058GDe.A05(gDe2), str, false, false, z);
            1Xj r1 = r9.A02;
            if (r1 != null) {
                GLB.A00(MusicPageTabType.CLIPS, userSession).A01(C51966G9m.A0n(r1), userSession, "open_comments", this.A02.getModuleName());
            }
        }
    }

    public final boolean CRr(C267324bN r2) {
        0qQ.A0B(r2, 0);
        return this.A06.CRr(r2);
    }

    public final boolean CRs(C267324bN r2) {
        0qQ.A0B(r2, 0);
        return this.A06.CRs(r2);
    }

    public final void AGC(C267324bN r2, C52318GNk gNk, C52317GNj gNj) {
        this.A06.AGC(r2, gNk, gNj);
    }

    public final long BXX() {
        return this.A06.BXX();
    }

    public final void Cmm(C267324bN r2) {
        this.A06.Cmm(r2);
    }

    public final void EI8() {
        this.A06.EI8();
    }

    public GCU(FragmentActivity fragmentActivity, 1wn r2, UserSession userSession, AnonymousClass4DU r4, AnonymousClass93U r5, GCT gct, JR1 jr1) {
        AnonymousClass7TG.A1P(userSession, r4);
        AnonymousClass7TG.A1S(r5, gct);
        this.A01 = userSession;
        this.A04 = fragmentActivity;
        this.A02 = r4;
        this.A06 = jr1;
        this.A03 = r5;
        this.A05 = gct;
        this.A00 = r2;
    }
}
