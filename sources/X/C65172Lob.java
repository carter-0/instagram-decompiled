package X;

import com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lob  reason: case insensitive filesystem */
public final class C65172Lob implements C66535MVp {
    public final LPH A00;
    public final UserSession A01;

    public C65172Lob(LPH lph, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = lph;
    }

    public final void ChI() {
    }

    public final void CjE() {
    }

    public final void CjD() {
        UserSession userSession = this.A01;
        C59847JaN.A00(userSession).A04("LOCATION_REMOVED");
        27p.A01(userSession).A1Y(AnonymousClass80P.ADD_LOCATION);
    }

    public final void CkC() {
        LPH lph = this.A00;
        Integer num = AnonymousClass05K.A00;
        0Aj A0e = AnonymousClass7TE.A0e(lph.A01, "content_scheduling_cancel");
        if (A0e.isSampled()) {
            LPH.A00(A0e, lph.A00, num);
            A0e.Cgf();
        }
    }

    public final void CkD() {
        27p.A01(this.A01).A1X(AnonymousClass80P.CONTENT_SCHEDULING);
        this.A00.A08(AnonymousClass05K.A00, AnonymousClass05K.A01);
    }

    public final void CkE(NonSupportedContentSchedulingFeatures nonSupportedContentSchedulingFeatures) {
        LPH lph = this.A00;
        C59722JVg jVg = C59722JVg.POST_ADVANCED_SETTINGS;
        lph.A03(jVg);
        lph.A01(jVg);
    }

    public final void CkF() {
        this.A00.A02(C59722JVg.POST_ADVANCED_SETTINGS);
    }

    public final void CkG() {
        LPH lph = this.A00;
        Integer num = AnonymousClass05K.A00;
        lph.A06(num);
        lph.A07(num);
    }

    public final void CjF() {
        AnonymousClass6SR.A01().A0O = true;
        UserSession userSession = this.A01;
        C59847JaN.A00(userSession).A04("LOCATION_TOKEN_TAPPED");
        C59847JaN.A00(userSession).A04("LOCATION_SAVED");
    }
}
