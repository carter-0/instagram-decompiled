package X;

import com.instagram.api.schemas.OnboardingEntryActionType;

public final class DK4 extends 0Yg implements 0sP {
    public static final DK4 A00 = new DK4();

    public DK4() {
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
