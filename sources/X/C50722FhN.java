package X;

import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.supervisionupsells.constants.IGSupervisionUpsellEligibilityStatus;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.FhN  reason: case insensitive filesystem */
public final class C50722FhN implements AnonymousClass5IX {
    public final UserSession A00;
    public final List A01;

    public final boolean E1z(AnonymousClass5IY r9) {
        IGSupervisionUpsellEligibilityStatus iGSupervisionUpsellEligibilityStatus;
        0qQ.A0B(r9, 0);
        UserSession userSession = this.A00;
        LinkedHashMap A03 = 0Yt.A03(1Au.A00(userSession).A0F());
        boolean z = false;
        for (Object next : this.A01) {
            if (A03.containsKey(next) && (iGSupervisionUpsellEligibilityStatus = (IGSupervisionUpsellEligibilityStatus) A03.get(next)) != null && iGSupervisionUpsellEligibilityStatus.A00) {
                0wc A02 = AnonymousClass0kN.A02(userSession);
                String str = r9.A01;
                0qQ.A0B(next, 1);
                LinkedHashMap A0p = DbY.A0p("promotion_id", str, AnonymousClass7TE.A1L("eligibility", next));
                1Ln A0I = DbZ.A0I(A02, "ig_user_passes_supervision_upsell_eligibility_check");
                A0I.A0x(A0p);
                A0I.Cgf();
                z = true;
            }
        }
        return z;
    }

    public C50722FhN(UserSession userSession, List list) {
        this.A00 = userSession;
        this.A01 = list;
    }
}
