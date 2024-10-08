package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.OnboardingEntryActionType;
import java.util.LinkedHashMap;

public final class BDp extends AnonymousClass0T0 implements AnonymousClass5AT {
    public final OnboardingEntryActionType A00;

    public BDp(OnboardingEntryActionType onboardingEntryActionType) {
        0qQ.A0B(onboardingEntryActionType, 1);
        this.A00 = onboardingEntryActionType;
    }

    public final BDp F0U() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BDp) && this.A00 == ((BDp) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final OnboardingEntryActionType AYX() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        if (AYX() != null) {
            C41846B3n.A1I(AYX(), A0t);
        }
        return C41845B3m.A0T("XDTAppreciationOverFlowEntryObject", 0Yt.A0B(A0t));
    }
}
