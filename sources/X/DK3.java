package X;

import com.instagram.api.schemas.OnboardingEntryActionType;

public final class DK3 extends 0Yg implements 0sP {
    public static final DK3 A00 = new DK3();

    public DK3() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = OnboardingEntryActionType.A01.get(obj);
        if (obj2 == null) {
            return OnboardingEntryActionType.UNRECOGNIZED;
        }
        return obj2;
    }
}
