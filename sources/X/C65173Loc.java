package X;

import com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures;
import com.instagram.common.session.UserSession;

/* renamed from: X.Loc  reason: case insensitive filesystem */
public final class C65173Loc implements C66535MVp {
    public final LPH A00;
    public final UserSession A01;
    public final AnonymousClass0iw A02;

    public final void ChI() {
        UserSession userSession = this.A01;
        JVF.A02(this.A02, userSession, AnonymousClass05K.A0F, AnonymousClass05K.A1F, LPL.A00(userSession));
    }

    public final void CjD() {
        27p.A01(this.A01).A1Y(AnonymousClass80P.ADD_LOCATION);
    }

    public final void CjE() {
        27p.A01(this.A01).A1B(C62674Kka.A03, AnonymousClass80P.ADD_LOCATION);
    }

    public final void CjF() {
        UserSession userSession = this.A01;
        L4H A002 = C63209KtG.A00(userSession);
        A002.A01.flowMarkPoint(A002.A00, "ADD_LOCATION_TOKEN_TAPPED");
        27p.A01(userSession).A1X(AnonymousClass80P.ADD_LOCATION);
    }

    public final void CkC() {
        LPH lph = this.A00;
        Integer num = AnonymousClass05K.A01;
        0Aj A0e = AnonymousClass7TE.A0e(lph.A01, "content_scheduling_cancel");
        if (A0e.isSampled()) {
            LPH.A00(A0e, lph.A00, num);
            A0e.Cgf();
        }
    }

    public final void CkD() {
        27p.A01(this.A01).A1B(C62674Kka.A0A, AnonymousClass80P.CONTENT_SCHEDULING);
        LPH lph = this.A00;
        Integer num = AnonymousClass05K.A01;
        lph.A08(num, num);
    }

    public final void CkE(NonSupportedContentSchedulingFeatures nonSupportedContentSchedulingFeatures) {
        if (nonSupportedContentSchedulingFeatures != null) {
            C319116q4.A05(this.A00, nonSupportedContentSchedulingFeatures);
        }
        LPH lph = this.A00;
        C59722JVg jVg = C59722JVg.REELS_ADVANCED_SETTINGS;
        lph.A03(jVg);
        lph.A01(jVg);
    }

    public final void CkF() {
        this.A00.A02(C59722JVg.REELS_ADVANCED_SETTINGS);
    }

    public final void CkG() {
        LPH lph = this.A00;
        Integer num = AnonymousClass05K.A01;
        lph.A06(num);
        lph.A07(num);
    }

    public C65173Loc(LPH lph, AnonymousClass0iw r2, UserSession userSession) {
        AnonymousClass7TG.A1U(userSession, r2, lph);
        this.A01 = userSession;
        this.A02 = r2;
        this.A00 = lph;
    }
}
