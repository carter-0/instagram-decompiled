package X;

import com.instagram.api.schemas.OnboardingEntryActionType;
import com.instagram.api.schemas.OnboardingEntryPointPriority;
import java.io.IOException;

/* renamed from: X.3cn  reason: invalid class name and case insensitive filesystem */
public abstract class C245383cn {
    public static C245393cp parseFromJson(16F r8) {
        String str;
        String str2;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            OnboardingEntryActionType onboardingEntryActionType = null;
            OnboardingEntryPointPriority onboardingEntryPointPriority = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("action_type".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                    onboardingEntryActionType = (OnboardingEntryActionType) OnboardingEntryActionType.A01.get(str2);
                    if (onboardingEntryActionType == null) {
                        onboardingEntryActionType = OnboardingEntryActionType.UNRECOGNIZED;
                    }
                } else if ("priority".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    onboardingEntryPointPriority = (OnboardingEntryPointPriority) OnboardingEntryPointPriority.A01.get(str);
                    if (onboardingEntryPointPriority == null) {
                        onboardingEntryPointPriority = OnboardingEntryPointPriority.UNRECOGNIZED;
                    }
                }
                r8.A0z();
            }
            if (onboardingEntryActionType == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("action_type", "AppreciationPillEntryObjectImpl");
            } else if (onboardingEntryPointPriority != null || !(r8 instanceof 0c9)) {
                return new C245393cp(onboardingEntryActionType, onboardingEntryPointPriority);
            } else {
                ((0c9) r8).A03.A00("priority", "AppreciationPillEntryObjectImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
