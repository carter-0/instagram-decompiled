package X;

import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.supervisionupsells.constants.IGSupervisionUpsellEligibilityStatus;
import java.util.HashMap;

/* renamed from: X.EiQ  reason: case insensitive filesystem */
public abstract class C48679EiQ {
    public static final Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        boolean A01 = Q0A.A01(r7.A01());
        String str = (String) DbW.A0d(r7);
        UserSession A0Z = DbT.A0Z(r6);
        try {
            EV4.valueOf(str);
            HashMap A0F = 1Au.A00(A0Z).A0F();
            A0F.put(str, new IGSupervisionUpsellEligibilityStatus(A01));
            1Au.A00(A0Z).A17(A0F);
            return null;
        } catch (IllegalArgumentException unused) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Invalid eligibilityType - must be one of ");
            0wb.A03("IGBloksActionWellbeingSetSupervisionUpsellEligibilityImpl", AnonymousClass7TF.A0i(EV4.values(), A1A));
            return null;
        }
    }
}
