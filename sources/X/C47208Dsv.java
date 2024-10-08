package X;

import com.instagram.api.schemas.PartnerProgramOnboardingSteps;

/* renamed from: X.Dsv  reason: case insensitive filesystem */
public final class C47208Dsv extends AnonymousClass0T0 implements DRG {
    public final int A00;
    public final PartnerProgramOnboardingSteps A01;

    public C47208Dsv(PartnerProgramOnboardingSteps partnerProgramOnboardingSteps, int i) {
        0qQ.A0B(partnerProgramOnboardingSteps, 2);
        this.A00 = i;
        this.A01 = partnerProgramOnboardingSteps;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47208Dsv) {
                C47208Dsv dsv = (C47208Dsv) obj;
                if (!(this.A00 == dsv.A00 && this.A01 == dsv.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, this.A00 * 31);
    }
}
