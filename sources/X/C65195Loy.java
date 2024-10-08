package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Loy  reason: case insensitive filesystem */
public final class C65195Loy implements MVS {
    public C60056JeO A00;
    public final KOX A01;
    public final C66576MXh A02;
    public final C62674Kka A03 = C62674Kka.A07;
    public final AnonymousClass80P A04 = AnonymousClass80P.AUDIENCE_CONTROL;
    public final AnonymousClass4DH A05;
    public final UserSession A06;

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        C60056JeO jeO = new C60056JeO(this.A05, this.A06, this.A01, this.A02);
        JTS.A0x(jeO);
        this.A00 = jeO;
        jeO.A00.A00();
        C60056JeO jeO2 = this.A00;
        if (jeO2 != null) {
            return jeO2;
        }
        0qQ.A0F("audienceRow");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62674Kka B1s() {
        return this.A03;
    }

    public final AnonymousClass80P BHl() {
        return this.A04;
    }

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A05;
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 25), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public C65195Loy(AnonymousClass4DH r2, UserSession userSession, KOX kox, C66576MXh mXh) {
        C51974G9v.A1L(r2, userSession, mXh);
        this.A05 = r2;
        this.A06 = userSession;
        this.A01 = kox;
        this.A02 = mXh;
    }
}
