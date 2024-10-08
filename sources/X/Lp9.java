package X;

import android.view.View;
import com.instagram.common.session.UserSession;

public final class Lp9 implements MVS {
    public C60057JeP A00;
    public final UserSession A01;
    public final C63630L0s A02;
    public final C61846KOl A03;
    public final C62674Kka A04 = C62674Kka.A07;
    public final AnonymousClass80P A05 = AnonymousClass80P.AUDIENCE_CONTROL;
    public final AnonymousClass4DH A06;
    public final C66576MXh A07;

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        UserSession userSession = this.A01;
        C60057JeP jeP = new C60057JeP(this.A06, userSession, this.A07, this.A03);
        JTS.A0x(jeP);
        this.A00 = jeP;
        jeP.A00.A00();
        C60057JeP jeP2 = this.A00;
        if (jeP2 != null) {
            return jeP2;
        }
        0qQ.A0F("audienceRow");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62674Kka B1s() {
        return this.A04;
    }

    public final AnonymousClass80P BHl() {
        return this.A05;
    }

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A06;
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 18), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public Lp9(AnonymousClass4DH r2, UserSession userSession, C63630L0s l0s, C66576MXh mXh, C61846KOl kOl) {
        C51972G9s.A1B(r2, mXh);
        this.A06 = r2;
        this.A01 = userSession;
        this.A03 = kOl;
        this.A07 = mXh;
        this.A02 = l0s;
    }
}
