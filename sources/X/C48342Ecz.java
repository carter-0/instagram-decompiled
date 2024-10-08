package X;

import com.instagram.api.schemas.PartnerProgramOnboardingSteps;
import java.io.IOException;

/* renamed from: X.Ecz  reason: case insensitive filesystem */
public abstract class C48342Ecz {
    public static C47208Dsv parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Integer num = null;
            PartnerProgramOnboardingSteps partnerProgramOnboardingSteps = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("index".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r8);
                } else if ("step".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    partnerProgramOnboardingSteps = (PartnerProgramOnboardingSteps) PartnerProgramOnboardingSteps.A01.get(str);
                    if (partnerProgramOnboardingSteps == null) {
                        partnerProgramOnboardingSteps = PartnerProgramOnboardingSteps.UNRECOGNIZED;
                    }
                }
                r8.A0z();
            }
            if (num == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("index", r8, "MonetizationProductOnboardingNextStepInfoImpl");
            } else if (partnerProgramOnboardingSteps != null || !(r8 instanceof 0c9)) {
                return new C47208Dsv(partnerProgramOnboardingSteps, num.intValue());
            } else {
                AnonymousClass7TF.A1L("step", r8, "MonetizationProductOnboardingNextStepInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
