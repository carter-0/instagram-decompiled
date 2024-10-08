package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.OnboardingEntryActionType;
import java.util.LinkedHashMap;

/* renamed from: X.3cl  reason: invalid class name and case insensitive filesystem */
public final class C245363cl extends AnonymousClass0T0 implements C245373cm {
    public final OnboardingEntryActionType A00;

    public C245363cl(OnboardingEntryActionType onboardingEntryActionType) {
        0qQ.A0B(onboardingEntryActionType, 1);
        this.A00 = onboardingEntryActionType;
    }

    public final C245363cl F0S() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C245363cl) && this.A00 == ((C245363cl) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final OnboardingEntryActionType AYX() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (AYX() != null) {
            OnboardingEntryActionType AYX = AYX();
            0qQ.A0B(AYX, 0);
            linkedHashMap.put("action_type", AYX.A00);
        }
        return new TreeUpdaterJNI("XDTAppreciationCommentEntryObject", 0Yt.A0B(linkedHashMap));
    }
}
