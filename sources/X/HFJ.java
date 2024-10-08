package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

public final class HFJ extends C230502pj {
    public final 0wc A00;
    public final AnonymousClass4DU A01;
    public final UserSession A02;

    public final void ATF(AnonymousClass30Y r8, C252093oY r9) {
        AnonymousClass7TF.A1H(r8, r9);
        Object obj = r8.A03;
        C18490Vsl vsl = (C18490Vsl) obj;
        String str = vsl.A02;
        AnonymousClass59B r3 = (AnonymousClass59B) AnonymousClass59A.A02.get(str);
        if (r9.CEk(r8) == AnonymousClass05K.A0C) {
            if (r3 != null && (!r3.A01.isEmpty())) {
                0qQ.A06(obj);
                LinkedHashMap A022 = C244083ac.A02(str);
                if (!A022.isEmpty()) {
                    0Aj A0e = AnonymousClass7TE.A0e(this.A00, "ig_rendering_validation_automatic");
                    if (A0e.isSampled()) {
                        C14953UGq uGq = vsl.A00;
                        A0e.AAJ("ad_id", vsl.A01);
                        A0e.AAJ("a_pk", vsl.A04);
                        C51965G9l.A1I(A0e, str);
                        C51965G9l.A1L(A0e, vsl.A03);
                        A0e.AAJ("source_of_action", this.A01.getModuleName());
                        A0e.AAJ("locale", AnonymousClass1Q2.A00());
                        C51974G9v.A0t(A0e, "country", AnonymousClass1Q2.A02().getCountry(), A022);
                        A0e.AAK(uGq, "lead_gen_info");
                        A0e.Cgf();
                    }
                }
            }
            AnonymousClass59A.A03(str);
            return;
        }
        A02(r8, r9, str, false);
    }

    public HFJ(UserSession userSession, AnonymousClass4DU r3) {
        super(userSession);
        this.A02 = userSession;
        this.A01 = r3;
        this.A00 = AnonymousClass0kN.A00(r3, 0kJ.A05, userSession);
    }
}
