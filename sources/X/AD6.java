package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class AD6 {
    public final AnonymousClass0JP A00;
    public final C258903zp A01;
    public final AnonymousClass94X A02;
    public final C293475kn A03;
    public final UserSession A04;

    public static final void A00(AD6 ad6, String str, HashMap hashMap, boolean z) {
        C60400gq r3 = ad6.A03.A00;
        if (r3 != null && r3.Agw(36325772533118180L)) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(ad6.A04), "dcp_prediction_score");
            if (A0e.isSampled()) {
                A0e.A7p("is_success", Boolean.valueOf(z));
                A0e.AAJ(TraceFieldType.FailureReason, str);
                A0e.AAJ("features", hashMap.toString());
                A0e.AAJ("model_name", "odml_swipe_up");
                A0e.Cgf();
            }
        }
    }

    public AD6(AnonymousClass0JP r2, C258903zp r3, AnonymousClass94X r4, UserSession userSession, C293475kn r6) {
        AnonymousClass7TG.A1U(r2, r6, r4);
        0qQ.A0B(userSession, 5);
        this.A00 = r2;
        this.A03 = r6;
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = userSession;
    }
}
