package X;

import com.instagram.schools.management.data.UserSchoolEligibilityResponseImpl;

public final class DFI implements AnonymousClass2Kv {
    public final /* synthetic */ 0sP A00;

    public DFI(0sP r1) {
        this.A00 = r1;
    }

    public final void invoke(AnonymousClass3JD r6) {
        0sP r1;
        EVR evr;
        C250663lr A0U;
        if (!(r6 == null || (A0U = C41845B3m.A0U(r6)) == null)) {
            C254573sh r0 = C250663lr.Companion;
            C250663lr A03 = A0U.A03(UserSchoolEligibilityResponseImpl.XdtUserSchoolEligibility.class, "xdt_user_school_eligibility(input:$input)", -505317559);
            if (A03 != null) {
                if (!A03.getCoercedBooleanField(1, "user_eligibility_status")) {
                    r1 = this.A00;
                    evr = EVR.INELIGIBLE;
                } else if (A03.getCoercedIntField(0, "user_verification_status") == 1 || A03.getCoercedIntField(0, "user_verification_status") == 4) {
                    r1 = this.A00;
                    evr = EVR.ALREADY_JOINED;
                }
                r1.invoke(evr);
            }
        }
        r1 = this.A00;
        evr = EVR.ELIGIBLE;
        r1.invoke(evr);
    }
}
