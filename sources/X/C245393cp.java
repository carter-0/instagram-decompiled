package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.OnboardingEntryActionType;
import com.instagram.api.schemas.OnboardingEntryPointPriority;

/* renamed from: X.3cp  reason: invalid class name and case insensitive filesystem */
public final class C245393cp extends AnonymousClass0T0 implements C245403cq {
    public final OnboardingEntryActionType A00;
    public final OnboardingEntryPointPriority A01;

    public C245393cp(OnboardingEntryActionType onboardingEntryActionType, OnboardingEntryPointPriority onboardingEntryPointPriority) {
        0qQ.A0B(onboardingEntryActionType, 1);
        0qQ.A0B(onboardingEntryPointPriority, 2);
        this.A00 = onboardingEntryActionType;
        this.A01 = onboardingEntryPointPriority;
    }

    public final C245393cp F0V() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C245393cp) {
                C245393cp r5 = (C245393cp) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final OnboardingEntryActionType AYX() {
        return this.A00;
    }

    public final OnboardingEntryPointPriority Bfg() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAppreciationPillEntryObject", B4Z.A00(this));
    }
}
