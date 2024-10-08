package X;

import com.instagram.api.schemas.OnboardingEntryActionType;
import java.io.IOException;

/* renamed from: X.48x  reason: invalid class name and case insensitive filesystem */
public abstract class C2612648x {
    public static BDp parseFromJson(16F r6) {
        String str;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            OnboardingEntryActionType onboardingEntryActionType = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                r6.A1J();
                if ("action_type".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                    onboardingEntryActionType = (OnboardingEntryActionType) OnboardingEntryActionType.A01.get(str);
                    if (onboardingEntryActionType == null) {
                        onboardingEntryActionType = OnboardingEntryActionType.UNRECOGNIZED;
                    }
                }
                r6.A0z();
            }
            if (onboardingEntryActionType != null || !(r6 instanceof 0c9)) {
                return new BDp(onboardingEntryActionType);
            }
            ((0c9) r6).A03.A00("action_type", "AppreciationOverFlowEntryObjectImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
