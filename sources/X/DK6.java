package X;

import com.instagram.api.schemas.OnboardingEntryPointPriority;

public final class DK6 extends 0Yg implements 0sP {
    public static final DK6 A00 = new DK6();

    public DK6() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = OnboardingEntryPointPriority.A01.get(obj);
        if (obj2 == null) {
            return OnboardingEntryPointPriority.UNRECOGNIZED;
        }
        return obj2;
    }
}
